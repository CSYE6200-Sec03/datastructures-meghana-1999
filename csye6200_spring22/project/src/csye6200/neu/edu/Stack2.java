package csye6200.neu.edu;

public class Stack2<T>{
	protected T[] arr;
	protected int top;
	protected int size;
   protected int capacity;
   public Stack2(int size) {
	   arr=(T[]) new Object[size];
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
   public void push(T item) {
   	if(isFull()) {
   		System.exit(1);
   	}
   	System.out.println("Inserting->"+item);
   	arr[++top]=item;
   }
   public T pop() {
   	if(isEmpty()) {
   		System.exit(1);
   	}
   	System.out.println("Removing->"+peek());
   	return arr[top--];
   }
   public T peek() {
   	if(isEmpty()) {
   		System.exit(1);  
   		}
   	return arr[top];
   }
   public static void demo() {
   	Stack1 s=new Stack1(5);
   	System.out.println("<------------------------------------Stack Implementation with Generic T data type---------------------------------->");   	
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
