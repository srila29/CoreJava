package test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Order Confirmation chnged";
		FileOutputStream file1;
		try
		{
			file1=new FileOutputStream("result.txt",true);//true flag to append the existing file
			file1.write(str1.getBytes());
			
		}
     catch(FileNotFoundException e)
		{
	e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
