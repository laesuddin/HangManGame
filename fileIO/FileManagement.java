package fileIO;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagement
{
	private Scanner someScanner;
	private String wordListToUse;

	public void setWordList(String whichWordList)
	{
		wordListToUse = whichWordList;
	}

	public void openMemoryFile()
	{
		try
		{
			someScanner = new Scanner
			(
				new File
				(
					System.getProperty("user.dir") + "/src/memory/StateMemory.txt"
				)
			);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Opening StateMemory failed!");
		}
	}

	public String readMemoryFile()
	{
		return someScanner.nextLine();
	}

	public void openFile()
	{
		try
		{
			someScanner = new Scanner
				(
					new File
					(
						System.getProperty("user.dir") + "/src/memory/" + wordListToUse
						//"WordBank.txt"
						//System.getProperty("user.dir") + "/WordBank.txt"
					)
				);
		}
		catch(Exception e)
		{
			System.out.println("Opening " + wordListToUse + " failed!");
		}
	}

	public ArrayList<String> readFile()
	{
		ArrayList<String> someList = new ArrayList<String>();
		while (someScanner.hasNext())
		{
		    someList.add(someScanner.nextLine());
		}
		return someList;
	}

	public void closeFile()
	{
		someScanner.close();
	}


}
