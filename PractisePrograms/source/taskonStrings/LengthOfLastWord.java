package taskonStrings;

public class LengthOfLastWord {
public static void main(String[] args) {
	String s="i am good girl and very talented";
	int a=findLengthOfLastWord("  ");
	System.out.println("the length of last given word is "+ a);
	
	
}
public static int  findLengthOfLastWord(String s)
{
	if(s.trim().equals(""))
    return 0;
	String[] s1=s.split(" ");
	int n=s1[s1.length-1].length();
	return n;
}
}

