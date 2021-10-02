package collectionslab1;

import java.awt.List;
import java.util.ArrayList;

public class TestCollectionsMethods {

	public static void main(String[] args) {

		ArrayList col1 = new ArrayList();
		System.out.println(col1.size());
System.out.println(col1.isEmpty());
		col1.add("asdf");
		col1.add("assedf");
		col1.add("asddf");
		col1.add("asddef");
		System.out.println(col1.size());
		System.out.println(col1);
		System.out.println(col1.contains("asdf"));
//			col1.clear();
		System.out.println(col1);
		for (Object x : col1) {
			String s = (String) x;
			System.out.println(s);
		}
col1.remove("asdf");
System.out.println(col1);
col1.add(2,"idly");
System.out.println(col1);
ArrayList col2=new ArrayList();
col2.add("idly");
col2.add("vada");
col2.add("puri");
col2.add("dosa");
for(int i=0;i<col2.size();i++)
{
col1.add(col2.get(i));
}
System.out.println(col1);
for(int i=0;i<col1.size();i++)
{
	System.out.println(col1.get(i));
}
System.out.println(col1.indexOf("idly"));

col2.retainAll(col1);
System.out.println(col2);
	}

}
