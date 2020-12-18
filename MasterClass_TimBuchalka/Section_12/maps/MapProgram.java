package Section_12.maps;

import java.util.HashMap;
import java.util.Map;


public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        }else {
            languages.put("Java", "a compile high lever, object-orientated, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python" , "an interpreted, object-orientated, high-level programmng language with dynamic semantics");
        languages.put("Algol" , "an algorithmic language");
        languages.put("BASIC" , "Beginners All Purpose Symbolic Intruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        }else {
            languages.put("Java",  "this course is about Java");
            System.out.println("Java added successfully");
        }

        System.out.println("\n\n========================================================================\n");

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));

//        if(languages.remove("Algol", "an algorithmic language")) {
//            System.out.println("Algol removed");
//        }else {
//            System.out.println("Algol not removed, key/value not found");
//        }
//        languages.remove("Algol");

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
        System.out.println("\n========================================================================\n");

    }
}
