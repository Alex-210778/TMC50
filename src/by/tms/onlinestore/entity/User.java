package by.tms.onlinestore.entity;

import java.util.List;

public class User {

    private int id;
    private Administrator administrator;
    private String numberCard;
    private List<User_Address> address;
    private int blackList;

    public User(Administrator administrator, String numberCard, List<User_Address> address, int blackList) {
        this.administrator = administrator;
        this.numberCard = numberCard;
        this.address = address;
        this.blackList = blackList;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public List<User_Address> getAddress() {
        return address;
    }

    public void setAddress(List<User_Address> address) {
        this.address = address;
    }

    public int getBlackList() {
        return blackList;
    }

    public void setBlackList(int blackList) {
        this.blackList = blackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (blackList != user.blackList) return false;
        if (administrator != null ? !administrator.equals(user.administrator) : user.administrator != null)
            return false;
        if (numberCard != null ? !numberCard.equals(user.numberCard) : user.numberCard != null) return false;
        return address != null ? address.equals(user.address) : user.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (administrator != null ? administrator.hashCode() : 0);
        result = 31 * result + (numberCard != null ? numberCard.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + blackList;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", administrator=" + administrator +
                ", numberCard='" + numberCard + '\'' +
                ", address=" + address +
                ", blackList=" + blackList +
                '}';
    }
}
