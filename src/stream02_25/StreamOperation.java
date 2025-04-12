package stream02_25;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperation {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,23,43,56,76,78,98,54);
		List<Integer> list2 = Arrays.asList(12,23,34,45,56);
		
		String s4 ="hekko hjl";
		
		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
		int max = list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
		
		String s ="Hello";
		IntStream chars = s.chars();
		Map<Object, Long> collect = chars.mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect);
		
		int n = 123;
		String s2 = String.valueOf(n);
		int sum = s2.chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
		
		List<String> list3 = Arrays.asList("asdf","hjkl","asdf");
		Map<String, Long> collect2 = list3.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect2);
		
		String[] split = s4.split("");
		String reduce = Arrays.stream(split).reduce(" ",(a,c)->c+a);
		System.out.println(reduce);
		
		
		
		
		
		
		

	}

}
