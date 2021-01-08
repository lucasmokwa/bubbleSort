import java.util.*;

//BubbleSort implementation
public class bubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int swaps = bubbleSortArr(a);
        
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
        
        in.close();
    }
    
    public static int bubbleSortArr(int[] arr){
        int swapCount = 0;
        //Loop through each element of the array
        for(int i = 0;i<arr.length-1;i++){
            //swap the position until the element is in place*
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    swapCount++;
                    swapElement(j,arr);
                }
            }
            
        }
        return swapCount;
    }
    
    public static void swapElement(int i, int[] arr){
        int buffer = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = buffer;
    }
}

