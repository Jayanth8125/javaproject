package javapro;

import java.io.FileReader;
import java.io.IOException;

public class first {
	public static void main(String[]args)
	{
		try
		
		{
			FileReader reader=new FileReader(");
			int ch;
			while((ch=reader.read())!=-1)
			{
				System.out.print((char)ch);
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Error:" + e.getMessage());
		}
	}

}
