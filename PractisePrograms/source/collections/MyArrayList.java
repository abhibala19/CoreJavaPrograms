package collections;

import java.util.ArrayList;

public class MyArrayList  {
	private int count = 0;
	private Object[] arr = new Object[10];

	public boolean add(Object o) {
		if (count < arr.length) {
			arr[count++] = o;
		} else {
			Object[] ar1 = new Object[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				ar1[i] = arr[i];
			}
			arr = ar1;
			ar1[count++] = o;
		}
		return true;

	}

	public Object get(int pos) {
		if (pos >= 0 && pos < count) {
			return arr[pos];
		} else
			throw new IllegalArgumentException("give filled index");
	}

	public int size() {
		return count;
	}

	public boolean contains(Object o) {
		for (Object obj : arr) {
			if (obj.equals(o))
				return true;
		}
		return false;
	}

	public Object remove(int pos) {
		Object temp = arr[pos];
		if (pos >= 0 && pos < count) {
			for (int i = pos; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[count] = null;
			count--;
		}

		return temp;

	}

	public boolean remove(Object o) {
		for (int i = 0; i < count; i++) {
			if (arr[i].equals(o)) {
				for (int k = i; k < count-1; k++) {
					arr[k] = arr[k + 1];
				}
					arr[count] = null;
					count--;
				
				return true;
			}
		}
		return false;
	}

	public boolean add(int pos, Object o) {
			for (int i = count-1; i >=pos;i--) {
				arr[i + 1] = arr[i];
			}
			arr[pos] = o;
			count++;

		
		return true;

	}

	public void printArray() {
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		MyArrayList m = new MyArrayList();
		m.add("idly");
		m.add("puri");
		m.add("chapati");
		m.add("dosa");
		m.add("pongal");
		m.add("vada");
		m.printArray();
		System.out.println(m.size());
		System.out.println(m.remove(3));
		System.out.println(m.size());

		System.out.println(m.contains("idly"));
		System.out.println(m.size());

		System.out.println(m.get(2));
		System.out.println(m.remove("chapati"));
		System.out.println(m.size());

		System.out.println(m.add(2,"poori"));
		m.printArray();
		System.out.println(m.size());

	}
}
