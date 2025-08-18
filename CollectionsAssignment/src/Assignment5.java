package assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {

		LinkedList<String> sck = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);
		boolean a = true, b = true;

		while (a) {
			System.out.println("Click \n1.Open \n2.Exit");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				System.out.println("Enter 5 unique app names to store");
				while (b) {
					System.out.println("Store app : ");
					String st = sc.next();

					if (sck.size() <= 5) {
						if (sck.contains(st)) {
							System.out.println(" exists ");
							sck.removeFirstOccurrence(st);
							sck.add(0, st);
						} else
							sck.add(st);
					}
					if (sck.size() == 5) {
						System.out.println(sck);
						b = false;
					}

				}
			}
				break;

			case 2: {
				a = false;
				System.out.println(" bye bye.. Good Bye ");
			}
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
		}
	}
}
