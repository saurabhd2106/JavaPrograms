public class SwapTwoNumbers {

    public static void main(String[] args) {

        // write a program to swap two numbers without using third number
        // input: 1 2
        // output: 2 1

        int a = 105;
        int b = 206;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

        //Write the same program using a third number
        a = 105;
        b = 206;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

    

    }

}
