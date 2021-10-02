package codeEVal;

public class PickChar {
	public static void main(String[] args) {
		String s="sghhhfhhd";
		String s2=doSwap(s);
System.out.println(s2);
		String s1=pickChar(s);
		System.out.println(s1);
	}
	public static String doSwap(String str)
	{
		 String s=""+str.charAt(str.length()-1)+str.charAt(str.length()-2);

		 if(str.length()==2)
		 return s;
		 else
		 return str.substring(0,str.length()-2)+s;

		 
	}
	public static String pickChar(String str)
	{StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length();i+=4)
		{
		if(str.length()-1>i)
		{
			sb.append(str.substring(i,i+2));
			}
		else
			sb.append(str.substring(i));
		}
		return sb.toString();
	}

}
