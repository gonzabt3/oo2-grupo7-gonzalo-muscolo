package negocio;

import dao.TicketDao;
import datos.Customer;
import datos.Employee;
import datos.Status;
import datos.Ticket;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class TicketABM {
    TicketDao dao = new TicketDao();

    public int agregar(String title, String description, Date dateOfCreation,
                       Status status, Customer customer,
                       Employee employee) throws Exception {
        // Validate that associated entities are not null
        if (status == null || customer == null || employee == null) {
            throw new Exception("Error: Employee, Customer, or Status must be created beforehand.");
        }
        Ticket ticket = new Ticket(title, description, dateOfCreation, status, customer, employee);
        return dao.agregar(ticket);
    }
}
