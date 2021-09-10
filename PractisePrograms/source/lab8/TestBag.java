package lab8;

public class TestBag {
public static void main(String[] args) {
	Item i1=new Item("caps",23.0);
	Item i2=new Item("pen",22.0);
	Item i3=new Item("notebooks",2.7);
	Item i4=new Item("lipstick",26.0);
	Bag b=new Bag("carrybag",5);
	b.addItem(i1);
	b.addItem(i2);
	b.addItem(i3);
	b.addItem(i4);
	b.addItem(i1);
	System.out.println(b.searchItem(i4));
	System.out.println(b.getItemPrice("pen"));
	System.out.println(b.getTotal());
	
}
}
