package Collectionlab3;

import java.util.Comparator;
import java.util.Map.Entry;

public class CapitalComparator implements Comparator<Entry<String,String>>{
	@Override
	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().compareTo(o2.getValue());
	}
}
