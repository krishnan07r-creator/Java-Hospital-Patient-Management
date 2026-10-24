import java.util.Scanner;

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

public class exp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p1 = new Patient();

        System.out.print("Enter Patient ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease : ");
        String disease = sc.nextLine();

        Patient p2 = new Patient(id, name, age, disease);

        System.out.println("\nPatient 1 Details");
        p1.displayPatient();

        System.out.println("Patient 2 Details");
        p2.displayPatient();

        sc.close();
    }
}