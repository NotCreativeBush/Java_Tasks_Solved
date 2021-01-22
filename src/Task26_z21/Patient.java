package Task26_z21;

public class Patient {
    private String name;
    private String illness;
    private String treatment;

    public Patient(String name) {
        this.name = name;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String name() {
        return name;
    }

    public String illness() {
        return illness;
    }

    public String treatment() {
        return treatment;
    }
}
