class State{
    String Rajasthan;
    String Gujarat;
    String Maharashtra;
    String Punjab;
    String Kerala;
}

public class No_arg5 {
    public static void main(String[] args) {
        State s1 = new State();
        s1.Rajasthan = "Jaipur";
        s1.Gujarat = "Gandhinagar";
        s1.Maharashtra = "Mumbai";
        s1.Punjab = "Chandigarh";
        s1.Kerala = "Thiruvananthapuram";

        System.out.println("Capital of Rajasthan: " + s1.Rajasthan);
        System.out.println("Capital of Gujarat: " + s1.Gujarat);
        System.out.println("Capital of Maharashtra: " + s1.Maharashtra);
        System.out.println("Capital of Punjab: " + s1.Punjab);
        System.out.println("Capital of Kerala: " + s1.Kerala);
    }
}
