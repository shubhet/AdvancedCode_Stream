package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyJava8 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,23,43,54,56,76,33);
		List<Integer> collect = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(collect);

		int n =123;
		String s = String.valueOf(n);
		IntStream s1 = s.chars();
		int sum = s1.map(Character::getNumericValue).sum();
		System.out.println(sum);
		
		String s2 = "hello programmer";
		String[] s3 = s2.split("");
		String reduce = Arrays.stream(s3).reduce("", (a,c)-> c+a);
		System.out.println(reduce);
	}

}
