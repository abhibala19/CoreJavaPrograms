package exercise;

public class OParam {
	public static void main(String[] args) {
		OParam o=new OParam();
		o.amethod();
	}
	public void amethod()
	{
		int i=99;
		ValHold v=new ValHold();
		v.i=30;
		another(v,i);
		System.out.println(v.i);
	}
	public void another(ValHold v,int i)
	{i=0;
	v.i=20;
	ValHold vh=new ValHold();
	v=vh;
	System.out.println(v.i);
	System.out.println(i);
		
	}
}
class ValHold
{
	public int i=10;

}
