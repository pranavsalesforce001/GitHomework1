public class Exercise12 {
    public static void main(String[] args) {

        for(int integer1 = 0; integer1 < 100; integer1++){

            boolean divisibleby3 = (integer1 % 3) == 0;

            boolean divisibleby5 = (integer1 % 5) == 0;

            if(divisibleby3) {
                System.out.println(integer1 + " can be divided by 3");

            } else {
                System.out.println(integer1 + " cannot be divided by 3");
            }

            if(divisibleby5){
                System.out.println(integer1 + " can be divided by 5");

            } else {
                System.out.println(integer1 + " cannot be divided by 5");
            }

        }
    }
}
