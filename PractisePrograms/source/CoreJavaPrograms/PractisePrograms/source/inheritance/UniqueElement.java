package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class UniqueElement {
public static void main(String[] args) {
    int[] a1={10,20,10,30};
    int[] a2={140,120,120,30};
    int[] a3=new int[a1.length+a2.length];
    a3=findUniqueElement(a1,a2);
    for(int x:a3)
    {
        System.out.println("the unique array are "+x);
    }

}
public static int[] findUniqueElement(int[] a,int[] b)
{
    int count=0;
    int[] ar1=findUniqueElementArray(a);
    int[] ar2=findUniqueElementArray(b);
    int[] ar3=new int[(ar1.length+ar2.length)];
    for(int i=0;i<ar3.length;i++)
    {
        if(i<ar1.length)
        {
             ar3[i]=ar1[i];
        }
        else
        if(i<ar3.length)
        ar3[i]=ar2[count++];

    }
    int[] ar4=findUniqueElementArray(ar3);
    return ar4;

    
}

public static int[] findUniqueElementArray(int[] a)
{
    int count=0;
    int[] newar=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                count++;
            }
        }
        if(count==1)
        {
            newar[count++]=a[i];
        }
        count=0;

    }
    for(int x:newar)
    {
        System.out.print(x);
    }
    return newar;
}

    
}
