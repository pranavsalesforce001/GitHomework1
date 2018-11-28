import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

            int i,r,x,s;
            System.out.println("armstrog number are ");

    for (i=1;i<=500;i++)

    {
                s=0;

                x=i;

                while(x!=0){

                    r=x%10;

                    s+=r*r*r;

                    x=x/10;

                }

                if(s==i)

                    System.out.println(i);

            }}}





