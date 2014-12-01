package innerclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * 
 * @author Administrator
 *
 */
public class UseCollection {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(
				1, 2, 3, 4, 5));

		Integer[] moreInteger = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInteger));

		Collections.addAll(collection, 11, 12, 13, 14, 15);
		for (Integer integer : collection) {
			System.out.print(integer + " ");
		}

		Iterator<Integer> i = collection.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
		ListIterator<Integer> listi = arrayList.listIterator();
		while (listi.hasNext()) {
			System.out.println(listi.next() + " " + listi.nextIndex() + " "
					+ listi.previousIndex());
		}
		//将linkedlist作为栈使用
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.push(1);
		linkedList.push(2);
		System.out.println("statck's pop:" + linkedList.pop());
		//将linkedlist作为队列使用
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		System.out.println("queue's pop:"+linkedList.peek());
		// Set
		Integer[] nums = { 6, 1, 3, 5, 4, 7, 2, 8, 10 };

		// hashSet
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(nums));
		// treeSet
		TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(nums));
		// linkedSet
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(
				Arrays.asList(nums));

		System.out.println(hashSet);
		System.out.println(treeSet);
		System.out.println(linkedHashSet);

		System.out.println(Integer.MAX_VALUE);
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "P1");
		hashMap.put(2, "p2");
		hashMap.put(3, "P3");
		hashMap.put(4, "P4");
		hashMap.put(5, "P5");
		hashMap.put(6, "P6");
		hashMap.put(7, "P7");
		System.out.println(hashMap);

		for (Integer key : hashMap.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		for (String value : hashMap.values()) {
			System.out.print(value + " ");
		}

		System.out.println("yalihaoda!~");
		Date date = new Date();
		long l = date.getTime();
		System.out.println(l);
		
		byte b = (byte) 130;
		System.out.println(b);
	
		float f = 2.4f;
		int a = 3;
		f = a + f;
		
		byte b1 = 4;
		byte b2 = 5;
		byte b3 = 6;
		
		int i_1 = 1;
		int i_2 = ++i_1;
		System.out.println(i_2);
		
		System.out.println(6&3);
		
		System.out.println(~6);
	}
}
