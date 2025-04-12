package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeAveragingSalDept {

	private int id;
	private String name;
	private String dept;
	private double salary;

	public static void main(String[] args) {
		List<EmployeeAveragingSalDept> list = new ArrayList<>();
		list.add(new EmployeeAveragingSalDept(101, "ravi", "it", 100000.0));
		list.add(new EmployeeAveragingSalDept(102, "shivam", "hr", 200000.0));
		list.add(new EmployeeAveragingSalDept(103, "sohan", "it", 300000.0));
		list.add(new EmployeeAveragingSalDept(104, "rohan", "finance", 300000.0));
		list.add(new EmployeeAveragingSalDept(105, "sunny", "hr", 200000.0));
		list.add(new EmployeeAveragingSalDept(106, "rahul", "finance", 600000.0));

		// fetch dept name in sorted manner with averaging salary

		Map<String,Double> collect = list.stream().collect(Collectors.groupingBy(EmployeeAveragingSalDept::getDept,
				Collectors.averagingDouble(EmployeeAveragingSalDept::getSalary)));
		for (Map.Entry<String, Double> entry : collect.entrySet()) {
			System.out.println(entry.getKey() + "=======" + entry.getValue());
		}
	}

}
