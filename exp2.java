class Patient {

  private int patientId;
    private String patientName;
    private int age ;
    private String disease;

    static String hospitalName = "City Care Hospital";

    Patient(int id, String name, int age, String disease) {
        patientId = id;
        patientName = name;
        this.age = age;
        this.disease = disease;
    }
    void displayPatient() {
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
    }

    static void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
    }
}

public class exp2 {

    public static void main(String[] args) {

        Patient.displayHospital();

        System.out.println();

        Patient p1 = new Patient(101, "Krishnan", 20, "Fever");
        Patient p2 = new Patient(102, "Rahul", 25, "Malaria");

        System.out.println("Patient 1 Details");
        p1.displayPatient();

        System.out.println();

        System.out.println("Patient 2 Details");
        p2.displayPatient();
    }
}