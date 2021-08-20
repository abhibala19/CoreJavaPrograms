package coreJavaPrograms.PractisePrograms.source;
public class BasicPrms
{
  

    public static void main(String[] args)
    {
      //  loop();
      int x=noOfDays(7,2020);
        
        //table(7,9);
       

    }
    
   /* public static void table(int num , int num1)
        {
            int smaller;
            int larger;
            larger = (num>num1)? num : num1;
            smaller = (num>num1) ? num1: num;
            for(int x=1;x<=larger;x++)
                {
                    int c=x*smaller;
                    System.out.println("the table of given num is "+x+"*"+smaller+"="+c);
                }
           

        }
    */
   /*  public static void loop()
    {
        int i;
        int j;
        for(i=1;i<=99;i++)
        {
          if((i%11)!=0) 
           System.out.print(i); 
           else
           System.out.println();
    
        }
    } */
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
        System.out.println("no of days in the month"+ month+"is"+days);
        return days;

    }  
}