class party{
    String partyName;
    int partySize;
    String partyType;
    String partyDate;
    String partyLocation;
}

public class No_arg3 {
    public static void main(String[] args) {
        party p1 = new party();
        p1.partyName = "Birthday Bash";
        p1.partySize = 50;  
        p1.partyType = "Birthday";
        p1.partyDate = "2026-02-14";
        p1.partyLocation = "King's House";

        System.out.println("Party Name: " + p1.partyName);
        System.out.println("Party Size: " + p1.partySize);  
        System.out.println("Party Type: " + p1.partyType);
        System.out.println("Party Date: " + p1.partyDate);
        System.out.println("Party Location: " + p1.partyLocation);
    }
}
