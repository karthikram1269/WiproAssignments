package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Assignment4 {

	public static void main(String[] args) {

		Stack<String> sck = new Stack<String>();

		Scanner sc = new Scanner(System.in);
		boolean a = true, b = true;
		String lastPopped = null;
		boolean isUndone = false;
		StringBuilder r = null;

		while (a) {
			System.out.println("Click \n\n1.Add \n2.undo \n3.redo it in reverse \n4.Exit \n");
			int i;
			try {
				i = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.getLocalizedMessage() + " Enter int value : ");
				i = sc.nextInt();
			}
			switch (i) {
			case 1: {
				System.out.println("Enter three data to add(String type) : \n  To quit adding, just type - stop");
				while (b) {
					String st = sc.next();

					if (st.equalsIgnoreCase("stop")) {
						b = false;
					} else {
						sck.add(st);
					}
					if (sck.size() == 3)
						b = false;
				}
				b = true;
				isUndone = false;
			}
				break;

			case 2: {
				if (!sck.isEmpty()) {
					lastPopped = sck.pop();
					isUndone = true;
					System.out.println("Removed recent one: " + lastPopped);
				} else {
					System.out.println("Stack is empty. Nothing to undo.");
				}
			}
				break;

			case 3: {
				if (isUndone && lastPopped != null) {
					String reversed = new StringBuilder(lastPopped).reverse().toString();
					sck.add(reversed);
					System.out.println("Redone in reverse: " + reversed);
					isUndone = false;
				} else {
					System.out.println("Nothing to redo. First undo something.");
				}
			}
				break;

			case 4: {
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
