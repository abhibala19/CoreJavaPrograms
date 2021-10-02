package exercise;

public class CompressString {
	public String compressString(String s) {
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<s.length();i++)
		{
		int count=1;
		char c=s.charAt(i);
		for(int j=i+1;j<s.length();j++)
		{
		char c1=s.charAt(j);
		if(c==c1)
		count++;
		}
		sb.append(c+""+count);
		}
		return sb.toString();
		}
}
