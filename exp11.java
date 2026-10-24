import java.util.Scanner;

class Hospital {

    private final Object patientRecord = new Object();
    private final Object billingRecord = new Object();

    void updatePatient() {

        synchronized (patientRecord) {

            System.out.println(Thread.currentThread().getName()
                    + " locked Patient Record");

            synchronized (billingRecord) {

                System.out.println(Thread.currentThread().getName()
                        + " locked Billing Record");

                System.out.println("Patient Record Updated");
            }
        }
    }
}

class HospitalThread extends Thread {

    Hospital hospital;

    HospitalThread(Hospital hospital, String name) {
        super(name);
        this.hospital = hospital;
    }

    public void run() {
        hospital.updatePatient();
    }
}

public class exp11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Disease      : " + disease);

        Hospital hospital = new Hospital();

        HospitalThread t1 = new HospitalThread(hospital, "Thread 1");
        HospitalThread t2 = new HospitalThread(hospital, "Thread 2");

        t1.start();
        t2.start();

        sc.close();
    }
}