package CoreJavaPrograms.PractisePrograms.source.lab4;
public class Duck
{
    private int tailSize;
    public void setTailSize(int n)
    {
    	if(n>0)
    		tailSize=n;
    	else
    		System.out.println("give a valid size");
    }
    public int getTailSize()
    {
    	return tailSize;
    }
    public void swim()
    {
        System.out.println("i am duck having tailsize "+tailSize+" swimming");
    }

}