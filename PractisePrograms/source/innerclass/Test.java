package innerclass;

public class Test {
public static void main(String[] args) {
	InstanceLevel o=new InstanceLevel();
	o.useInner();
InstanceLevel.Inner in=new InstanceLevel().new Inner();
in.print();
InstanceLevel.Inner in2=o.new Inner();
in2.print();

}
}
