import java.util.List;

public class Patient {
    private String name;
    private String surname;
    private String pesel;
    private List<String> healthCard;
    static int patientCounter;

    public Patient(String name, String surname, String pesel) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        patientCounter++;
    }
    String toPrint(){
        return name + " " + surname;
    }
}
