package csye6200.neu.edu;

public class Driver {
public static void main(String args[]) {
	
	Queue1.demo();
	Queue2.demo();
	Stack1.demo();
	Stack2.demo();
}
}
/*Output:
<------------------------------------------Queue Implementation with Fixed length Queue data structure for int data types------------------------->
Enqueing->1
Enqueing->2
Enqueing->3
Front element is->1
Removing->1
Front element is->2
Queue size is->2
Queue is Not Empty
<---------------------------------Queue Implementation with Generic T data type--------------------------------------->
Enqueing->5
Enqueing->10
Enqueing->20
Front element is->5
Removing->5
Front element is->10
Queue size is->2
Queue is Not Empty
<-------------------------------Stack Implementation with Fixed length Queue data structure for int data types--------------------------->
Inserting->10
Inserting->20
Inserting->30
Removing->30
Inserting->40
Top emelment is->40
Stack size:3
Removing->40
Stack is not Empty
<------------------------------------Stack Implementation with Generic T data type---------------------------------->
Inserting->10
Inserting->20
Inserting->30
Removing->30
Inserting->40
Top emelment is->40
Stack size:3
Removing->40
Stack is not Empty*/
