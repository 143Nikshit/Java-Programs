import java.util.ArrayList;

class array3{
    private int Id;
    private String name;

    public array3(int Id, String name)
    {
        this.Id = Id;
        this.name = name;
    }

    public void setStudent(int Id, String name)
    {
        this.Id = Id;
        this.name = name;
    }

    // overriding to string metod
    public String toString()
    {
        return "Id :" + Id + " Name :" + name;
    }

    public static void main(String args[])
    {
        array3 s1 = new array3(101, "Sanju Bhai");
        array3 s2 = new array3(101, "Sanju Bhai");
        array3 s3 = new array3(101, "Sanju Bhai");

        System.out.println(s1);

        ArrayList ls = new ArrayList();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);

        System.out.println(ls);

    }
}