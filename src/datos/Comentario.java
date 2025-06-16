package datos;

import java.util.Date;

public class Comentario {
    private int idComentario;
    private String contenido;
    private Date fechaCreacion;
    private Ticket ticket;
    private Employee employee;

    public Comentario() {}

    public Comentario(String contenido, Date fechaCreacion, Ticket ticket, Employee employee) {
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.ticket = ticket;
        this.employee = employee;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public Employee getEmployee() {
		return employee;
	}
    
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
