//  Write on File

import java.io.*;
public class file_write {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("C:\\Users\\Nikshit.G.Joshi\\Desktop\\Development\\Java\\file.txt");
            try{
                f.write("JavaProgramming is the best language...!");
            }finally{
                f.close();
            }
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}
