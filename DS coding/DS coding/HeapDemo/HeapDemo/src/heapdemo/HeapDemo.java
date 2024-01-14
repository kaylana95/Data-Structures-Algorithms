/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapdemo;

/**
 *
 * @author Anthony
 */
import java.util.ArrayList;

public class HeapDemo<E extends Comparable> {

    /**
     * @param args the command line arguments
     */
    //private java.util.ArrayList<E>list = new java.util.ArrayList<E>();
    private ArrayList<E> list = new ArrayList<E>();
    
    public HeapDemo()
   {
   }
    
    public HeapDemo(E[]objects)

{
for (int i = 0; i < objects.length; i++)
{
add(objects[i]);
}
}
    
    public void add(E newObject)
{
list.add(newObject); //append to the heap
int currentIndex = list.size() - 1; //the index of the last node
while (currentIndex > 0)
{
int parentIndex = (currentIndex - 1) / 2;
//swop if the current object is greater than its parent
if (list.get(currentIndex).compareTo(
list.get(parentIndex)) > 0)
{
E temp = list.get(currentIndex);
list.set(currentIndex, list.get(parentIndex));
list.set(parentIndex, temp);
}
else
{
break; //the tree is a heap now
}
currentIndex = parentIndex;
}
}  // end of add
    
    public E remove()
{
if (list.size() == 0)
{
return null;
}
E removedObject = list.get(0);
list.set(0, list.get(list.size() - 1));
list.remove(list.size() - 1);
int currentIndex = 0;
while (currentIndex < list.size())
{
int leftChildIndex = 2 * currentIndex + 1;
int rightChildIndex = 2 * currentIndex + 2;
//find the maximum between two children
if (leftChildIndex >= list.size())
{
break; //the tree is a heap
}
int maxIndex = leftChildIndex;
if (rightChildIndex < list.size())
{
if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0)
{
maxIndex = rightChildIndex;
}
}
//swop if the current node is less than the maximum
if (list.get(currentIndex).compareTo(
list.get(maxIndex)) < 0)
{
E temp = list.get(maxIndex);
list.set(maxIndex, list.get(currentIndex));
list.set(currentIndex, temp);
currentIndex = maxIndex;
}
else
{
break; //the tree is a heap
}
}
return removedObject;
}
/**
* Sort the values in the heap by repeatedly removing the root
*/
public void heapSort()
{
while(this.getSize() > 0 )
{
System.out.print(this.remove().toString()+", ");
}
}
/**
* Get the number of nodes in the tree
*/
public int getSize()
{
return list.size();
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        HeapDemo myHeap = new HeapDemo();
myHeap.add(20);
myHeap.add(6);
myHeap.add(78);
myHeap.add(40);
myHeap.add(5);
myHeap.heapSort();
        
        
    }
    
}
