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

public class CU4 {

	public static void main(String[] args) throws Exception {
		
		TestUtil.limpiarBaseDeDatos();
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
	
	    AdminABM adminABM = new AdminABM();
	    adminABM.agregar("carlos", "admin1", "adminpass");
	    
	    UserABM userABM = new UserABM();
	    System.out.println("Listado de Admin:");
	    adminABM.traer().forEach(user -> {
	    	System.out.println(user.toString());
	    });
	    
	    System.out.println("Listado de Customer:");
	    customerABM.traer().forEach(user -> {
	    	System.out.println(user.toString());
	    });
	    
	    System.out.println("Listado de Employee:");
	    employeeABM.traer().forEach(user -> {
	    	System.out.println(user.toString());
	    });
	    
	}
	
}
