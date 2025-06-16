package dao;

import datos.Ticket;

public class TicketDao extends Dao<Ticket> {

    @Override
    public int agregar(Ticket ticket) {
        try {
            iniciaOperacion();
            // Validate that associated entities exist
            if (ticket.getStatus() == null || ticket.getCustomer() == null || ticket.getEmployee() == null) {
                throw new IllegalArgumentException("Error: Employee, Customer, or Status must be created beforehand.");
            }
            // Save the Ticket
            int id = (int) session.save(ticket);
            tx.commit();
            return id;
        } finally {
            session.close();
        }
    }
}
