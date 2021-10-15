package Collectionlab3;

import java.util.Comparator;
import java.util.Map.Entry;

public class ValueComparator implements Comparator<Entry<String,Integer>>{
public int compare(Entry<String,Integer> o1, Entry<String,Integer> o2) {
	return o1.getValue()-o2.getValue();
	}
}