
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DSQueue {
    protected int [] array;
    protected int size;
    protected int rear = 0;
    protected int count = 0;
    
    public DSQueue(int size){
        this.size = size;
        array = new int[size];
    }
    
    public int getHead() throws Exception{
        if(size == 0){
            throw new Exception();
        }
        else
            return array[0];
    }
    
    public void enqueue(int object) throws Exception{
        if (count == size){
            throw new Exception();
        }
        else{
            array[rear++] = object;
            count++;
        }
    }
    
    public int dequeue() throws Exception{
        if(count == 0){
            throw new Exception();
        }
        else {
            int obj = array[0];
            count--;
            for(int i=1;i<=count;i++)
            {array[i-1] = array[i];            
            array[i] = 0;
            }
            rear --;
            return obj;
        }
    }
    
    void displayQueue(){
         System.out.println(Arrays.toString(array));
    }
    
}
