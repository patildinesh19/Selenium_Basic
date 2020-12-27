package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class arraylistdemo
{
	public static void main (String arg[])
	{
		System.out.println("------------------ArrayList-------------------");
		ArrayList<String> a= new ArrayList<String>();
		a.add("Dinesh");
		a.add("Rajdeep");
		a.add("Rahul");
		a.add("Dinesh"); // we can add duplicate values in arrayList
		System.out.println(a);
		a.add(0, "Anirudha");
		System.out.println(a);
		System.out.println(a.contains("Dinesh")); // it will check Dinesh is present or not in arraylist
		a.remove(1);
		System.out.println(a);
		
		
		// hashset
		System.out.println("------------HashSet------------");
		HashSet<String> b= new HashSet<String> ();
		b.add("JAVA");
		b.add("Paython");
		b.add("C++");
		b.add("JAVA");
		System.out.println(b);
		System.out.println(b.contains("JAVA"));
		System.out.println(b.contains("C"));
		
		//Iterator is an Interface and we can used for traveling the item of hashset

		Iterator<String> it= b.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	//HashMAP in hasmap we can store item at define Index which is not possibel in set or hashset	
		System.out.println("---------hashMap----------");
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(0, "Pune");
		hm.put(1, "Mumbai");
		hm.put(2, "Nashik");
		hm.put(3, "Nagpur");
		hm.put(4, "kolhapur");
		hm.put(5, "Nashik"); //we can add duplicate values
		System.out.println(hm);
		
		//difference between hashmap and hashtable
		/*both are same 
		 * 1 . hashmap is non syncronized means mutiple program can access hasmap
		 *     where hashtable is syncronized means at time only one program can access hashttble 
		 * 2.  under hashmap we can store "Null" value or or null key "" 
		 *     where under hash table we can not store null value or null key 
		 * 3.  we can iterate values in hashmap using Iterator interface
		 *     we can not Iterator values under hashtable  */
		
		
		
	}
}
