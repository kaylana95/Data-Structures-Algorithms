/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueuedemo;

/**
 *
 * @author Anthony
 */
public class MyQueueDemo {

    /**
     * @param args the command line arguments
     */
    
    //implementing a circular queue inside an array
int[] theData; //array to act as a queue
int head;
int tail;
int size;
int num;
public MyQueueDemo(int queueSize)
{
theData = new int[queueSize];
head = 0; //nothing in queue yet
tail = 0;
size = queueSize;
num = 0;
}
public void enqueue(int item)
{
if (num <= size)
{ //check if all spaces are taken
if (tail == size) //loop round to beginning
{
tail = 0;
}
if (theData[tail] == 0)
{ //check not to overwrite the head
theData[tail++] = item;
num++;
}
else
{
System.out.println("Queue is full!");
}
}
else
{
System.out.println("Queue is full!");
}
}
public int dequeue()
{
int value = theData[head]; //retrieve value
theData[head] = 0; //reset to empty
if (head == size) //loop round to start
{
head = 0;
}
else
{
head++;
}
num--;
return value;
}
public boolean isEmpty()
{
return (num == 0);
}
public int size()
{
return size;
}
public void printQueue()
{
//prints out the values in the queue
for (int i = 0; i < size; i++)
{
if (i == head)
{
System.out.print(theData[i] + "(h), "); //the head
}
else if (i == tail)
{
System.out.print(theData[i] + "(t), "); //the tail
}
else
{
System.out.print(theData[i] + ", ");
}
}
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyQueueDemo q = new MyQueueDemo(10);
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
q.enqueue(4);
//q.dequeue();
q.enqueue(5);
q.enqueue(6);
//q.dequeue();
q.printQueue();
    }
    
}
