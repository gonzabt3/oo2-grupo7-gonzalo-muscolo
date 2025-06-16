package datos;

public class Status {
    private int idStatus;
    private String name;
    private String description;

    public Status() {}

    public Status(int idStatus, String name, String description) {
        this.idStatus = idStatus;
        this.name = name;
        this.description = description;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
