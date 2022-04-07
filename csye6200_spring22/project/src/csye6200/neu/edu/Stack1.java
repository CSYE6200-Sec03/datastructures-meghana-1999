package csye6200.neu.edu;
import java.util.*;
import java.io.*;
public class Stack1 {
	int top;
	int size;
    int capacity;
    int[] arr;
    public Stack1(int size) {
    	arr=new int[size];
    	capacity=size;
    	top=-1;
    }
    public int size() {
    	return top+1;
    }
    public boolean isEmpty() {
    	return top==-1;
    }
    public boolean isFull() {
    	return(top==capacity-1);
    }
    public void push(int item) {
    	if(isFull()) {
    		System.exit(1);
    	}
    	System.out.println("Inserting->"+item);
    	arr[++top]=item;
    }
    public int pop() {
    	if(isEmpty()) {
    		System.exit(1);
    	}
    	System.out.println("Removing->"+peek());
    	return arr[top--];
    }
    public int peek() {
    	if(!isEmpty()) {
    		return arr[top];
    	}
    	else {
    		System.exit(1);
    	}
    	return -1;
    }
    public static void demo() {
    	Stack1 s=new Stack1(5);
    	System.out.println("<-------------------------------Stack Implementation with Fixed length Queue data structure for int data types--------------------------->");   	
    	s.push(10);
    	s.push(20);
    	s.push(30);
    	s.pop();
    	s.push(40);
    	System.out.println("Top emelment is->"+s.peek());
    	System.out.println("Stack size:"+s.size());
    	s.pop();
    	if(s.isEmpty())
        System.out.println("Stack is Empty");
   else
      System.out.println("Stack is not Empty");
    }
}
