package CoreJavaPrograms.PractisePrograms.source.lab6;
public class Food
{
    private String name;
    private double price;
    public void setFoodName(String s)
    {
        if(s==null || s.trim().equals(""))
        {
            System.out.println("give valid food name");
        }
        else
        this.name = s;
    }
    public String getFoodName()
    {
        return name;
    }
    public void setPrice(double p)
    {
        if(p>0)
        price=p;
        else
        System.out.println("give valid amount");
    }
    public double getPrice()
    {
        return price;
    }
}