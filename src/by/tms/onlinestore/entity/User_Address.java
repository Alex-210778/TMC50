package by.tms.onlinestore.entity;

public class User_Address {

    private int id;
    private int post;
    private String address;

    public User_Address(int post, String address) {
        this.post = post;
        this.address = address;
    }

    public User_Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User_Address that = (User_Address) o;

        if (id != that.id) return false;
        if (post != that.post) return false;
        return address != null ? address.equals(that.address) : that.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + post;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User_Address{" +
                "id=" + id +
                ", post=" + post +
                ", address='" + address + '\'' +
                '}';
    }
}
