package com.org.tav.day9;

public class BridgeMain {
	public static void main(String[] args) {
        SimpleAccount account = new SimpleAccount(100);
        SimpleAccount account1 = new SimpleAccount(1000000);
        account.withdraw(75);//true
        account.withdraw(275);//false
        if (account.isBalanceLow()) {
            // you can also change the Logger implementation at runtime
            account.setLogger(Logger.warning());
        }
        
        account.withdraw(10);
        account.withdraw(100);
    }
}
