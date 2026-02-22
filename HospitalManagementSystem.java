import java.util.*;

public class HospitalManagementSystem {
    public static abstract class People {
        int age;
        String name;
        String id;

        People(int age, String name, String id) {
            this.age = age;
            this.name = name;
            this.id = id;
        }

        public abstract void description();
    }

    public static class Patient extends People {
        int severity;
        String note;

        Patient(String name, String id, int age, int severity, String note) {
            super(age, name, id);
            this.severity = severity;
            this.note = note;
        }

        @Override
        public void description() {
            System.out.println(
                    "Patient: name-" + name +
                            ", id-" + id +
                            ", age-" + age +
                            ", severity-" + severity +
                            ", note-" + note + ".");
        }
    }

    public static class EntryQueue {
        private PriorityQueue<Patient> pq;

        EntryQueue() {
            pq = new PriorityQueue<>(
                    (p1, p2) -> Integer.compare(p1.severity, p2.severity));
            System.out.println("Queue created!");
        }

        public void addPatient(String name, String id, int age, int severity, String note) {
            Patient patient = new Patient(name, id, age, severity, note);
            pq.offer(patient);
            System.out.print("Added: ");
            patient.description();
        }

        public void nextPatient() {
            Patient patient = pq.poll();
            if (patient != null) {
                System.out.print("Patient Queried: ");
                patient.description();
            } else {
                System.out.println("No patients in queue.");
            }
        }

        public void printAll() {
            PriorityQueue<Patient> temp = new PriorityQueue<>(pq);
            System.out.println("All patients in queue:");
            while (!temp.isEmpty()) {
                temp.poll().description();
            }
        }
    }

    public static void main(String[] args) {
        EntryQueue eq = new EntryQueue();
        eq.addPatient("AA", "P001", 23, 1, "Critical condition");
        eq.addPatient("BB", "P002", 20, 2, "Emergency condition");
        eq.addPatient("CC", "P003", 32, 1, "Critical condition");
        eq.addPatient("DD", "P004", 18, 3, "Normal condition");
        for (int i = 0; i < 2; i++) {
            eq.nextPatient();
        }
        eq.printAll();
    }
}
