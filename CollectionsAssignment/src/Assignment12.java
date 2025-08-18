package assignments;

import java.util.*;

class Patient {
    String name;
    int severity; 
    long timestamp;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Patient : " + name + ", severity=" + severity ;
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (a, b) -> a.severity != b.severity ?
                       a.severity - b.severity :
                       Long.compare(a.timestamp, b.timestamp)
        );

        boolean exist = true;
        while (exist) {
            System.out.println("\nClick \n1. Add Patient \n2. Treat Next \n3. Display Queue \n4. Exit");
            int value = sc.nextInt();
            sc.nextLine();
            switch (value) {
                case 1:
                    if (pq.size() == 5) {
                        System.out.println("Queue full! Cannot admit new patient.");
                        break;
                    }
                    System.out.println("Enter patient name:");
                    String name = sc.nextLine();
                    System.out.println("Enter severity (1 = most severe):");
                    int sev = sc.nextInt();
                    pq.add(new Patient(name, sev));
                    break;

                case 2:
                    Patient next = pq.poll();
                    if (next != null)
                        System.out.println("Treating: " + next);
                    else
                        System.out.println("No patients waiting.");
                    break;

                case 3:
                    List<Patient> patients = new ArrayList<>(pq);
                    patients.sort((a, b) -> a.severity != b.severity ?
                                            a.severity - b.severity :
                                            Long.compare(a.timestamp, b.timestamp));
                    System.out.println("Current Waiting Patients: " + patients);
                    break;


                case 4:
                    exist = false;
                    System.out.println("Exited from application");
                    break;
            }
        }
    }
}
