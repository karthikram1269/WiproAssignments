package assignments;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers, to calculate the average : ");
		int n = sc.nextInt();
		System.out.println(" Enter any "+n+" numbers to calculate the average : ");
		
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] < 10) {
				arr[i] *= 2;
			}
			sum += arr[i];
		}
		
		System.out.println(" The average of numbers : "+sum/n);
	}
}
