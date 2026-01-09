import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class file_copy {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file_renamed.txt");
            FileOutputStream f2 = new FileOutputStream("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file_copied.txt");
            int i;
            while((i=f1.read())!=-1)
            {
                f2.write(i);
            }
            System.out.println("File Copied Successfully...!");
            f1.close();
            f2.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }
    }
}
