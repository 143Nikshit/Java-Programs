class party{
    String partyName;
    int partySize;
    String partyType;
    String partyDate;
    String partyLocation;

    party(String partyname, int partySize, String partyType, String partyDate, String partyLocation)
    {
        this.partyName = partyname;
        this.partySize = partySize;
        this.partyType = partyType;
        this.partyDate = partyDate;
        this.partyLocation = partyLocation;
    }
    void display() {
        System.out.println("Party Name: " + partyName);
        System.out.println("Party Size: " + partySize);  
        System.out.println("Party Type: " + partyType);
        System.out.println("Party Date: " + partyDate);
        System.out.println("Party Location: " + partyLocation);
    }
}

public class this3 {
    public static void main(String[] args) {
        party p1 = new party("Birthday Bash", 50, "Birthday", "2026-02-14", "King's House");

        p1.display();
    }
}
