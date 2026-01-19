// 6. Calculate and print the sum of the first n natural numbers. 

class while_6{
    public static void main(String[] args) {
        int n = 10;   // number of natural numbers
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}
