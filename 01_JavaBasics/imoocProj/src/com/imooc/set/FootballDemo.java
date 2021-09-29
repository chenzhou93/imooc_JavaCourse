package com.imooc.set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> champ = new HashMap<Integer, String>();
        champ.put(2014, "Germany");
        champ.put(2010, "Spain");
        champ.put(2006, "Italy");
        champ.put(2002, "Brazil");
		
		//使用迭代器的方式遍历
		Iterator it = champ.values().iterator();
		while(it.hasNext()){
		    System.out.println(it.next());
		}
		
        
        
		//使用EntrySet同时获取key和value
		Set<Entry<Integer, String>> enSet = champ.entrySet();
		for(Entry<Integer, String> entry: enSet){
		    System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
