// Writa a java program to check whether a number is plaindeom number or not

public class Ass6 {
    public static void main(String[] args) {
        int num= 121; int r =0; int t = num ;
        while(num > 0 ){
            r = r *10 + num%10;
            num = num / 10;
        }
        if(t == num){
            System.out.println("It is not a plaindeom number");
        }
        else{
            System.out.println("It is not a plaindeom number");
        }
    }
}
