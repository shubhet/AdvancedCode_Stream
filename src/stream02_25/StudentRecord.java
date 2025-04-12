package stream02_25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//fetch average marks by dept;
public class StudentRecord {

	private int id;
	private String name;
	private double marks;
	private String dept;

	@Override
	public String toString() {
		return "StudentRecord [id=" + id + ", name=" + name + ", marks=" + marks + ", dept=" + dept + "]";
	}

	public StudentRecord(int id, String name, double marks, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {

		List<StudentRecord> list = new ArrayList<>();
		list.add(new StudentRecord(101, "dhdh", 70, "it"));
		list.add(new StudentRecord(101, "uiyy", 78, "ece"));
		list.add(new StudentRecord(101, "iooi", 60, "it"));
		list.add(new StudentRecord(101, "oiop", 78, "me"));
		list.add(new StudentRecord(101, "qwee", 50, "it"));
//
//		Map<String, Double> collect = list.stream().collect(
//				Collectors.groupingBy(StudentRecord::getDept, Collectors.averagingDouble(StudentRecord::getMarks)));
//
//		for (Map.Entry<String, Double> map : collect.entrySet()) {
//
//			System.out.println(map.getKey() +"     "+ map.getValue());
//
//		}
		
		List<StudentRecord> collect2 = list.stream().sorted(Comparator.comparing(StudentRecord::getDept)).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(StudentRecord::getDept,Collectors.averagingDouble(StudentRecord::getMarks)));
		
		
		for(Map.Entry<String,Double> map: collect.entrySet()) {
		  System.out.println(map.getKey()+"     "+map.getValue());
		}

	}

}
