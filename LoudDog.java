public class LoudDog extends Dog
{

	public LoudDog(String name){
	 super(name);
	}

	// Override the speak method here
	public String speak(){
		return "BARK!";
	}
	
	//Override the toString here.
	public String toString(){
		String name = super.getName();
		return name + " is loud and likes to BARK!";
	}
	//Remember, you can access the name using super.getName()
}
