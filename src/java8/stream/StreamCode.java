package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCode {

	public static void main(String[] args) {

		List<Integer> list = List.of(23,23,45,56,67);
//		Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(integer);
//		long count = list.stream().count();
//		System.out.println(count);
//		IntSummaryStatistics summaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
//		long sum = summaryStatistics.getSum();
		
		
//		Integer integer2 = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
//		System.out.println(integer2);
//	 
//		System.out.println(sum);
//		double average = summaryStatistics.getAverage();
//		System.out.println(average);

//         list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
//         long sum = list.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
//         System.out.println(sum);

//		
//		Integer integer2 = list.stream().max(Comparator.naturalOrder()).get();
//		System.out.println(integer2);

//		String s= "hello prog";
//		String[] split = s.split("");
//		String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//		System.out.println(reduce);

//		List<String> list = Arrays.asList("Mango","Banana","Mango");
//		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));
//		  System.out.println(collect);

//		String s = "hello";
//		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i, Collectors.counting()));
//		System.out.println(collect);

//		int n =123;
//		String s = String.valueOf(n);
//		int sum = s.chars().map(Character::getNumericValue).sum();
//		System.out.println(sum);

//		List<Integer> list = List.of(23,34,45,67);
//		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
//		System.out.println(average);

//		String s = "hello";
//		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		
//		System.out.println(collect);

//		String s ="hello prog";
//		String[] split = s.split("");
//		String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//		System.out.println(reduce);

//		List<Integer> list = Arrays.asList(10,30,40,20);
//		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
//		System.out.println(average);
//		
//		int n = 123;
//		String valueOf = String.valueOf(n);
//		IntStream chars = valueOf.chars();
//		int sum = chars.map(Character::getNumericValue).sum();
//		System.out.println(sum);

//		int n =123;
//		String valueOf = String.valueOf(n);
//		IntStream chars = valueOf.chars();
//		int sum = chars.map(Character::getNumericValue).sum();
//		System.out.println(sum);

//		String s ="hello";
//		IntStream chars = s.chars();
//		Map<Character, Long> collect = chars.mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		System.out.println(collect);

//		String s ="hello prog";
//		String[] split = s.split("");
//		String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//		System.out.println(reduce);

//		List<Integer> of = List.of(12,34,55,2);
//		double average = of.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
//		System.out.println(average);

//		List<Integer> list = List.of(12, 23, 45);
//
//		long sum = list.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
//		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
//		System.out.println(sum);
//        System.out.println(average);
//        
//        String s="Allahabad";
//        Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
//        System.out.println(collect);

//        String s = "Welcome Prog";
//        String[] split = s.split("");
//        String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//        System.out.println(reduce);

//		  List<String> list = Arrays.asList("Mango","Guava","Banana","Mango","Banana");
//		  Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		  System.out.println(collect);

//		int n=1234;
//		String s = String.valueOf(n);
//		int sum = s.chars().map(Character::getNumericValue).sum();
//		System.out.println(sum);

		// fibonacci

//		int f1 = 0, f2 = 1, f3 = 0;
//		int n = 10;
//		for (int i = 0; i < n - 1; i++) {
//			System.out.print(f3 + " ");
//			f3 = f2 + f1;
//			f2 = f1;
//			f1 = f3;
//
//		}

		
//	 List<Integer> list = List.of(12,23,23,23,34,34,45);
//	 Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));
//	 System.out.println(collect);
//		
	 
//	double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
//	System.out.println(average);
	 
//	 Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//	 System.out.println("Second Min+"+integer);
	 
//	 String s="java";
//	 Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
//	 System.out.println(collect);
	 
//	 String s=" Welcome man";
//	 String[] split = s.split("");
//	 String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//	 System.out.println(reduce);
	 
//	 int n=123;
//	 String s = String.valueOf(n);
//	 int sum = s.chars().map(Character::getNumericValue).sum();
//	 System.out.println(sum);
		
		
		
	
		
//		List<Integer> list = List.of(23,12,34,35,43,31);
//		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
//		System.out.println(average);
//		
//		int max = list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
//		System.out.println(max);
//		
//		Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(integer);
//		
//		int n =123;
//		String s = String.valueOf(n);
//		int sum = s.chars().map(Character::getNumericValue).sum();
//		System.out.println(sum);
		
//		List<String> list = Arrays.asList("Guava","Bnana","Guava");
//		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		System.out.println(collect);
		
//		String s = "Guava";
//		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		System.out.println(collect);
		
//		String s = "Hello Prog";
//		String[] split = s.split("");
//		String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//		System.out.println(reduce);
		
		
	}

}
