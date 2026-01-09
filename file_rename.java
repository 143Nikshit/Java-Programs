import java.io.*;

public class file_rename {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file.txt");
        File f1 = new File("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file_renamed.txt");
        
        if(f.exists())
        {
            System.out.println(f.renameTo(f1));
        }
        else
        {
            System.out.println("File does not exist.");
        }

    }
}
