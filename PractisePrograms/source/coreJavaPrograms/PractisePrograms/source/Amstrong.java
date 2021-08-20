package coreJavaPrograms.PractisePrograms.source;
public class Amstrong
{
    public static void main(String[] args)
    {
        // isAmstrong(371);
        findAmstrong(1, 999);
    }
     public static boolean isAmstrong(int num)
    {
        int newnum=0;int copy=num;
        for(int i=0;num>0;i++)
        {
            int r=num%10;
            newnum=newnum+(r*r*r);
            num=num/10;
        }
        return copy==newnum;
        

   } 
   public static void findAmstrong(int from, int to)
   {
       int amstrong=0;
       for(int j=from;j<=to;j++)
       {
          if(isAmstrong(j)){
          System.out.println("the given "+ j+" is Amstrong");
          }
        else{
        System.out.println("the given "+ j+" is not an Amstrong");
        }
       }
   }
}