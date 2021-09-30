import java.io.IOException;
import java.util.Scanner;
public class StartupApp {
	public static void main(String args[])
	{
		System.out.println("_______________________________________________________________________________________________");	
		char opt='\0';
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("###############################################################################");
			String c;
			DefaultMessage.startMessage();
			DefaultMessage.infoMessage();
			DefaultMessage.optionMessage();
			System.out.print("Enter your option: ");
			c = sc.next();
			System.out.flush();
			if(c.length()!=1)
			{
				System.out.println("Please enter a valid input");
				System.out.print("Press 'Enter' to continue....");
				try {
					System.in.read();
					System.out.flush();
				}
				catch(IOException e)
				{
					System.out.println("Unexpected Error occured");
				}
			}
			else{
				opt = c.charAt(0);
				switch(opt)
				{
				case '1':
					new FileOps().genList();
					break;
				case '2':
					SubOptionOperations.subOps();
					break;
				case '3':
					System.out.println("Thank You for Using the App");
					break;
				default:
					System.out.println("Wrong Input!!");
				}
			}
			System.out.println("###############################################################################");
		}while(opt!='3');
		System.out.println("_______________________________________________________________________________________________");
	}
}
