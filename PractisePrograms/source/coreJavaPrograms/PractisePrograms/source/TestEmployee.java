package coreJavaPrograms.PractisePrograms.source;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("ramesh");
		e.setId("12@@34");
		e.setDob(1998);
		  
		Task t=new Task();
		t.setTitle("jump");
		t.setDescription("i am jumping from himalayas ");
	e.setPrimaryTask(t);
		e.work();
		e.performAction(t);
	}

}
