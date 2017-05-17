package pl.sdacademy.search;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args){
		Predicate<Integer> condition = p -> p ==0;
		int number = 5;
		checkNumber(condition, number);
		number = 0;
		checkNumber(condition, number);
		
		
	}
	public static void checkNumber(Predicate<Integer> codition, int number){
		System.out.println(number);
		if(codition.test(number)){
			System.out.print("is true");
		} else {
			System.out.print("is false");
		}
	}		
	

}
