package csye6200.neu.edu;
import java.util.*;
import java.io.*;
public class Queue2<T>{
	protected T[] arr;
	protected int front=0;
	protected int rear=0;
	protected int count=0;
	protected int size;
	protected int capacity;
	public Queue2(int size) {
		arr=(T[]) new Object[size];
		capacity=size;
		front=0;
		rear=-1;
		count=0;
	}
	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return(size()==0);
	}
	public boolean isFull() {
		return(size()==capacity);
	}
	public void enqueue(T item) {
		if(isFull()) {
			System.exit(1);
		}
		System.out.println("Enqueing->"+item);
		rear=(rear+1)%capacity;
		arr[rear]=item;
		count++;
	}
	public T dequeue() {
		if(isEmpty()) {
			System.exit(1);
		}
		T e=arr[front];
		System.out.println("Removing->"+arr[front]);
		front=(front+1)%capacity;
		count--;
		return e;
		}
	public T peek() {
		if(isEmpty()) {
			System.exit(1);
		}
		return arr[front];
	}
//	System.out.println("<----------QUEUE IMPLMENTATION WITH GENERIC T DATA TYPE----------->");
	public static void demo(){
		Queue2 q=new Queue2(5);
		System.out.println("<---------------------------------Queue Implementation with Generic T data type--------------------------------------->");
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(20);
		System.out.println("Front element is->"+q.peek());
		q.dequeue();
		System.out.println("Front element is->"+q.peek());
		System.out.println("Queue size is->"+q.size());
		if(q.isEmpty())
			System.out.println("Queue is Empty");
		else
			System.out.println("Queue is Not Empty");
	}
	
	
	
}