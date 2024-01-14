/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo;

/**
 *
 * @author Anthony
 */
public class SortingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int [] mynumbers = {5, 1 , 4 , 3 , 7};
        
        System.out.println("\n"+"The current values in the array are: "+"\n");
        
        for (int a = 0; a<mynumbers.length; a++){
            System.out.print(mynumbers[a]);
        }
        
        System.out.println("\n"+"Below is the Bubble sorted values");
        
        bubbleSort(mynumbers);  // calling the Bubble sort method
        // after the bubble sort is done, values in the array have been rearranged according to bubble sort.
        // now we loop through the array to print out the sorted values.
         for (int x = 0; x<mynumbers.length; x++){
            System.out.print(mynumbers[x]);
         }
         
         System.out.println("\n"+"Below is the selection  sorted values");
         selectionSort(mynumbers); // calling the Selection sort method
          for (int b = 0; b<mynumbers.length; b++){
            System.out.print(mynumbers[b]);
        }
         System.out.println("\n"+"Below is the insertion  sorted values");
          insertionSort(mynumbers);
          for (int c = 0; c<mynumbers.length; c++){
            System.out.print(mynumbers[c]);
          }
            System.out.println("\n"+"Now do the sorting on paper to check.");
    } // end of main
   
    
    
    

//==========BUBBLE SORT METHOD =================
  private static void bubbleSort (int input[])
{
boolean swopped = false;
   for(int j = 0; j < input.length; j++)
      {
          for (int i = 0; i < (input.length -1); i++)
          {
          if(input[i] > input[i+1])
             {
                int temp = input[i]; //swop values
                input[i] = input[i+1];
                input[i+1] = temp;
                swopped = true;
             }
      }
     if(!swopped)
     break;
      }
} // end of bubble sort method

  //========== SELECTION SORT METHOD =================
   public static void selectionSort(int[] list)
{
     for (int i = 0; i < list.length; i++){
      int currentMin = list[i];
      int currentMinIndex = i;
         for (int j = i + 1; j < list.length; j++){
             if (currentMin > list[j])
             {
              currentMin = list[j];
              currentMinIndex = j;
                System.out.println(list[j]); 
             }
          } // end of inner for loop
      if (currentMinIndex != 1){
      list[currentMinIndex] = list[i];
      list[i] = currentMin;
     
       }
     } //end of outer for loop 
     
}// end of selection sort method
   
   //==========INSERTION SORT METHOD =================
 public static void insertionSort(int[] list)
{
for (int i = 0; i < list.length; i++)
{
int currentElement = list[i];
int k;
for (k = i - 1; k >= 0 && list[k] > currentElement; k--)
{
list[k + 1] = list[k];
System.out.println(list[currentElement]);
}

list[k + 1] = currentElement;
//System.out.println(list[k + 1]);
}
}// end of insertion sort
 
}// end of class SortingDemo
 
 
