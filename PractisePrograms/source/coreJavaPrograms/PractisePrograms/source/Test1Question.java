package coreJavaPrograms.PractisePrograms.source;
public class Test1Question
{
    public static void main(String[] args)
    {
        findPattern(9);
    }
    public static void findPattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            System.out.print(i);
            for(int j=1;j<=num;j++)
            {
                if((j>=i) && (i&1)!=0 &&(j&1)!=0)
                {
                    System.out.print(","+j +"  "+i);
                }
                if(j>=i && (i&1)==0 && (j&1)==0)
                {
                    System.out.print(","+j +" "+i);
                }
            }
            System.out.println();
        }
    
    }

}