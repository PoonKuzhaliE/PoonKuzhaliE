import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
	public static void main(String args[]) {
		LinkedList<String>list=new LinkedList<>();
		list.add("ram");
		list.add("janu");
		list.add("ramu");
		list.add("abi");
		list.add(3,"som");
		list.set(3,"shan");
		list.addFirst("first name");
		list.addLast("Last name");
		//list.removeFirst();
		//list.removeLast();
		list.contains("shant");
		list.offerFirst("FIRST ELEMENT");
		list.offerLast("LAST ELEMENT");
	/*	for(String s:list) {
			System.out.println(s);
		}*/System.out.println("java has typr e ");
		
//ListIterator using for bidirectional traversal to achieve ListIterator using a method listIterator()
//Iterator using for single directional traversal to achieve ListIterator using a method iterator()
	   ListIterator<String> it3 = list.listIterator();
	     System.out.println("USING LISTITERATOR FOR FORWARD TRAVERSAL");
	     while(it3.hasNext()) {
	    	 System.out.println(it3.next());
	     }
	     System.out.println("USING LISTITERATOR FOR BACKWARD TRAVERSAL");
	     System.out.println();
	      while (it3.hasPrevious()) {
	          System.out.println(it3.previous());
	      }
	      
	      System.out.println();
		System.out.println("ORIGINAL LINKEDLIST");
		   Iterator<String>it=list.iterator();
		   while(it.hasNext()) {
			   System.out.println(it.next());
			   }
		   
		     System.out.println();
	  LinkedList<String>list2=new LinkedList<String>();
		System.out.println("CLONED LINKEDLIST");
		list2=(LinkedList<String>) list.clone();
		list2.add("clone");
		Iterator<String>it2=list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println(list.indexOf("shan"));
		System.out.println(list.size());
		System.out.println(list2.size());
		
		int[]a={1,2,3,4,5,6,7,8,9};
LinkedList<Integer>list3=new LinkedList<Integer>();
for(int b:a) {
	list3.add(b);
}
System.out.println(list3);

	}
	 }
