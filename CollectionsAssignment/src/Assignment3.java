package assignments;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		Deque<String> ds = new ArrayDeque<>(3);
		Scanner sc = new Scanner(System.in);


		boolean b = true, a = true;

		while (a) {
			System.out.println(" Click \n1. To Search \n2. To Display the last 3 searches \n3. To exit");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				System.out.println(" Give input :");
				System.out.println(" For exiting from searching, type - \"stop\"");
				while (b) {
					String st = sc.nextLine();

					if (st.equals("stop")) {
						b = false;
					} else {
						if (ds.size() == 3) {
							ds.removeFirst();
						}
						ds.add(st);
					}
				}
			}
				break;

			case 2: {
				System.out.println(ds);
			}
				break;
			case 3: {
				a = false;
				System.out.println(" Have a nice day 🤗");
			}
			break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
		}

	}
}
