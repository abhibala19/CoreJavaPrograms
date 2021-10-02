package Thread;

public class Earth {
private static Earth obj=null;
private Earth() {
	// TODO Auto-generated constructor stub
	System.out.println("in no srg constr oh eafrth");
}
public static  synchronized Earth getInstance()
{
	if(obj==null)
		obj=new Earth();
	return obj;
	
		
}
}
