/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphdemo;

/**
 *
 * @author Anthony
 */
public class myStack {

    private final int SIZE = 20;
    private int[] st;
    private int top;

    public myStack() //constructor
    {
        st = new int[SIZE]; //make array top = -1;
    }

    public void push(int j) //put item on stack
    {
        st[++top] = j;
    }

    public int pop() //take item off stack
    {
        return st[top--];
    }

    public int peek() //peek at top of stack
    {
        return st[top];
    }

    public boolean isEmpty() //true if nothing on stack
    {
        return (top == -1);
    }

} // end of class myStack

