import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Dr.T's 1.6 GHZ simulator! Please enter one integer of your choice: ");
                int number = kb.nextInt();

        System.out.println("Heres the spectrum analyzer based off of the reading you input: ");
        helperFib(number);


    }
    public static void helperFib(int n){
        int end = n;
        int current =0;
        int previous = 1;
        fibonacci(end, 0, 1);

    }

    public static int fibonacci(int n, int current, int previous){
        int fib;
        while(n>previous){
            fib =  current+ previous;
            System.out.println("Heres the fibonacci number: \t"+ fib);
            double fibjr = fib;
            double prevjr = previous;
            if(current!=0) {
                double total = fibjr / prevjr;
                System.out.println("Into GigaHertz: \t" + total + "\n\n");
            }
            else{
                System.out.println("There is not any readings yet\n\n");

            }

            return fibonacci(n, previous, fib);
        }
        return n;
    }


}