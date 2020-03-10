package lista0;

import java.util.Scanner;

public class Q2 {

	public static int reverse(int num) {
		int reversed = 0;

		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        int Lista[] = new int[size*2];
        
        for(int i = 0; i<size*2; i++){
        	Lista[i]= in.nextInt();
        	
        }
        for(int i = 0; i < size*2; i+=2){
        	System.out.println(reverse(reverse(Lista[i]) + reverse(Lista[i+1])));
        	
        }
        
        in.close();
		
	}

}
