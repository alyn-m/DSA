// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
  Example Array: [3,7,1,2,3,2,1]
   Revers Array: [1,2,3,2,1,7,3]
   
   Different Approached:
    Approach-1: Use Temp Array
    Approach-2: Two Pointer Algorithm
    Approach-3: Iterate over half of the Array and Replace elements with other half of the array
*/
class Main {
    public static void main(String[] args) {
        System.out.println("Revers An array.");
        
        // Program to Revers an Array
        int arr[] = {3,7,1,2,3,2};
        twoPointersApproach(arr);
        
        int arry[] = {3,7,1,2,3,0};
        useTempArray(arry);
    }
    // Approach-2: Two Pointers Algorithm
    static void twoPointersApproach(int arr[]){
        int endIndex = arr.length-1;
        int tempElementHolder;
        
        for(int startIndex=0; startIndex<(arr.length/2);startIndex++){
            tempElementHolder = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = tempElementHolder;
            endIndex--;
        }
        
        printArrElements(arr);
    }
    
    static void useTempArray(int arr[]){
        int []tempArr = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            tempArr[j] = arr[i];
            j++;
        }
        printArrElements(tempArr);
    }
    
    static void printArrElements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
