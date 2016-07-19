package linked;

import java.util.Iterator;

public class ArrayList {
 public static void main(String[] args) {
	java.util.ArrayList<String> a1 = new java.util.ArrayList<String>();
	a1.add("Java");
	a1.add("c++");
	a1.add("pearl");
	a1.add("c");
	System.out.println(a1);
	System.out.println("does this list contains Java"+a1.contains("Java"));
	a1.add(2,"Cobol");
	System.out.println(a1);
	System.out.println("does this list is empty"+a1.isEmpty());
	System.out.println(a1.size());
	Iterator<String> itr=a1.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
