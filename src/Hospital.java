import java.util.ArrayList;
import java.util.List;

public class Hospital {
    List<Patient> patiensList;

    public Hospital() {
        this.patiensList = new ArrayList<>();
    }

    void addPatient(String name, String surname, String pesel) {
        Patient patient = new Patient(name, surname, pesel);
        patiensList.add(patient);
    }

    int getP() {
        return Patient.patientCounter;
    }


}
