package assignments;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

class Task {
	int id;
	String name;

	Task(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[Task id=" + id + ", name=" + name + "]";
	}
}

public class Assignment11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
		LinkedBlockingQueue<Task> stage1Copy = new LinkedBlockingQueue<>();
		LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

		boolean exist = true;

		while (exist) {
			System.out.println("\nClick");
			System.out.println("1. Add Task(s) to Stage 1");
			System.out.println("2. Process NEXT from Stage 1 (move even IDs to Stage 2)");
			System.out.println("3. Display Queues");
			System.out.println("4. Exit");
			System.out.print("Enter the int value: ");

			int value = sc.nextInt();
			sc.nextLine();

			switch (value) {
			case 1: {
				boolean adding = true;
				System.out.println("Enter tasks. Use id = -1 to stop.");
				while (adding) {
					System.out.print("Task id (-1 to stop): ");
					int id = sc.nextInt();
					sc.nextLine();
					if (id == -1) {
						adding = false;
					} else {
						System.out.print("Task name : ");
						String name = sc.next();
						sc.nextLine();
						stage1.add(new Task(id, name));
					}
				}
				break;
			}

			case 2: {
				stage1Copy = stage1;
				if (stage1.isEmpty()) {
					System.out.println("Stage 1 is empty.");
				} else
					for (Task t : stage1) {
						t = stage1.poll();
						if (t.id % 2 == 0) {
							stage2.add(t);
							System.out.println("successfully: " + t + " → moved to Stage 2");
						} else {
							System.out.println("Processed: " + t + " → completed at Stage 1 (odd id)");
						}
					}
				break;
			}

			case 3: {
				System.out.println("Stage 1: " + stage1Copy);
				System.out.println("Stage 2: " + stage2);
				break;
			}

			case 4: {
				exist = false;
				System.out.println("Exited from application");
				break;
			}

			default:
				System.out.println("Invalid option. Try again.");
			}
		}
	}
}
