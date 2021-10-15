package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueArray {
public static int[] uniqueArray(int[] a,int[] b) {
int[] c=new int[a.length+b.length];
int j=0;
for(int i=0;i<c.length;i++)
{
if(i<a.length)
c[i]=a[i];
else
c[i]=b[j++];

}
List<int[]> l=Arrays.asList(c);
Set<Integer> s=new TreeSet<Integer>(l);
int[] d=new int[s.size()];
int f=0;
for(Object o:s)
{
int h=(int)o;
d[f++]=h;
}
return d;
}
}
