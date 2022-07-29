package com.org.tav.itr;

public class CollectionTypes implements Container {

	public String name[]= {"Anubhav " , "Harsha ", "Shivam ","Shivesh ", "Harshita ", "Reethik " , " Dheeraj" , "Rajendra "};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CollectionNameItr();
	}
	
	private class CollectionNameItr implements Iterator{

		int i ;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(i<name.length) {
			return true;}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return name[i++];
			}
			return null;
		}
		
	}

}
