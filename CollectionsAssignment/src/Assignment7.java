package assignments;

import java.util.*;

class Job {
    String name;
    int urgency;

    Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Job :" + name + ", urgency = " + urgency ;
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Job> pq = new PriorityQueue<>(
            (a, b) -> a.urgency != b.urgency ? a.urgency - b.urgency : a.name.length() - b.name.length()
        );

        boolean exist = true;
        while (exist) {
            System.out.println("\nClick \n1. Add Job \n2. Display Jobs \n3. Exit");

            int value = sc.nextInt();
            sc.nextLine();

            switch (value) {
                case 1:
                    System.out.println("Enter job name:");
                    String name = sc.nextLine();
                    System.out.println("Enter urgency (1-5):");
                    int urgency = sc.nextInt();
                    pq.add(new Job(name, urgency));
                    break;

                case 2:
                    System.out.println("Jobs in priority order:");
                    PriorityQueue<Job> copy = new PriorityQueue<>(pq);
                    while (!copy.isEmpty()) {
                        System.out.println(copy.poll());
                    }
                    break;

                case 3:
                    exist = false;
                    System.out.println("Exited.");
                    break;

                default:
                    System.out.println("Invalid input.");
            }
        }

        sc.close();
    }
}
