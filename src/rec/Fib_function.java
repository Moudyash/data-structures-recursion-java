
package rec;

import java.util.Scanner;

public class Fib_function {
     public  static int fib(int n) {
	if (n ==0 || n==1)
		return n;
	else
		return fib(n-1)+fib(n-2);

    }
        public static void main(String[] args) {
            System.out.println("ENTER THE NUMBER");
                 Scanner in = new Scanner(System.in);
            int x =in.nextInt();
             int result = fib(x);
             System.out.println("result of fib is:=" + result);
        
    }
    
}
