package iteratorList;

import java.util.*;

public class ListMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Attributes

		List<Integer> itList = new ArrayList();
		List<Integer> listIt = new ArrayList();
		
		//itList
		
		itList.add(2);
		itList.add(5);
		itList.add(28);
		itList.add(35);
		itList.add(1050);
		ListIterator<Integer> it = itList.listIterator();
		//listIt
		
		listIt.add(3);
		listIt.add(9);
		listIt.add(33);
		listIt.add(200);
		listIt.add(497);
		listIt.add(1536);
		

		// Main Code
		
		while(it.hasNext()) {
			it.next();
		}
		while(it.hasPrevious()) {
			listIt.add(it.previous());
		}
		System.out.println(listIt);
	}

}
