package assignments;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        boolean exist = true;
        while (exist) {
            System.out.println("\nClick \n1. Add Print Job \n2. Print Next \n3. Display Queue \n4. Exit");
            int value = sc.nextInt();
            sc.nextLine();

            switch (value) {
                case 1:
                    System.out.println("Enter print job name:");
                    String job = sc.nextLine();
                    boolean added = printQueue.offer(job);
                    if (!added) {
                        System.out.println("Queue full! Job skipped.");
                    }
                    break;

                case 2:
                    String nextJob = printQueue.poll();
                    if (nextJob != null)
                        System.out.println("Printing: " + nextJob);
                    else
                        System.out.println("No jobs to print.");
                    break;

                case 3:
                    System.out.println("Current Print Queue: " + printQueue);
                    break;

                case 4:
                    exist = false;
                    System.out.println("Exited.");
                    break;
            }
        }
    }
}
