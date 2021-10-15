package Threadslab;

public class TestLogger {
public static void main(String[] args) {
	Logger l1=Logger.getInstance();
	Logger l2=Logger.getInstance();
	l1.log("is l1== l2 "+(l1==l2));
	l1.log("main invokes process");
	process();
	l1.log("main ends");
	
	
}
public static void process()
{
	Logger log1=Logger.getInstance();
	log1.log("process()..starting");
	log1.log("process doing something");
	log1.log("process ending");
	
}
}
