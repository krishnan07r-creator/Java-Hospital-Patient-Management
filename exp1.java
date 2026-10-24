
    
class Patient {

    int patientId;
    String patientName;
    int age;
    String disease;

    Patient() {
        patientId = 101;
        patientName = "Krishnan";
        age = 20;
        disease = "Fever";
    }

    Patient(int id, String name, int age, String disease) {
        patientId = id;
        patientName = name;
        this.age = age;
        this.disease = disease;
    }

    void displayPatient() {
        System.out.println("----- Patient Details -----");
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
        System.out.println();
    }
}

public class exp1 {

    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient(102, "Rahul", 25, "Malaria");

        System.out.println("Patient 1 Details");
        p1.displayPatient();

        System.out.println("Patient 2 Details");
        p2.displayPatient();
    }
}
