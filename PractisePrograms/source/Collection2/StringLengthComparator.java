package Collection2;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{
public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	return o1.length()-o2.length();
}
}

