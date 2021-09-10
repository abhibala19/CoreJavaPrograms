package exercise;
import java.util.*;
public class TestFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r=new Recipe("idly ,dosa,puri,pongal");
		Date d=new Date();
		CannedFood c=new CannedFood(r,d);
		c.giveRecipe();
		
	}

}
