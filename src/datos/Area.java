package datos;

public class Area {
    private int idArea;
    private String nombre;
    private String descripcion;

    public Area() {}
    
    public Area(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

    public Area(String nombre) {
        this.nombre = nombre;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
		public String getDescripcion() {
		return descripcion;
	}
		public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
