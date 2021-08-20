package CoreJavaPrograms.PractisePrograms.source.lab2;
public class NoOfDays
{
    public static void main(String[] args)
    {
        int month=5;
        int year=2000;
        int a=noOfDays(month,year);
        System.out.println("the no of days in the given month"+month+"and the year  "+year+" is "+ a);
    }
    public static int noOfDays(int month,int year)
    {
        int days=0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    days=31;
                    break;
            case 4:        
            case 6:        
            case 9:        
            case 11:
                    days=30;
                    break;
            case 2:
                    if((year%400)==0)                
                    days=29;
                    else
                    days=28;
        }
        return days;
    }
}