package CoreJavaPrograms.PractisePrograms.source.lab6;

public class TestComplex {
	public static void main(String[] args)
	{
		Complex c1=new Complex(4, 60);
		Complex c2=new Complex(5, 8);
		Complex c3=new Complex(c1.getReal()+c2.getReal(), c1.getImaginary()+c2.getImaginary());
		System.out.println(c3.getReal());
		System.out.println(c3.getImaginary());
	}

}
