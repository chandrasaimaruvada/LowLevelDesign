package SOLID.SRP;

public class Patient {
    private String name;
    private String hospital;

    public Patient(String hospital, String name) {
        this.hospital = hospital;
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public String getName() {
        return name;
    }
}
