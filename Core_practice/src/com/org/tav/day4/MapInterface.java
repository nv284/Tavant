package com.org.tav.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer	, String> map = new HashMap<>();
		map.put(1, "Red");
		map.put(102, "Blue");
		map.put(103, "Black");
		map.put(104, "Pink");
		map.put(105, "Green");
		System.out.println("Entries in Map ");
		int size = map.size();
       System.out.println("No of Entries in Map "+size);
       
       //create Another Map
       HashMap<Integer, String> map2 = new HashMap<>();
       map2.put(115, "Brown");
       map2.put(116, "Purple");
       map2.put(120, "Green");
       map.putAll(map2);
       
       map.forEach((k,v)->System.out.println(" Color Id "+k+"name :"+v));
     
       for(Map.Entry<Integer, String>entry:map.entrySet())
       {  System.out.println("Iterating Entries of Map ");
      // entrySet() Method
       System.out.println("Color Id "+entry.getKey()+"  "+"color Name : "+entry.getValue());
       
       }
       for(Integer Id : map.keySet())
    	   System.out.println("Id : "+Id);
       System.out.println();
            }

}
