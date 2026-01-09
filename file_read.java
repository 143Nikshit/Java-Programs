
// Read Data from a file
import java.io.*;

public class file_read {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file.txt");
            try{
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.print((char)i);
                }
            }finally
            {
                r.close();
                System.out.println("\nFile Read Successfully...!");
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception Handle...!");
        }
    }
}
