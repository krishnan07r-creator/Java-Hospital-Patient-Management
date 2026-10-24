import java.util.Scanner;

interface Hospital {

    void displayHospital();
}

abstract class Patient {

    int id;
    String name;
    int age;
    String disease;

    void getData(Scanner sc) {

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
    }

    abstract void display();
}

class Doctor extends Patient {

    String doctor;
    String treatmentDate;

    void getDoctor(Scanner sc) {

        System.out.print("Enter Doctor Name: ");
        doctor = sc.nextLine();

        System.out.print("Enter Treatment Date: ");
        treatmentDate = sc.nextLine();
    }

    void display() {

        System.out.println("Patient ID     : " + id);
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Disease        : " + disease);
        System.out.println("Doctor         : " + doctor);
        System.out.println("Treatment Date : " + treatmentDate);
    }
}

class Bill extends Doctor implements Hospital {

    double bill;

    void getBill(Scanner sc) {

        System.out.print("Enter Bill Amount: ");
        bill = sc.nextDouble();
        sc.nextLine();
    }

    void display() {

        super.display();

        System.out.println("Bill Amount    : Rs." + bill);
    }

    public void displayHospital() {

        System.out.println("Hospital Name  : City Care Hospital");
    }
}

public class exp6b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bill[] patients = new Bill[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Patient " + (i + 1) + " Details");

            patients[i] = new Bill();

            patients[i].getData(sc);
            patients[i].getDoctor(sc);
            patients[i].getBill(sc);
        }

        System.out.println("\n========== Patient Records ==========");

        for (int i = 0; i < n; i++) {

            System.out.println("\nPatient " + (i + 1));

            patients[i].display();
            patients[i].displayHospital();

            System.out.println("=====================================");
        }

        sc.close();
    }
}