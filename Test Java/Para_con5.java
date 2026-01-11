class State{
    String Rajasthan;
    String Gujarat;
    String Maharashtra;
    String Punjab;
    String Kerala;

    // Parameterized constructor
    State(String r, String g, String m, String p, String k) {
        Rajasthan = r;
        Gujarat = g;
        Maharashtra = m;
        Punjab = p;
        Kerala = k;
    }

    void displayCapitals() {
        System.out.println("Capital of Rajasthan: " + Rajasthan);
        System.out.println("Capital of Gujarat: " + Gujarat);
        System.out.println("Capital of Maharashtra: " + Maharashtra);
        System.out.println("Capital of Punjab: " + Punjab);
        System.out.println("Capital of Kerala: " + Kerala);
    }
}

public class Para_con5 {
    public static void main(String[] args) {
        State s1 = new State("Jaipur", "Gandhinagar", "Mumbai", "Chandigarh", "Thiruvananthapuram");

        s1.displayCapitals();
    }
}
