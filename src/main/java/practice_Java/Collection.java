package practice_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

import com.google.gson.internal.LinkedHashTreeMap;

public class Collection {

	public void list() {
		System.out.println("This is a list");
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(110);
		aList.add(15);
		aList.add(20);
		aList.add(8);

		Iterator<Integer> i = aList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		for (int num : aList) {
			System.out.println(num);
		}

	}

	public void queue() {
		System.out.println("This is s Queue");
		Queue<String> queue = new LinkedBlockingQueue<>();

		queue.add("arshi");
		queue.add("subhro");
		queue.add("rohit");
		queue.add("maaz");
		// queue.add(null);

		Iterator<String> i = queue.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		queue.remove();
		for (String aText : queue) {
			System.out.println(aText);
		}
		System.out.println(queue.size());
	}

	public void vector() {
		System.out.println("This is a Vector");
		Vector<String> vector = new Stack<String>();

		vector.add("arshi");
		vector.add("subhro");
		vector.add("rohit");
		vector.add("maaz");
		vector.add(null);

		Iterator<String> i1 = vector.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
