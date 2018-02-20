import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class Algoritmus {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me your limit: ");
		int limit = sc.nextInt();
		int amount=0;
		for (int i = 2; i < limit; i++) {
			if (majdnemprime(i) && majdnemprime((int)(i+1))) {
				System.out.println(i + ", " + (int)(i+1));
				amount++;
			}
		}
		System.out.println("Your requested numbers are there, " + amount+ " at all,.");
	}
	
	public static ArrayList<Integer> primeSearch (int limit) {
		ArrayList<Integer> primek = new ArrayList<Integer>();
		boolean prime= false;
		for (int i = 2; i <= limit; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j==0) {
					prime=false;
				} else {	
					prime=true;
				}
			}
			if (prime) {
				primek.add(i);
			}
		}
		return primek;
	}
	public static boolean majdnemprime (int a) {
	        int n = a;
	        
	        ArrayList<Integer> factors = new ArrayList<Integer>();
	        for (int i = 2; i <= n; i++) {
	            while (n % i == 0) {
	                factors.add(i);
	                n /= i;
	            }
	        }
	        if (factors.size()==2) {
				return true;
			} else {
				return false;
			}
	}
}



