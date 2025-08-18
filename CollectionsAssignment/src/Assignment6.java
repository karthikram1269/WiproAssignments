package assignments;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean exist = true;
		String name = null;
		ArrayDeque<String> q = new ArrayDeque<>();

		while (exist) {
			System.out.println("Click \n\n1.Add \n2.Display \n3.Exit");

			System.out.println("Enter the int value : ");
			int value = sc.nextInt();

			switch (value) {
			case 1: {
				System.out.println(
						"Enter the names to add in Queue, prioritising even count of name length.\nEnter \"stop\" to quit adding names");
				boolean start = true;
				while (start) {
					name = sc.next();
					if (name.equalsIgnoreCase("stop")) {
						start = false;
					} else {
						if (name.length() % 2 == 0)
							q.addFirst(name);
						else
							q.addLast(name);

					}

				}
				break;
			}
			case 2: {
				System.out.println(q);
				break;
			}
			case 3: {
				exist = false;
				System.out.println(" Exited from application");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + value);
			}
		}
	}
}
