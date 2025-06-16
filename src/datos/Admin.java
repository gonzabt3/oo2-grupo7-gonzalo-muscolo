package datos;

public class Admin {
    private int idAdmin;
    private String name;
    private User user;
    private Area area;

    public Admin() {}

    public Admin(int idAdmin, String name, User user, Area area) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.user = user;
        this.area = area;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}