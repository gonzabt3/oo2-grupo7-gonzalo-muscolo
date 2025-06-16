package datos;

public class Customer {
    private int idCustomer;
    private String name;
    private String email;
    private User user;

    public Customer() {}

    public Customer(int idCustomer, String name, String email, User user) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.user = user;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
