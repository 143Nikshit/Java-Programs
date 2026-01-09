// throw vs throws

public class throw_key {
    void div(int a, int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c= a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args)
    {
        throw_key obj= new throw_key();
        try 
        {
            obj.div(20,0);
        }
        catch(Exception e)
        {
            System.out.println("The valus of b ix zero");
        }
    }
}
