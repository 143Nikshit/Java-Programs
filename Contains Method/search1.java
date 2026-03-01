import java.util.ArrayList;
class search1
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();    
        list.add(21);
        list.add(78);
        list.add(1212);
        list.add(98);
        list.add(100);
        System.out.println(list);

        System.out.println("=======================");
        int keyElement = 100;

        if(list.contains(keyElement))
        {
            System.out.println(keyElement + " Element is present inside the list");
        }
        else
        {
            System.out.println(keyElement + " Element is not present inside the list");
        }
    }
}