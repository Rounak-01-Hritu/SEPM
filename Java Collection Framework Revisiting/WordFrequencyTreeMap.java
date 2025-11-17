// WordFrequencyTreeMap.java
// Stores words and their frequencies using TreeMap
// TreeMap keeps keys sorted automatically

import java.util.*;

public class WordFrequencyTreeMap {
    public static void main(String[] args) {

        String text = "java is powerful and java is platform independent";
        String[] words = text.split(" ");

        TreeMap<String, Integer> freqMap = new TreeMap<>();

        for (String w : words) {
            freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Frequencies (Sorted):");
        System.out.println(freqMap);
    }
}
