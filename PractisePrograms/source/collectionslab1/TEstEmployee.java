package collectionslab1;

public class TEstEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address a1=new Address("balajiStreet","malainagar","606807","123");
Address a2=new Address("annanagar","tvmalai","674423","484");
Employee e1=new Employee("arun","1234",a1,a2);
Employee e2=new Employee("arun","1234",a1,a2);
System.out.println(e1.equals(e2));
System.out.println(a1.equals(a2));

	}

}
