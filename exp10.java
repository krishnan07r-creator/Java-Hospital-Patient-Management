import java.util.Scanner;

class HospitalPatient {

    int patientId;
    String patientName;
    String disease;
    double billAmount;

    boolean updated = false;

    synchronized void displayPatient() {
        try {
            while (!updated) {
                wait();
            }

            System.out.println("\n----- Patient Details -----");
            System.out.println("Patient ID    : " + patientId);
            System.out.println("Patient Name  : " + patientName);
            System.out.println("Disease       : " + disease);
            System.out.println("Bill Amount   : Rs." + billAmount);

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }

    synchronized void updatePatient() {
        System.out.println("\nUpdating Patient Record...");

        updated = true;

        notify();

        notifyAll();

        System.out.println("Patient Record Updated");
    }
}

class PatientThread extends Thread {

    HospitalPatient patient;

    PatientThread(HospitalPatient patient) {
        this.patient = patient;
    }

    public void run() {
        patient.displayPatient();
    }
}

public class exp10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HospitalPatient patient = new HospitalPatient();

        System.out.print("Enter Patient ID: ");
        patient.patientId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patient.patientName = sc.nextLine();

        System.out.print("Enter Disease: ");
        patient.disease = sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        patient.billAmount = sc.nextDouble();

        PatientThread t1 = new PatientThread(patient);
        PatientThread t2 = new PatientThread(patient);

        t1.start();
        t2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        patient.updatePatient();

        sc.close();
    }
}