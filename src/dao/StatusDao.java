package dao;

import datos.Status;

public class StatusDao extends Dao<Status> {

	public Status traerPorNombre(String name) {
	    Status objeto = null;
	    try {
	        iniciaOperacion();
	        objeto = (Status) session.createQuery("from Status s where s.name = :name")
	                .setParameter("name", name)
	                .setMaxResults(1)
	                .uniqueResult();
	    } finally {
	        session.close();
	    }
	    return objeto;
	}


    @Override
    public int agregar(Status status) {
        try {
            iniciaOperacion();
            int id = (int) session.save(status);
            tx.commit();
            return id;
        } finally {
            session.close();
        }
    }
}
