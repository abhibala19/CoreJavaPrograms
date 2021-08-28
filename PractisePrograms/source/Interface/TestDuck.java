package Interface;

public class TestDuck {
public static void main(String[] args) {
	Duck d1=new Duck(Constants.SMALL);
	Duck d3=new Duck(Constants.BIGGER);
	Duck d2=new Duck(Constants.BIGGEST);
	Duck d=new Duck(1);
	d1.swim();
	d2.swim();
	d3.swim();
	System.out.println(Duck.count);
}
}
