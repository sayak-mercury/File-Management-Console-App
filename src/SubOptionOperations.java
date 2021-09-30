import java.io.IOException;
import java.util.Scanner;

public class SubOptionOperations {
	public static final void subOps()
	{
		char opt='\0';
		System.out.println();
		do
		{
			System.out.println("--------------------------------------------------------------------------\n");
			System.out.println("Press->a To add a file\n"
					+ "Press->b To delete a file\n"
					+ "Press->c To search for a file\n"
					+ "Press->d to navigate back to main menu");
			
			System.out.print("Your Option: ");
			Scanner sc = new Scanner(System.in);
			String c = sc.next();
			if(c.length()!=1)
			{
				System.out.println("Please enter a valid input");
				System.out.print("Press 'Enter' to continue....");
				System.out.flush();
				try {
					System.in.read();
					System.out.flush();
				}
				catch(IOException e)
				{
					System.out.println("Unexpected Error occured");
				}
			}
			
			else {
				opt = c.charAt(0);
				
				switch(opt)
				{
				case 'a':
					new FileOps().createFile();
					break;
				case 'b':
					new FileOps().deleteFile();
					break;
				case 'c':
					new FileOps().searchFile();
					break;
				case 'd':
					System.out.println("Returning to main menu");
				default:
					System.out.println("Wrong input! Please enter again....");
				}
			}
			System.out.println("--------------------------------------------------------------------------\n");
		}while(opt!='d');
	}
}
