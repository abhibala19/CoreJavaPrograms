package Collection2;

import java.util.Comparator;

public class StudentAgeDescendingComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getAge()-o1.getAge();
	}

}
