package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Sabari");
		names.add("Raj");
		names.add("Arya");
		names.add("Tom");
		names.add("Billy");
		names.add("pope");

		/*
		 * --Java 8 forEach and lambda expression. 
		 * --iterator(). 
		 * --iterator() and Java 8 forEachRemaining() method. 
		 * -listIterator(). 
		 * --Simple for-each loop. 
		 * --for loop with index.
		 */

		// 1.Java 8 forEach and lambda expression
		System.out.println("----------Java 8 forEach and lambda expression------");

		names.forEach(name -> System.out.println(name));


		// 2.Iterator
		System.out.println("----------Iterator------");

		Iterator<String> name = names.iterator();

		while (name.hasNext()) {

			System.out.println(name.next());

		}

		System.out.println("------------------------");

		// 3.iterator() and Java 8 forEachRemaining() method

		name = names.iterator();

		name.forEachRemaining(n -> System.out.println(n));
		
		
		
		//4.ListIterator can be used to traverse in both direction 
		//ListIterator in forward 
		System.out.println("----------ListIterator in forward ------");
		ListIterator<String> forward = names.listIterator();

		while(forward.hasNext()){
			
			String forwardlist = forward.next();
			System.out.println(forwardlist);
						
		}
		
		//ListIterator in reverse
		System.out.println("----------ListIterator in reverse------");

				ListIterator<String> reverse = names.listIterator(names.size());

				while(reverse.hasPrevious()){
					
					String reverseList = reverse.previous();
					System.out.println(reverseList);
								
				}
				
		//5.Normal Foreach
				System.out.println("----------Noraml Foreach------");
				
		for(String ListName : names){
			
			System.out.println(ListName);
			
		}
		
		//6.Normal for Loop
		System.out.println("----------Noraml For loop------");
		
		for(int i=0;i<=names.size();i++){
			
			
			System.out.println(names.get(i));
			
		}
		
			
		
	}

}
