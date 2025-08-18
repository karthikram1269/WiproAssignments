package assignments;

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> chatBox = new ArrayDeque<>(4);

        boolean exist = true;
        while (exist) {
            System.out.println("\nClick \n1. Add Message \n2. Display Messages \n3. Exit");
            int value = sc.nextInt();
            sc.nextLine();

            switch (value) {
                case 1:
                    System.out.println("Enter message:");
                    String msg = sc.nextLine();
                    if (chatBox.size() == 4) {
                        chatBox.removeFirst(); 
                    }
                    chatBox.addLast(msg);
                    break;

                case 2:
                    System.out.println("Chat History: " + chatBox);
                    break;

                case 3:
                    exist = false;
                    System.out.println("Exited.");
                    break;
            }
        }
    }
}
