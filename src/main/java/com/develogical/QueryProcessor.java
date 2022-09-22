package com.develogical;
import java.util.ArrayList;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Eric/Yonah/Michael";
        }

        if (query.toLowerCase().contains("largest") && 
            query.toLowerCase().contains("number")) {

            ArrayList<Double> numbers = new ArrayList<Double>();
            String[] words = query.toLowerCase().split(" ");

            for (int i = 0; i < words.length; i++) {
                try {  
                    numbers.add(Double.parseDouble(words[i]));
                    } 
                catch(NumberFormatException e){} 
            }

            if (numbers.size() == 0) {
                return "No numbers found in query";
            }

            double max = 0;

            for (int i = 0; i < numbers.size(); i++) {
                if (Double.parseDouble(words[i]) > max) {
                    max = Double.parseDouble(words[i]);
                }
            }
            
            return String.valueOf(max);
        }

        return "";
    }
}
