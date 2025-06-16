package datos;

public class Employee {
    private int idEmployee;
    private String name;
    private String position;
    private Double salary;
    private User user;
    
    public Employee() {
		super();
    }
    
    // Constructor
    public Employee(int id, String name, String position, Double salary, User user) {
        this.idEmployee = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.user = user;
    }

    // Getters and setters
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int id) {
        this.idEmployee = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", name=" + name + ", position=" + position + ", salary=" + salary
				+ ", user=" + user.getUsername() + "]";
	}
}