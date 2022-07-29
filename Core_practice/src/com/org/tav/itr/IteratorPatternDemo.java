package com.org.tav.itr;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  CollectionTypes col  = new CollectionTypes();
  for(Iterator  itr = col.getIterator();itr.hasNext();) {
	  String name =(String) itr.next();
	  System.out.println("Name : "+name);
  }
	}

}
