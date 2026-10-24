import java.util.Scanner;

class Patient {

    private int id;
    private String name;
    private int age;
    private String disease;
    private String doctorName;
    private String treatmentDate;
    private double billAmount;

    public void getPatientData(Scanner sc) {

        System.out.print("Enter Patient ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        disease = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter Treatment Date: ");
        treatmentDate = sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        billAmount = sc.nextDouble();
        sc.nextLine();
    }

    public void displayPatientData() {

        System.out.println("Patient ID      : " + id);
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Disease         : " + disease);
        System.out.println("Doctor Name     : " + doctorName);
        System.out.println("Treatment Date  : " + treatmentDate);
        System.out.println("Bill Amount     : Rs." + billAmount);
    }
}

public class exp4a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Patients: ");
        int numberOfPatients = sc.nextInt();
        sc.nextLine();

        Patient[] patients = new Patient[numberOfPatients];

        for (int i = 0; i < numberOfPatients; i++) {

            System.out.println("\nEnter Patient " + (i + 1) + " Details");

            patients[i] = new Patient();

            patients[i].getPatientData(sc);
        }

        System.out.println("\n========== Patient Records ==========");

        for (Patient patient : patients) {

            patient.displayPatientData();

            System.out.println("=====================================");
        }

        sc.close();
    }
}