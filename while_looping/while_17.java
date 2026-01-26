// 17. Print all prime numbers between 1 and 100. 

public class while_17 {
    public static void main(String[] args) {
        int num = 2;

        while (num <= 100) {
            int i = 1;
            int count = 0;

            while (i <= num) {
                if (num % i == 0) {
                    count++;
                }
                i++;
            }

            if (count == 2) {   // divisible by 1 and itself
                System.out.print(num + " ");
            }

            num++;
        }
    }
}