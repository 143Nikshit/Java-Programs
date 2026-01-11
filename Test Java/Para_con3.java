class party{
    String partyName;
    int partySize;
    String partyType;
    String partyDate;
    String partyLocation;

    party(String name, int Size, String Type, String Date, String Location)
    {
        partyName = name;
        partySize = Size;
        partyType = Type;
        partyDate = Date;
        partyLocation = Location;
    }
    void display() {
        System.out.println("Party Name: " + partyName);
        System.out.println("Party Size: " + partySize);  
        System.out.println("Party Type: " + partyType);
        System.out.println("Party Date: " + partyDate);
        System.out.println("Party Location: " + partyLocation);
    }
}

public class Para_con3 {
    public static void main(String[] args) {
        party p1 = new party("Birthday Bash", 50, "Birthday", "2026-02-14", "King's House");

        p1.display();
    }
}
