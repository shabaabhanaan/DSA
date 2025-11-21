import java.util.Scanner;

class QueueX{
  private int[] queueArr;
  private int maxSize;
  private int rear;
  private int front;
  private int noItems;

 public QueueX(int s){
   maxSize = s;
   queueArr =  new int[maxSize];
   rear = -1; 
   front = 0;
   noItems = 0;
 }
 
  public void insert(int j){
    if(rear == maxSize-1){
      rear = -1;
  queueArr[++rear] = j;
noItems++;
}

public int remove(){
   int temp = queueArr[front++];
   if(front == maxSize){
      front = 0;
   }
   noItems--;
   return temp;
}
public boolean isEmpty(){
  return (noItems == 0);
}
public boolean isFull(){
   return (noItems == maxSize);
}
}






