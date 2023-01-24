package ArrayList;   // stored continuously

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arrlist= new ArrayList();   //ArrayList used to work on dynamic array , we can give initial capaity also.
		arrlist.add(10);
		arrlist.add(15);
		arrlist.add(20);     //add element at end
		for(int i=0; i<arrlist.size();i++) {   // here i= index
			System.out.println(arrlist.get(i));
		}
		
		// Enhanced for loop / for each loop
		for(int i:arrlist) {    // here i = element of arrlist
			System.out.println(i);
		}
		// default capacity of ArrayList in java is 10 and it gets increase generally by 1.5
		System.out.println(arrlist.size());   // no. of elements filled 
		arrlist.add(0,30);   // .add(index, element) adds element at index and moves other elements at their initial index+1 
		arrlist.set(0,5);   //.set(index, val)  replaces element at index with val
		arrlist.remove(2); //.remove(index)
		Integer i=2;
		arrlist.remove(i);
		arrlist.get(0);   // give element index
	}

}
