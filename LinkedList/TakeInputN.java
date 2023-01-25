package LinkedList;

import java.util.Scanner;

public class TakeInputN extends LinkedListUse {
	public static Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail=null;
        
        while(data != -1){
          Node<Integer> currentNode= new Node<Integer>(data);
	          if(head==null){
	            head=currentNode;
	            tail=currentNode;
	          }else{
	            tail.next= currentNode;
	            tail=currentNode;
	          }
          data=s.nextInt();
        }
        return head;
	}
	
	public static void main(String[] args){

	      Node<Integer> head = takeInput();
	  }
}
