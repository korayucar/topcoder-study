public class InsertZ {

	public String canTransform(String init, String goal) {
		 return init.equals(goal.replaceAll("z" , "")) ? "Yes" : "No";
	}
}
