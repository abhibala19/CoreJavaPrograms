package coreJavaPrograms.PractisePrograms.source.lab5;

public class UniqueArray {
	public static void main(String[] args) {
		int[] a = { 12, 2, 2, 4, 5, 5 };
		int[] b = { 2, 5, 6 };
		int[] e = removeDuplicateWithOneArray(a);
		int[] f = removeDuplicateWithOneArray(b);
		int[] d = findUniqueWithTwoArray(e, f);
		for (int x : d) {
			System.out.println(x);
		}
	}

	public static int[] findUniqueWithTwoArray(int[] x, int[] y) {
		int count1 = 0;
		int d = (x.length > y.length ? x.length : y.length);
		int[] unique = new int[d];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					unique[count1] = x[i];
					count1++;
					break;
				}
			}
		}
		int[] arr = new int[count1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = unique[i];
		}
		return arr;
	}

	public static int[] removeDuplicateWithOneArray(int[] x) {
		int count1 = 0;
		int[] unique = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				unique[count1] = x[i];
				count1++;
			}
		}
		int[] arr = new int[count1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = unique[i];
		}
		return arr;
	}

}
