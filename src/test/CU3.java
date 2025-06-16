package test;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;

import dao.HibernateUtil;
import datos.Ticket;
import negocio.AdminABM;
import negocio.AreaABM;
import negocio.ComentarioABM;
import negocio.CustomerABM;
import negocio.EmployeeABM;
import negocio.StatusABM;
import negocio.TicketABM;
import negocio.UserABM;

public class CU3 {

	public static void main(String[] args) throws Exception {
		
		TestUtil.limpiarBaseDeDatos();

	    Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    session.close();
	    System.out.println("OK");
	    
	    AreaABM areaABM = new AreaABM();
	    areaABM.agregar("Contabilidad", "Area contable");
	    
	    EmployeeABM employeeABM = new EmployeeABM();
	    int idEmployee= employeeABM.agregar("Juan", "contador", 10000.00,areaABM.traer(1), "juan", "password");
	    
	  
	    CustomerABM customerABM = new CustomerABM();
	    int idCustomer = customerABM.agregar("gonzalo", "gonzalo@gmail.com","gonza", "password");
	
	    StatusABM statusABM = new StatusABM();
	    statusABM.agregar("Abierto", "El ticket está abierto");
	    statusABM.agregar("Cerrado", "El ticket está cerrado");
	    TicketABM ticketABM = new TicketABM();
	    int idTicketCreado = ticketABM.agregar("Ticket 1", "Descripción del Ticket 1",customerABM.traer(idCustomer), employeeABM.traer(idEmployee));
	    
	    System.out.println("Ticket creado: " + ticketABM.traer(idTicketCreado).toString());
	    ticketABM.cambiarEstatus(ticketABM.traer(idTicketCreado), "Cerrado");
	    System.out.println("Ticket modificado: " + ticketABM.traer(idTicketCreado).toString());

	    
	}
	
}
