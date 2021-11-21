package com.bridgelabz;

public class Main {

	public static void main(String[] args) {

		String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = string.split(" ");

		HashMap<String, Integer> linkedHashMap = new HashMap<>();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			Integer value = linkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} 
			else {
				value += 1;
			}
			linkedHashMap.put(word, value);
		}
		System.out.println(linkedHashMap.get("paranoid"));
	}
}
