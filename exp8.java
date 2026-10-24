import java.util.Scanner;

class Patient {

    int id;
    String name;
    int age;
    String disease;
    String treatmentDate;
    double bill;

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

        System.out.print("Enter Treatment Date: ");
        treatmentDate = sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        bill = sc.nextDouble();
    }

    void display() {

        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID     : " + id);
        System.out.println("Patient Name   : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Disease        : " + disease);
        System.out.println("Treatment Date : " + treatmentDate);
        System.out.println("Bill Amount    : Rs." + bill);
    }
}

public class exp8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number of Patients: ");
            int n = sc.nextInt();
            sc.nextLine();

            Patient[] patients = new Patient[n];

            for (int i = 0; i < n; i++) {

                System.out.println("\nEnter Patient " + (i + 1) + " Details");

                patients[i] = new Patient();

                patients[i].getData(sc);
            }

            System.out.println("\n========== Patient Records ==========");

            for (int i = 0; i < n; i++) {
                patients[i].display();
            }

        } catch (Exception e) {

            System.out.println("\nInvalid Input!");
            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("\nProgram Completed.");
            sc.close();
        }
    }
}