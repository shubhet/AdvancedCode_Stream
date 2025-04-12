package stream02_25;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Questions {

	public static void main(String[] args) {
		List<Integer> list = List.of(23, 24, 54, 31, 89);
		double average = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
		int max = list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
		System.out.println(max);

		String s = "Programmer";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect);
		
		
		String s1="Hello Jasper";
		String[] split = s1.split("");
		String reduce = Arrays.stream(split).reduce("",(a,c)->c+a);
		System.out.println(reduce);
		
		
		int n =123;
		String valueOf = String.valueOf(n);
		int sum = valueOf.chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
		
	}

}
