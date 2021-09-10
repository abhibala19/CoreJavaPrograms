package exercise;

import java.util.Date;

public class Food {
	
Recipe recipe;
public Recipe giveRecipe()
{
	return recipe;
}
public Food(Recipe p) {
if(p!=null)
	recipe=p;
	// TODO Auto-generated constructor stub
}
}
class CannedFood extends Food
{Date expiryDate;
	public CannedFood(Recipe r,Date s) {
		super(r);
		expiryDate=s;
	}
	
}
