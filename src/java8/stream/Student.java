package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	
	private int id;
	private String name;
	private double fee;
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student(int id, String name, double fee, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(101,"shivam",12000.0,"science"));
//		list.add(new Student(201,"rinky",14000.0,"art"));
//		list.add(new Student(301,"devyansh",21000.0,"commerce"));
//		list.add(new Student(401,"ravi",34000.0,"science"));
//		list.add(new Student(501,"sohan",18000.0,"it"));
//		
//		List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getId).thenComparing(Student::getFee)).collect(Collectors.toList());
//		System.out.println(collect);

//		Map<String, Double> collect3 = list.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.averagingDouble(Student::getFee)));
//		
//		for(Map.Entry<String, Double>entry :collect3.entrySet())
//		{
//			System.out.println(entry.getKey()+""+entry.getValue());
//		}
		
//		 
//	Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.averagingDouble(Student::getFee)));
//		
//	for(Map.Entry<String, Double>entry : collect.entrySet()) {
//		System.out.println(entry.getKey()+"++++"+entry.getValue());
//	}
//		//System.out.println(list);
		
		//sorton the basis of id

//		List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getId).reversed()).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		//average fee of stduent per dept
//		
//		Map<String, Double> collect2 = list.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.averagingDouble(Student::getFee)));
//
//		for(Map.Entry<String, Double> entry : collect2.entrySet())
//		{
//			System.out.println(entry.getKey()+"============"+entry.getValue());
//		}
		
		//print map using stream
//		Map<Integer, String> map1 = new HashMap<>();
//		map1.put(101, "hello");
//		map1.put(201, "code");
//		
//		for(Map.Entry<Integer, String> x:map1.entrySet()) {
//			System.out.println(x.getKey()+"======___"+x.getValue());
//		}
		
//	    Map<Integer, Double> collect2 = list.stream().collect(Collectors.groupingBy(Student::getId, Collectors.averagingDouble(Student::getFee)));
//	
//	    for(Map.Entry<Integer, Double> map:collect2.entrySet()) {
//	    	System.out.println(map.getKey()+"++++++"+map.getValue());
//	    }
		
		
	List<Student> list = new ArrayList<>();
	list.add(new Student(101,"Sohan",23000,"it"));
	list.add(new Student(201,"Arun",21000,"fin"));
	list.add(new Student(105,"Ravi",54000,"sup"));
	list.add(new Student(100,"Dinesh",17000,"it"));
	
//	List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
//	System.out.println(collect);
//	
//	List<Student> collect2 = list.stream().sorted(Comparator.comparing(Student::getFee)).collect(Collectors.toList());
//	System.out.println(collect2);
	
	//average fee of it dept-20000
//	Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getFee)));
//	System.out.println(collect);
	
//	List<Integer> list1 = List.of(23,212,48,40);
//	long sum = list1.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
//	System.out.println(sum);
//	int n =123;
//	String s = String.valueOf(n);
//	int sum2 = s.chars().map(Character::getNumericValue).sum();
//	System.out.println(sum2);
	
	String s="hello";
	Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
	System.out.println(collect);
	}
	
	

}
