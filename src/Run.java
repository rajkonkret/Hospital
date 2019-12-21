import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.addPatient("Rad", "Jan", "123");
        hospital.addPatient("Rad", "Jan", "4456");
        hospital.addPatient("Rad", "Jan","4456" );
        hospital.addPatient("Rad", "Jan","4456");
        System.out.println(hospital.getP());
        for (Patient patient : hospital.patiensList) {
            System.out.println(patient.toPrint());

        }
    }
}
