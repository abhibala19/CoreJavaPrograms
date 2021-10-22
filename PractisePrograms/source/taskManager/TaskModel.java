package taskManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class TaskModel {
	public boolean checkCategoryExists(String catName)
	{
	return new File("/home/abhi/abhijava/taskmanager/"+catName+".todo").exists();	
	}
	public String addTask(TaskBean task,String catName)
	
	{
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter(catName+".todo",true));
			Date dt=new Date();
			bw.write(task.getTaskName()+":"+task.getDescription()+":"+task.getTag()+":"+task.getPriority()+":"+task.getDate()+dt.getTime());
			bw.newLine();
			return Constants.SUCCESS;
					
		}catch(IOException e)
		{
			e.printStackTrace();

			return "something bad happened"+e.getMessage();
		}finally {
			if(bw!=null)
			{
				try
				{
					bw.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
