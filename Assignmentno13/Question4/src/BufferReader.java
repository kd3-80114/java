import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader 
{
public static void main(String arg[])
{
try(FileReader fr=new FileReader("new.txt"))
{
	try(BufferedReader br=new BufferedReader(fr))
	{
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
	}
}
catch(IOException e)
{
	e.printStackTrace();
}

}
}
