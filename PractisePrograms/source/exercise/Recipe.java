package exercise;

public final class Recipe {
public  final String instructions;
public Recipe(String s) {
	if(s==null  || s.trim().equals("")) {
		throw new IllegalArgumentException("give valid recipe ");
	}
	else
instructions=s;
	
}
public String getInstructions()
{
	return instructions;
}
}
