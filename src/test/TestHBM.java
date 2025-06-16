package test;

import org.hibernate.Session;

import dao.HibernateUtil;
import negocio.AdminABM;
import negocio.AreaABM;
import negocio.CustomerABM;
import negocio.EmployeeABM;
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
	}
	
}
