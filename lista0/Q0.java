package lista0;

import java.util.Scanner;

public class Q0{
    

    //Add Odd 
    //Minus Even
    public static int evenodds(int a, int b) {
    	//int count = 0;
        int r = 0;
        while (a != b) {

            r = a - b;

            if (r%2 == 0) {
                if (r < 0) {
                    //a = a + (normalize(r) - 1);
                    //count++;
                    //a = a + 1;
                    //count++;
                    return 2;
                    
                } else {
                    //a = a - r;
                    //count++;
                    return 1;
                }

            } else {
                if (r > 0) {
                    //a = a - (r + 1);
                   // count++;
                    //a = a + 1;
                   // count++;
                    return 2;
                } else {
                    //a = a + normalize(r);
                    //count++;
                    return 1;
                }

            }

        }
        return 0;

    }

    public static int normalize(int x) {
        if (x >= 0) {
            return x;
        } else {
            return x *= -1;
        }
    }

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        int Lista[] = new int[size*2];
        
        for(int i = 0; i<size*2; i++){
        	Lista[i]= in.nextInt();
        	
        }
        for(int i = 0; i < size*2; i+=2){
        	System.out.println(evenodds(Lista[i], Lista[i+1]));
        	
        }
        
        in.close();
    }
}
