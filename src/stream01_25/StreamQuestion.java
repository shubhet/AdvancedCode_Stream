package stream01_25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQuestion {

	public static void main(String[] args) {
		
//		List<Integer> list = List.of(23,45,56,76,87,98);
//		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
//		long sum = list.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
//		int max = list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
//		int min = list.stream().mapToInt(Integer::intValue).summaryStatistics().getMin();
//		long count = list.stream().mapToInt(Integer::intValue).summaryStatistics().getCount();
//		System.out.println("Average "+average);
//		System.out.println("Sum "+sum);
//		System.out.println("Max "+max);
//		System.out.println("Min "+min);
//		System.out.println("Count "+count);
		
//		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(collect);
		
//		String s = "hello";
//		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		System.out.println(collect);
		
//		String s = "hello prog";
//		String[] split = s.split("");
//		String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
//		System.out.println(reduce);
		
//		int n =123;
//		String s = String.valueOf(n);
//		int sum = s.chars().map(Character::getNumericValue).sum();
//		System.out.println(sum);
		
		
		List<String> list = Arrays.asList("hello","prog","hello");
	    Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect);
		
	
		
	}

}
