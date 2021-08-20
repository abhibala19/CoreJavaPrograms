package coreJavaPrograms.PractisePrograms.source;
public class IntToBinary
{
    public static void main(String[] args)
    {
        //convertToBinary(10);
        convertToHexa(789);

    }
 /*    public static void convertToBinary(int num)
    {
        int[] arr=new int[32];
        for(int i=0;num>0;i++)
        {
            arr[i]=num%2;
            num=num/2;

        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
  */   
  public static void convertToHexa(int num)
    {
        if(num==10)
        
        System.out.print("A");
        if(num==11)
        System.out.print("B");
         if(num==12)
        System.out.print("C");
         if(num==13)
        System.out.print("D");
         if(num==14)
        System.out.print("E");
         if(num==15)
        System.out.print("F");
        int[] arr=new int[32];

        if(num>15)
        {
                char c=0;
                for(int i=0;num>0;i++)
                {
                
                    int r=num%16;
                    if(r==10)
                    c='A';
                    if(r==11)
                    c='B';
                    if(r==12)
                    c='c';
                    if(r==13)
                    c='D';
                    if(r==14)
                    c='F';
                    if(r==15) 
                    c='E';
                    if(r>9)
                    r=c;
                    arr[i]=r;
                    num=num/16;
                }   
    
               for(int i=arr.length-1;i>=0;i--)
                {
                    System.out.print(arr[i]);
                }
         }
    }
}