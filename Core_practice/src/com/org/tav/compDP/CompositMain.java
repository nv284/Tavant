package com.org.tav.compDP;

public class CompositMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child c1 = new Child("marry","com");
    Parent p1 = new Parent("Emily", "Joseph");
    Parent p2 = new Parent("Boman", "Tose");
    
    c1.addparant(p1);//adding parent for child
    c1.addparant(p2);//adding parent for the child 
    
    p1.addChild(c1);//both parents have one child
    p2.addChild(c1);
    
    GandParants g1 = new GandParants("Philip", "Lee");
    
    g1.addChild(p1);//granparnet child means parents of child
    p1.addparant(g1);//adding parent for parents 
    
    g1.print();
    p1.print();
    p2.print();
    c1.print();
	}

}
