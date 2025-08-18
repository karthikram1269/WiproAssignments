package assignments;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(5);
        boolean running = true;

        while (running) {
            System.out.println("\nClick numbers to perform Operations : ");
            System.out.println("1. Add Message");
            System.out.println("2. Consume Message");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    if (queue.remainingCapacity() == 0) {
                        System.out.println("Queue full! Cannot add more messages.");
                    } else {
                    		System.out.println("Enter Message : ");
                        String message = sc.nextLine();
                        try {
                            queue.put(message);
                            System.out.println("Added: " + message);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println("Interrupted while adding message.");
                        }
                    }
                    break;

                case 2:
                    String taken;
                    try {
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty. Nothing to consume.");
                        } else {
                            taken = queue.take();
                            System.out.println("Consumed: " + taken);
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Interrupted while consuming message.");
                    }
                    break;

                case 3:
                    System.out.println("Current Messages in Queue: " + queue);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        sc.close();
    }
}
