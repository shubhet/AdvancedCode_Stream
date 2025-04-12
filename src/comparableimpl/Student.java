package comparableimpl;

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
public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private String address;

	@Override
	public int compareTo(Student s) {
		return this.id-s.id;
	}
	
}
