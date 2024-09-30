package MapTesting;

import java.util.HashMap;

public class MapConcept {
	

	public static void main(String[] args) {

		// collection: <key,value> pair
		// HashMap(C) ---> Map(I)
		// its non order based collection -- no order
		// one null key is allowed
		// but multiple null values can be allowed
		// <null,value> : it will stored at first position

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("chrome", 101);
		map.put("firefox", 96);
		map.put("edge", 111);

		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(100, 1);

		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("name", "veena");
		data.put("age", 35);
		data.put("designation", "SDET2");
		data.put("isperm", true);
		data.put("gender", 'f');
		// data.put(null, "pune");
		// data.put(null, "India");
		data.put("phone", null);
		data.put("city", null);
		// data.put(null, null);
		// data.put("address", " ");
		// data.put("", "32.33");
		// data.put("age", 37);

		System.out.println(data.get("name"));
		System.out.println(data.get("designation"));
		System.out.println(data.get("age"));// 37
		System.out.println(data.get("phone"));// null
		System.out.println(data.get(null));// null
		System.out.println(data.get("city"));// null
		System.out.println(data.get("address"));
		System.out.println(data.get(""));// 32.33

		System.out.println("-----");
		System.out.println(data);

//
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 20);
		empMap.put("Veena", 30);
		empMap.put("Veena", 30);
		empMap.put("Veena", 30);

		empMap.put("Sunil", 35);
		empMap.put("pradesh", 40);

		empMap.put(null, 34);

		System.out.println(empMap);

		System.out.println(empMap.size());
		
		String s = null;
		//System.out.println(Double.parseDouble(s));//NPE
		//System.out.println(Integer.parseInt(s));//NumberFormatException: null

	}

	

}
