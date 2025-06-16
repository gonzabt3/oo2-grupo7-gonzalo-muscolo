package test;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;

import dao.HibernateUtil;
import datos.Employee;
import datos.Ticket;
import negocio.AdminABM;
import negocio.AreaABM;
import negocio.ComentarioABM;
import negocio.CustomerABM;
import negocio.EmployeeABM;
import negocio.StatusABM;
import negocio.TicketABM;
import negocio.UserABM;

public class CU2 {

	public static void main(String[] args) throws Exception {
		
		
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    session.close();
	    System.out.println("OK");
	    
	    AreaABM areaABM = new AreaABM();
	    areaABM.agregar("Contabilidad", "Area contable");
	    
	    EmployeeABM employeeABM = new EmployeeABM();
	    employeeABM.agregar("Juan", "contador", 10000.00,areaABM.traer(1), "juan", "password");
	    
	  
	    CustomerABM customerABM = new CustomerABM();
	    customerABM.agregar("gonzalo", "gonzalo@gmail.com","gonza", "password");
	
	    StatusABM statusABM = new StatusABM();
	    statusABM.agregar("Abierto", "El ticket está abierto");
	   
	    TicketABM ticketABM = new TicketABM();
	    ticketABM.agregar("Ticket 1", "Descripción del Ticket 1",customerABM.traer(2), employeeABM.traer(1));
	    
	    ComentarioABM comentarioABM = new ComentarioABM();
	    System.out.println("Agregando comentario...");
	    Ticket ticket = ticketABM.traer(1);
	    Employee employee = employeeABM.traer(1);
	    comentarioABM.agregar("Se hablo con el cliente para entender mejor los requisitos",ticket, employee);
	    	    
	}
	
}
