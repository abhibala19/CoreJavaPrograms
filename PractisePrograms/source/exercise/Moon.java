package exercise;

public class Moon {
private static  Moon obj=null;
private Moon()
{
	
}
public static Moon getInstance()
{
	if(obj==null)
	{
		obj=new Moon();
	}
	return obj;
}

}
