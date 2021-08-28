package Interface;

import Stringlab1.Reverse1;

public interface StringReverser {
	void ReverseBySB(String s);
	void ReverseByEXOR(String s);

}
class ReverseAString implements StringReverser
{
	public void ReverseBySB(String s)
	{
	System.out.println( new StringBuilder(s).reverse().toString()); 
	}
	@Override
	public void ReverseByEXOR(String s) {
		// TODO Auto-generated method stub
	System.out.println(Reverse1.findReverse(s));	
	}
}
