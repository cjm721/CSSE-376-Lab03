package Main;

import java.util.ArrayList;

public class PrimeFactorization {
	
	public static int[] primeFactor(int number) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= number; i++) {
			if(number % i == 0) {
				list.add(i);
				number /= i;
				i--;
			}
		}
		
		int[] toReturn = new int[list.size()];
		for(int i = 0; i < toReturn.length; i++) {
			toReturn[i] = list.get(i);
		}
		
		return toReturn;
		/*
		return number == 1? new int[0] : 
			(number == 2? new int[] {2} : 
				(number == 3? new int[] {3}: 
					(number == 4? new int[] {2,2} : 
						(number ==6 ? new int[] {2,3}: new int[] {2,2,2}))));
		*/
	}
}
