package lista0;

import java.util.Scanner;

public class Q1 {

	public static int candies(int a) {
		
		int r = (a - 5);
		
			if (r%3 == 0) {
				if (r > 0) {
					return r;
				} 
				else {
					return -1;
				}
			} 
			else if(r%3 == 2) {
				if(r-5 > 10) {
					return r-5;
				}
				else {
					return -1;
				}
			}
			else if(r%3 == 1 && r > 30) {
				
				return r-10;
			}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		int Lista[] = new int[size];

		for(int i = 0; i<size; i++){
			Lista[i]= in.nextInt();

		}
		for(int i = 0; i < size; i++){
			System.out.println("Case " + (i+1) + ": " + candies(Lista[i]));

		}

		in.close();

	}

}
