package income;
import java.util.HashMap;

public class conversion {

	static HashMap<String , Float> conversionRate = new HashMap<String, Float>();
	static 
	{
		conversionRate.put("USD" , (float) 1.0);
		conversionRate.put("INR" , (float) 66.0);
		conversionRate.put("GBP" , (float) 0.67);
		conversionRate.put("SGD" , (float) 1.5);
		conversionRate.put("HKD" , (float) 8.0);
	}
	public static float convert(String currency, float amount) {
	
		float conversionFactor = conversion.getCurrentFactor(currency);	
		return (float) amount / conversionFactor;
	}
	public float getCurrentFactor(String currency) {
		return conversion.get(currency);
	}

}