import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class FileOps {
	public void genList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the directory path or '.' for the current directory: ");
		String p = sc.nextLine();
		File path = null;
		try {
			path = new File(p);
			String contents[] = path.list();
			System.out.println("The files and folders name in the root directory in ascending order are: ");
			Arrays.parallelSort(contents);
			for(String i:contents)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		System.out.println("");
	}
	
	public void createFile()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name including its path: ");
		String p = sc.nextLine();
		try
		{
			File file = new File(p);
			if(file.exists())
				System.out.println("File already Exists!");
			else
			{
				boolean res = file.createNewFile();
				if(res)
				{
					System.out.println("File Created!");
				}
				else
					System.out.println("File Creation Failed!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		System.out.println("");
	}
	
	public void deleteFile()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name including its path: ");
		String p = sc.nextLine();
		try
		{
			File file = new File(p);
			if(file.exists())
			{
				boolean res = file.delete();
				if(res)
					System.out.println("File Deleted Successfully!");
				else
					System.out.println("File Deletion Unsuccessful!");
			}
			else
			{
				System.out.println("File Does Not Exists!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		System.out.println("");
	}
	
	public void searchFile()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name including its path (Not case sensitive): ");
		String p = sc.nextLine();
		try
		{
			File file = new File(p);
			if(file.exists())
			{
				System.out.println("File Found!!");
			}
			else
			{
				System.out.println("File Not Found!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		System.out.println("");
	}
}
