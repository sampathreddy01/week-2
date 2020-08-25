package transaction;

import java.util.HashMap;

public class TransactionRate {

	
	public static HashMap<String, Float> rates = new HashMap<String, Float>();
	static {
		rates.put("high" , (float) 500.0);
		rates.put("BUY" , (float) 50.0);
		rates.put("SELL" , (float) 100.0);
		rates.put("DEPOSIT" , (float) 50.0);
		rates.put("WITHDRAW" , (float) 100.0);
		rates.put("INTRADAY" , (float) 10.0);
		
	}
	
	
}