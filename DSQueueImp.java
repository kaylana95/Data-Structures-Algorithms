/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DSQueueImp {
    public static void main(String [] args) throws Exception{
        DSQueue ds = new DSQueue(3);
        ds.enqueue(7);
        ds.enqueue(8);
        ds.enqueue(9);
        ds.displayQueue();
        System.out.println("removed from head : "+ds.dequeue());
        System.out.println("At the head : "+ds.getHead());       
        ds.displayQueue();
    }
}
