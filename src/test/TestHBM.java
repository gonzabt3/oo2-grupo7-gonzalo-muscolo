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

public class TestHBM {

	public static void main(String[] args) throws Exception {
		
		
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    session.close();
	    System.out.println("OK");
	    
	    AreaABM areaABM = new AreaABM();
	    areaABM.agregar("Area 1", "Descripcion del Area 1");
	    
	    UserABM userABM = new UserABM();
	    userABM.agregar("user1", "password1");
	    
	    EmployeeABM employeeABM = new EmployeeABM();
	    employeeABM.agregar("gonzalo", "developer", 1.2, "gonza", "password");
	    
	    AdminABM adminABM = new AdminABM();
	    adminABM.agregar("carlos", "admin1", "adminpass", areaABM.traer(1));
	    
	    CustomerABM customerABM = new CustomerABM();
	    customerABM.agregar("gonzalo", "gonzalo@gmail.com","gonza", "password");
	
	    StatusABM statusABM = new StatusABM();
	    statusABM.agregar("Activo", "El usuario está activo");
	   
	    TicketABM ticketABM = new TicketABM();
	    ticketABM.agregar("Ticket 1", "Descripción del Ticket 1", new Date(),statusABM.traer(1),customerABM.traer(2), employeeABM.traer(1));
	    
	    ComentarioABM comentarioABM = new ComentarioABM();
	    System.out.println("Agregando comentario...");
	    System.out.println("Employee: " + employeeABM.traer(1).toString());
	    comentarioABM.agregar("Comentario 1", new Date(), ticketABM.traer(1), employeeABM.traer(1));
	    
	}
	
}
