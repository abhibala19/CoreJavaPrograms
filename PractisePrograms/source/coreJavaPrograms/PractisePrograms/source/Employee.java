package coreJavaPrograms.PractisePrograms.source;

public class Employee {
 private String name;
 private String id;
 private int dob;
 private Task primaryTask;
public String getName() {
	return name;
}
public void setName(String name) {
	if(name==null ||  name.trim().equals(""))
	{
		System.out.println("give a valid name");
	}
	else
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	if(id==null || id.trim().equals(""))
	{
		System.out.println("give valid id");
	}
	else
	this.id = id;
}
public int getDob() {
	return dob;
}
public void setDob(int dob) {
	if(dob>0) {
	this.dob = dob;
	}
	else
		System.out.println("give valid date");
		
}
public Task getPrimaryTask() {
	return primaryTask;
}
public void setPrimaryTask(Task primaryTask) {
	if(primaryTask!=null)
		this.primaryTask = primaryTask;
	else
		System.out.println("give valid task");
}
public void work()
{
	System.out.println("i am "+name+" performing "+primaryTask.getTitle()+ " description "+primaryTask.getDescription());
	primaryTask.perform();
}
public void performAction(Task t)
{
	t.perform();
}
 
}
