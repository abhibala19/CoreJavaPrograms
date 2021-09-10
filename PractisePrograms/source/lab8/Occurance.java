package lab8;

public class Occurance {
public static void main(String[] args) {
	String s1="asdfg",s2="jklasdfg";
	String b=findOccuranceWithoutUsingMethod(s1,s2);
	System.out.println(b);
}
public static String findOccuranceWithoutUsingMethod(String b,String a)
{
	if(a==null || b==null)
		return "nullString";
	char[] s1=b.toCharArray();
	char[] s2=a.toCharArray();
	
	for(int i=0;i<s1.length;i++)
	{
		boolean flag=false;
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i]==s2[j])
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			return "false";
		}
	}
	return "true";
}
}
