package lab8;

public class UpperLower {
public static void main(String[] args) {
	String s="SDfgsag123&$#";
	String f=convertToUpperAndLower(s);
	System.out.println(f);
}
public static String convertToUpperAndLower(String s)
{
	if(s==null)
		return "giveStirng";
	if(s=="")
		return "emptyString";
	if(s.trim().equals(""))
		return "no letters";
	StringBuilder sb=new StringBuilder("");
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>=65 && c<=90)
		{
			char c1=(char)(c+32);
			sb.append(c1);
		}
		if(c>=97 && c<123)
		{
			sb.append((char)(c-32));
		}
		else
			sb.append(c);
	}
	return sb.toString();
}
}
