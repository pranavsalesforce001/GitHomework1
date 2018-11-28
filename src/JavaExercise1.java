import java.util.Scanner;

public class JavaExercise1 {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the  number ");

        int num = obj.nextInt();
        int temp=0;
        for(int i=2;i<=num-1;i++){
            if (num%i==0){
                temp = temp+1;
            }
        }
        if (temp==0)

            System.out.print(num+"is prime number");


        else {
            System.out.println("its not prime number ");
        }
    }}

