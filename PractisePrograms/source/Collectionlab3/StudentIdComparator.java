package Collectionlab3;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student>{
@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.getId().compareTo(o2.getId());
}
}
