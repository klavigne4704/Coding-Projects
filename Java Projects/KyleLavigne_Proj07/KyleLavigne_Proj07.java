import java.util.Random;
import java.util.Scanner;
/**
 * Uses all the following functions in the code to search, sort, and find specific mathematical things about the array.
 *
 * @Kyle Lavigne
 * @10/8/23
 */
public class KyleLavigne_Proj07
{
    public static void initializeArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            Random rand = new Random();
            arr[i] = 1 + rand.nextInt(100);
        }
        System.out.println("Array is initialized.");
        printArray(arr);
    }
    
    public static int linearSearch(int arr[], int key){
        int goal = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                goal = i;
                return goal;
            }
        }
        return goal;
    }
    
    public static void selectSort(int arr[]){
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }   
    
    public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        
        if ((i + 1) % 5 == 0) {
            System.out.println();
        }
    }
    
    if (arr.length % 5 != 0) {
        System.out.println();
    }
}
    
    public static int range(int arr[]){
        return largest(arr)-smallest(arr);
    }
    
    public static int largest(int arr[]){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int smallest(int arr[]){
        int min = 100;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
    public static double average(int arr[]){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total/arr.length;
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x;
        int[] arr = new int[25];
        do {
            System.out.println("--------------------------------");
            System.out.println("(1) Initialize Array");
            System.out.println("(2) Search Array");
            System.out.println("(3) Sort Array");
            System.out.println("(4) Print Array");
            System.out.println("(5) Find Range of Array");
            System.out.println("(6) Largest Value of Array");
            System.out.println("(7) Smallest Value of Array");
            System.out.println("(8) Average of Array");
            System.out.println("(9) Exit");
            System.out.println("--------------------------------");
            System.out.print("Please enter a number:");

             
            x = input.nextInt();
            switch (x) {
                case 1:
                    initializeArray(arr);
                    break;
                case 2:
                    System.out.println("Enter a number to search the array for: ");
                    int key = input.nextInt();
                    System.out.println("The index of the number you searched is: " +linearSearch(arr, key));
                    break;
                case 3:
                    selectSort(arr);
                    break;
                case 4:
                    printArray(arr);
                    break;
                case 5:
                    System.out.println("The range of the array is: "
                    + range(arr)); 
                    break;
                case 6:
                    System.out.println("The largest number int the array is: "
                    + largest(arr)); 
                    break;
                case 7:
                    System.out.println("The smallest number int the array is: "
                    + smallest(arr)); 
                    break;
                case 8:
                    System.out.println("The average of the array is: "
                    + average(arr)); 
                    break;
                case 9:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    break;
            }

        } while (x != 9);
    }
}
