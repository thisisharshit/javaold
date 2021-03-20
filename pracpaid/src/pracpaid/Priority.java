package pracpaid;

public interface Priority {

	public void setpriority(int level);
	public int getpriority();
	public class task implements Priority
	{
	private String msg, priority;
	private int level;

	//-----------------------------------------------------
	// Constructor: Creates a task and a priority level.
	//-----------------------------------------------------
	public task ()
	{
	this.msg = msg;
	this.level = level;

	if (level == 1)
	priority = "Critical";
	if (level == 2)
	priority = "Very Important";
	if (level == 3)
	priority = "Normal";
	if (level == 4)
	priority = "Low";
	if (level == 5)
	priority = "Not Important";
	}

	public task(String string, int i) {
	// TODO Auto-generated constructor stub
	}

	//-----------------------------------------------------
	// Sets the priority level.
	//-----------------------------------------------------
	public void setPriority (int level)
	{
	this.level = level;

	if (level == 1)
	priority = "Critical";
	if (level == 2)
	priority = "Very Important";
	if (level == 3)
	priority = "Normal";
	if (level == 4)
	priority = "Low";
	if (level == 5)
	priority = "Not Important";
	}

	//-----------------------------------------------------
	// Returns the priority level.
	//-----------------------------------------------------
	public int getPriority()
	{
	return level;
	}

	//-----------------------------------------------------
	// Returns a description of the task object.
	//-----------------------------------------------------
	public String toString()
	{
	return msg + "\t" + "Priority Level: " + level + "\t" + priority;
	}

	public void setmassage(String string) {
	// TODO Auto-generated method stub

	}
	}



	public class main_imp{
	public static void main(String arg[]){
	task one = new task("one",3);
	task two = new task();
	two.setPriority (1);
	two.setmassage ("two");
	System.out.println(one.toString());
	System.out.println(two.toString());
	}


	}

}
