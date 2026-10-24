import java.util.Scanner;

class Patient {

    int patientId;
    String patientName;
    int age;
    String disease;

    void getPatientData(Scanner sc) {

        System.out.print("Enter Patient ID: ");
        patientId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        disease = sc.nextLine();
    }
}

class Doctor extends Patient {

    String doctorName;
    String treatmentDate;

    void getDoctorData(Scanner sc) {

        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter Treatment Date: ");
        treatmentDate = sc.nextLine();
    }
}

class Bill extends Doctor {

    double billAmount;

    void getBillData(Scanner sc) {

        System.out.print("Enter Bill Amount: ");
        billAmount = sc.nextDouble();
        sc.nextLine();
    }

    void displayData() {

        System.out.println("----- Patient Details -----");
        System.out.println("Patient ID     : " + patientId);
        System.out.println("Patient Name   : " + patientName);
        System.out.println("Age            : " + age);
        System.out.println("Disease        : " + disease);
        System.out.println("Doctor Name    : " + doctorName);
        System.out.println("Treatment Date : " + treatmentDate);
        System.out.println("Bill Amount    : Rs." + billAmount);
    }
}

public class exp4b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Patients: ");
        int numberOfPatients = sc.nextInt();
        sc.nextLine();

        Bill[] patients = new Bill[numberOfPatients];

        for (int i = 0; i < numberOfPatients; i++) {

            System.out.println("\nEnter Patient " + (i + 1) + " Details");

            patients[i] = new Bill();

            patients[i].getPatientData(sc);
            patients[i].getDoctorData(sc);
            patients[i].getBillData(sc);
        }

        System.out.println("\n========== Patient Records ==========");

        for (int i = 0; i < numberOfPatients; i++) {

            System.out.println("\nPatient " + (i + 1));
            patients[i].displayData();

            System.out.println("=====================================");
        }

        sc.close();
    }
}