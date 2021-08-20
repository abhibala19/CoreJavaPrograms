package coreJavaPrograms.PractisePrograms.source;

public class Task {
	private String title;
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title==null || title.trim().equals(""))
		{
			System.out.println("give a valid title");
		}
		else
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if(description==null || description.trim().equals(""))
			System.out.println("give valid desciiption");
		this.description = description;
	}
	public void perform()
	{
		System.out.println("title "+title+" description is "+description);
	}
	

}
