import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int returnValue=0;
		for(String key: hashmap1.keySet()) {
			for(String key1: hashmap2.keySet()) {
				if(key==key1 && hashmap1.get(key)==hashmap2.get(key1)) {
					returnValue++;
					System.out.println(key);
				}
			}
		}
		return returnValue;
	}

}
