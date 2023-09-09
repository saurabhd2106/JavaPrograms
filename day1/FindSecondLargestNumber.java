public class FindSecondLargestNumber {
    //write a program to find the second largest number in an array
    //input: 105 210 153 234 125

    //output: 210

    public static void main(String[] args) {
        int[] arr = {105, 210, 153, 234, 125};
        int max = arr[0];
        int secondMax = arr[0];

        //Using a for loop to iterate over the array
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);

        //Using a for-each loop to iterate over the array
        max = arr[0];
        secondMax = arr[0];
        for(int i : arr) {
            if(i > max) {
                secondMax = max;
                max = i;
            } else if(i > secondMax) {
                secondMax = i;
            }
        }

        System.out.println(secondMax);

        //Using a while loop to iterate over the array
        max = arr[0];
        secondMax = arr[0];
        int i = 0;
        while(i < arr.length) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax) {
                secondMax = arr[i];
            }
            i++;
        }

        System.out.println(secondMax);

        //Using a do-while loop to iterate over the array
        max = arr[0];
        secondMax = arr[0];
        i = 0;
        do {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax) {
                secondMax = arr[i];
            }
            i++;
        } while(i < arr.length);

        System.out.println(secondMax);
        
    }   
}
