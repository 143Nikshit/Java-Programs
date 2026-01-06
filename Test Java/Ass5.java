// Writa a java program to print multiple of 5 and 7 using do while loop

public class Ass5 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if(i % 5 == 0 && i % 7 == 0 ){
                System.out.print(i+" ");
            }
            i++;
        } while(i <= 100);
    }
}

