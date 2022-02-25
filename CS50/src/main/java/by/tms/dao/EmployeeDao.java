package by.tms.dao;

import by.tms.entity.Employee;
import by.tms.entity.Payment;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EmployeeDao {

    private static final EmployeeDao INSTANCE = new EmployeeDao();

    public static EmployeeDao getInstance() {
        return INSTANCE;
    }

    /**
     * Возвращает всех сотрудников
     */
    public List<Employee> findAll(Session session) {
        return session.createQuery("from Employee e", Employee.class).getResultList();
    }

    /**
     * Возвращает всех сотрудников с указанным именем
     */
    public List<Employee> findAllByFirstName(Session session, String firstName) {
        String hql = "from Employee e " +
                "where e.firstName = :f_name";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("f_name", firstName);
        return query.getResultList();
    }

    /**
     * Возвращает первые {limit} сотрудников, упорядоченных по дате рождения (в порядке возрастания)
     */
    public List<Employee> findLimitedEmployeesOrderedByBirthday(Session session, int limit) {
        String hql = "from Employee e " +
                "order by e.birthday";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    /**
     * Возвращает всех сотрудников организации с указанным названием
     */
    public List<Employee> findAllByOrganizationName(Session session, String organizationName) {
        String hql = "select e from Employee e " +
                "join e.organization o " +
                "where o.name = :organization";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("organization", organizationName);
        return query.getResultList();
    }

    /**
     * Возвращает все выплаты, полученные сотрудниками организации с указанными именем,
     * упорядоченные по имени сотрудника, а затем по размеру выплаты
     */
    public List<Payment> findAllPaymentsByOrganizationName(Session session, String organizationName) {
        String hql = "select p from Payment p join p.receiver rec " +
                "where rec.organization.name = :organization " +
                "order by p.receiver.firstName, p.amount";
        Query<Payment> query = session.createQuery(hql, Payment.class);
        query.setParameter("organization", organizationName);
        return query.getResultList();
    }

    /**
     * Возвращает среднюю зарплату сотрудника с указанными именем и фамилией
     */
    public Double findAveragePaymentAmountByFirstAndLastNames(Session session, String firstName, String lastName) {
        String hql = "select avg(p.amount) from Payment p " +
                "join p.receiver rec " +
                "where rec.firstName = :f_name and rec.lastName = :l_name";
        Query<Double> query = session.createQuery(hql, Double.class);
        query.setParameter("f_name", firstName);
        query.setParameter("l_name", lastName);
        return query.getSingleResult();
    }

    /**
     * Возвращает для каждой организации: название, среднюю зарплату всех её сотрудников. Организации упорядочены по названию.
     */
    public List<Object[]> findOrganizationNamesWithAvgEmployeePaymentsOrderedByOrgName(Session session) {
        String hql = "select e.organization.name as org_name, avg(p.amount) " +
                "from Employee e " +
                "join e.payments p " +
                "group by org_name order by org_name";
        return session.createQuery(hql, Object[].class).getResultList();
    }

    /**
     * Возвращает список: сотрудник (объект Employee), средний размер выплат, но только для тех сотрудников, чей средний размер выплат
     * больше среднего размера выплат всех сотрудников
     * Упорядочить по имени сотрудника
     */
    public List<Object[]> canYouDoIt(Session session) {
        String hql = "select p.receiver, avg(rec.amount) " +
                "from Payment p " +
                "join p.receiver.payments rec " +
                "group by p.receiver " +
                "having avg(rec.amount) > avg((select avg(pay.amount) from Employee e join e.payments pay)) " +
                "order by p.receiver.firstName";
        return session.createQuery(hql, Object[].class).getResultList();
    }
}