package org.tns.capgemini.c2tc.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class WithoutStreamAPI {

	public static void main(String[] args) {
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result = new ArrayList<>();
		for (Integer number : numbers) {
			if(number % 2 == 0) {
				int doubled = number * 2;
				result.add(doubled);
			}
		}
		System.out.println("Doubled evennumbers: "+result);

	}

}
