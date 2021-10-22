package innerclass;

import innerclass.InstanceLevel.Inner;

public class TestStatic {
public static void main(String[] args) {
	StaticLevel o=new StaticLevel();
	o.useInner();
StaticLevel.Inner in=new StaticLevel.Inner();
in.print();
}
}
