package exp7package;

public class Patient {
    int patientId;
    String patientName;
    int age;
    String disease;

    public Patient(int id, String name, int age, String disease) {
        patientId = id;
        patientName = name;
        this.age = age;
        this.disease = disease;
    }

    public void display() {
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
    }
}