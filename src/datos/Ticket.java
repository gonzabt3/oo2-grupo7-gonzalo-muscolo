package datos;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Ticket {
    private int idTicket;
    private String title;
    private String description;
    private Date dateOfCreation;
    private Date dateOfEnd;
    private Status status;
    private Customer customer;
    private Employee employee;

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public Ticket() {}

    public Ticket(String title, String description, Date dateOfCreation, 
                  Status status, Customer customer, Employee employee) {
        this.title = title;
        this.description = description;
        this.dateOfCreation = dateOfCreation;
        this.dateOfEnd = null;
        this.status = status;
        this.customer = customer;
        this.employee = employee;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public String toString() {
		return "Ticket{" +
				"idTicket=" + idTicket +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", dateOfCreation=" + dateOfCreation +
				", dateOfEnd=" + dateOfEnd +
				", status=" + status.toString() +
				", customer=" + customer +
				", employee=" + employee +
				'}';
	}
}
