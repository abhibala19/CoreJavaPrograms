package CoreJavaPrograms.PractisePrograms.source.lab6;

public class Array {
public static void main(String[] args) {
	int[] i1= {1,2,3,4,5,6,7,8,9,10};
	int[] j=new int[10];
	for(int i=0;i<j.length;i++) {
		j[i]=i+2;
		System.out.println(j[i]);
	}
	for(int x:i1) {
		System.out.println(x);
	}
	
	
}
	
}
