import java.util.Scanner;

class HospitalPatient extends Thread {

    int patientId;
    String patientName;
    int age;
    String disease;
    String treatmentDate;
    double billAmount;

    HospitalPatient(int id, String name, int age, String disease,
                    String date, double bill) {
        patientId = id;
        patientName = name;
        this.age = age;
        this.disease = disease;
        treatmentDate = date;
        billAmount = bill;
    }

    public void run() {
        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID      : " + patientId);
        System.out.println("Patient Name    : " + patientName);
        System.out.println("Age             : " + age);
        System.out.println("Disease         : " + disease);
        System.out.println("Treatment Date  : " + treatmentDate);
        System.out.println("Bill Amount     : Rs." + billAmount);
    }
}

public class exp9a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== City Care Hospital =====");

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Treatment Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        HospitalPatient p = new HospitalPatient(
                id, name, age, disease, date, bill);

        p.start();

        sc.close();
    }
}