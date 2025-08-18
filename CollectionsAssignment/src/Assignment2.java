package assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the count of names :");
		int n = sc.nextInt();
		
		System.out.println(" Enter any  names :");
		
		LinkedList<String> list = new LinkedList<String>();
		
		for(int i = 0;i<n;i++) {
			 list.add(sc.next());
		}
		
		for(int i = 0;i<n;i++) {
			String name = list.get(i); 
			 if(name.endsWith("!")) {
				 list.remove(name);
				 list.addFirst(name);
			 }
		}
		System.out.println(list);	
		System.err.println(" After reversing : ");
		System.out.println(list.reversed());	
	}
}
						