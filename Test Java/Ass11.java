// Write a java program to find the digital multiplication of a given number

public class Ass11 {
    public static void main(String[] args) {
        int num =10, product=1;
        for(int i =1; i<=num; i++ ){
            product *= i;
        }
        System.out.println(product);
    }
}
