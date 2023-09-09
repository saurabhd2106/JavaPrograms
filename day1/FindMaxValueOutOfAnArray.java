public class FindMaxValueOutOfAnArray {
    
    //Write a program to find the maximum value out of an array
    //input: 1 2 3 4 5
    //output: 5
    public static void main(String[] args) {
        
        int[] arr = {105, 210, 153, 234, 125};
        int max = arr[0];
        

        //Using a for loop to iterate over the array
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println(max);

        //Write the same program using a for-each loop
         for(int i : arr) {
             if(i > max) {
                     max = i;
                 }
             }
         System.out.println(max);

         //write the same program using a while loop
            int i = 0;
            while(i < arr.length) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                i++;
            }
            System.out.println(max);

            //write the same program using a do-while loop
            i = 0;
            do {
                if(arr[i] > max) {
                    max = arr[i];
                }
                i++;
            } while(i < arr.length);
            
            System.out.println(max);

            //write the same program using a for loop but start the loop from the end of the array

            for(int j = arr.length - 1; j >= 0; j--) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.println(max);
            



    }
}
