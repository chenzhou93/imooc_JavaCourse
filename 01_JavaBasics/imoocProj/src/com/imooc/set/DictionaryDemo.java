package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> animal = new HashMap<String, String>();
		System.out.println("please input 3 pairs of words");
		Scanner console = new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("please input key: " );
			String key = console.next();
			System.out.println("please input value: " );
			String value = console.next();
			animal.put(key, value);
			i++;
		}
		System.out.println("*******************");
		
		System.out.println("use iterator to output all values");
		
		Iterator<String> it = animal.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*******************");
		//print key & value
		//entrySet method
		System.out.println("entrySet to get key and value");
		
		Set<Entry<String, String>> entrySet = animal.entrySet();
		
		for(Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		//keySet
		String strSearch = console.next();
		Set<String> keySet = animal.keySet();
		for(String key: keySet) {
			if(strSearch.equals(key)) {
				System.out.println("found it " + key + " " + animal.get(key));
				break;
			}
		}
		

	}

}
