//Ashley Grafner
//CSC 10606080, Computer Science 1 (Java)
//9/22/2022
//This program will create an array with ints. The array will read and print the smallest int

import java.util.*;  
class Main {
  public static void main(String[] args) {
    
    int [] numberArray = {23, 79, 41, 68, 17, 39, 51, 75, 95, 19};
    int min = numberArray[0]; //sets min = index of 0 (changes later)
    
    for (int i=1; i < numberArray.length; i++) { //checks each int in array
      if (numberArray[i] < min) { //when it finds the smallest...
        min = numberArray[i]; //min will = # in array
      }
    }
    
    System.out.println("Integer values: " + (Arrays.toString(numberArray).replace("[", "").replace("]", " "))); //removes brackets to print
    System.out.println("Smallest integer:"+" "+min); //prints smallest int in array
   
  }
}


//Passed input/output tests

//On the first print message I wanted to remove brackets when prinitng our array. This means that you can change the #s in the array and it should still work