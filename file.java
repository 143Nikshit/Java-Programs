// File Information

import java.io.File;
public class file {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file.txt");

        if(f.exists())
        {
            System.out.println("File Name"+ f.getName());
            System.out.println("File Location"+ f.getAbsolutePath());
            System.out.println("File Writable"+ f.canWrite());
            System.out.println("File Readable"+ f.canRead());
            System.out.println("File Size in bytes"+ f.length());
            System.out.println("Last Removed"+ f.delete());
        }
        else
        {
            System.out.println("File does not exist.");
        }
    }
}
