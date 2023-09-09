public class SortingAnArray {
    //Write a program to sort an array in ascending order
    //input: 105 210 153 234 125
    //output: 105 125 153 210 234
    public static void main(String[] args) {
        
        int[] arr = {105, 210, 153, 234, 125};
        int temp = 0;
        
        //Using a for loop to iterate over the array
        //temp is used to store the value of the current element
        //arr[i] is used to store the value of the next element
        //arr[j] is used to store the value of the current element
        //if the current element is greater than the next element, swap the values
        //if the current element is smaller than the next element, do nothing
        //repeat this process for all the elements in the array
        //after the first iteration, the largest element will be at the end of the array
        //after the second iteration, the second largest element will be at the second last position of the array
        //repeat this process until the array is sorted
        //this is called bubble sort
        //this is a very inefficient way of sorting an array
        //this is not used in real life applications
        //this is just for learning purposes
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
        
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
