/*Write a program that asks a user to input 10 integers and stores these 10 integers in an array. 
 Your program will then prints four line of output, containing:
 a. The original array.
 b. Swap the first and last elements in the array.
 c. Shift all elements by one to the right and move the last element into the first position. For 
 example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
 d. Replace all even elements with 0.
*/

import java.util.Scanner;



public class switchArr{
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int j = 0;
        int i = 0;
        int x = 0;
        int b = 0;
        
        int [] mainArr = new int [10];
        
        
        System.out.println("Enter 10 int values for array and press enter each time:");
        
        for(i = 0; i <= mainArr.length - 1; i++){
        while(!in.hasNextInt()){ //checks for integers only
            System.out.println("This value is not an integer");
            in.nextLine();
        }
            j = in.nextInt();
            mainArr[i] = j;
        }
        
        
        //PRINT Original Array
        System.out.println("Print original Array");
        for(i = 0; i <= mainArr.length - 1; i++){
        System.out.print(mainArr[i]);
        }
        
        System.out.print("\n");
        
        //Swapped
        x = mainArr[0];
        mainArr[0] = mainArr[9];
        mainArr[9] = x;
        
        System.out.println("Array with elements 0 and 9 swapped:");
        
        //Print array
        for(i = 0; i <= mainArr.length - 1; i++){
            System.out.print(mainArr[i]);
        }
        
        System.out.print("\n");
        
        System.out.println("Convert even numbers in array to 0:")
        
        for(i = 0; i <= mainArr.length - 1; i++){
            if(mainArr[i]%2 == 0){
                mainArr[i] = 0;
            }
            System.out.print(mainArr[i]);
        }
        System.out.print("\n");
            
    }
}
    
            
