
public class DefaultMessage {
	public static final void startMessage()
	{
		System.out.println("\t\t\t\t\tFile Management Console App");
		System.out.println("\t\t\t\t\tDeveloped By- Sayak Ghoshal");
		System.out.println("\t\t\t\t\t\t\tIT Trainee at FIS");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static final void infoMessage()
	{
		System.out.println("This Apps helps you to manage your files in the existing directory\n"
				+ "Enter your choices between 1-3\n"
				+ "Option 2 has sub-choices a,b,c"
				+ "The options are given below.");
		System.out.println();
	}
	public static final void optionMessage()
	{
		System.out.println("Press->1 To show the current file names in ascending order");
		System.out.println("Press->2 To Add, Delete or Search a file from the root directory");
		System.out.println("Press->3 To Close the applications");
		System.out.println();
	}
}
