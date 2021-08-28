package taskonStrings;

public class Prefix {
	public static void main(String[] args) {
		String[] s= {"flow","flower","flight"};
		String s1=findPrefix(s);
		System.out.println(s1);
	}
	public static String findPrefix(String[] s)
	{
		if(s==null)
			return "";
		if(s.length==1 && !( s[0].trim().equals("")))
			return s[0];
		String s1="";
		for(int i=0;i<s.length-1;i++)
		{
			String compare=s[i];
			
			for(int k=0;k<compare.length();k++)
			{
				int count=1;
				String sub=compare.substring(0,k+1);
				int index=compare.indexOf(sub);
				for(int j=i+1;j<s.length;j++)
				{
					if(index==(s[j].indexOf(sub)))
					{
						count++;
					}
				}
				if(count==s.length)
				{
					s1=sub;
				}
			}
		}
		return s1;
	}

}
