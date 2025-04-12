package comparatorimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparatorimpl.Student;

public class StudentMain {

	public static void main(String[] args) {
      List list = new ArrayList<>();
    	  list.add(new Student(101,"Alpha","Alld"));
    	  list.add(new Student(103,"Beta","Pune"));
    	  list.add(new Student(104,"Gama","Vns"));
    	  list.add(new Student(102,"Yuta","Rbl"));
    	  System.out.println(list);
    	  Collections.sort(list,new StudentComparator());
    	  System.out.println(list);
    	  

	}

}
