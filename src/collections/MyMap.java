/**
 * 
 */
package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lancre
 *
 */
public class MyMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("Java")) {
			System.out.println("Java already exists");
		}else {
			languages.put("Java", "a compiled high level, object-oriented, platform independent language");
			System.out.println("Java added already exists");
		}
		
		
		languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		languages.put("BASIC", "Beginners All Purposees Symbolic Instruction Code");
		languages.put("Lisp", "Therein lies madness");
		
		System.out.println(languages.get("Java"));
		
		if(languages.containsKey("Java")) {
			System.out.println("Java is already in the map");
		}else {
			languages.put("Java", "this course is about Java");
		}
		
		System.out.println("==============================");
		
		languages.remove("LISP");
		
		if(languages.remove("Algol", "an algorithmic language")) {
			System.out.println("Algol removed");
		}else {
			System.out.println("Algol not removed, key/value pair not found");
		}
		
		if(languages.replace("Lisp","Therein lies madness","a functional programming language with imperative features")) {
			System.out.println("Lisp Replaced");
		}else {
			System.out.println("Lisp was not replaced");
		}
		System.out.println(languages.replace("Scala", "this will not be added"));
		for(String key: languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}

	}

}
