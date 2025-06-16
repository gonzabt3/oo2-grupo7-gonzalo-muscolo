package negocio;

import dao.StatusDao;
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
    StatusDao statusDao = new StatusDao();

    public int agregar(String title, String description,
                        Customer customer,
                       Employee employee) throws Exception {
        Status status = statusDao.traerPorNombre("Abierto");
        Date currentDate = new Date();
        if (status == null || customer == null || employee == null) {
            throw new Exception("Error: Employee, Customer, or Status must be created beforehand.");
        }
        Ticket ticket = new Ticket(title, description, currentDate, status, customer, employee);
        return dao.agregar(ticket);
    }
    
    public Ticket traer(int idTicket) {
		return dao.traer(idTicket);
	}
    
    public void cambiarEstatus(Ticket ticket, String nuevoEstatus) throws Exception {
		Status status = statusDao.traerPorNombre(nuevoEstatus);
		if (status == null) {
			throw new Exception("Error: El estatus proporcionado no existe.");
		}
		ticket.setStatus(status);
		dao.actualizar(ticket);
	}
}
