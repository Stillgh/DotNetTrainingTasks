package com.epam.nettrainingtasks.thirdtask;


import java.util.*;

public class UniqueWordSearcher {

    public void uniqueWordSearch(String string) {


//        можно было бы строку преобразовать в массив затем в список, потом создать ХэшСет на основе списка и
//        сравнить слова в множестве и первоначальном спике, подсчитывая частоту совпадения слов, используя Collections.frequency()
//        тогда бы код был таким
//        List<String> myList = Arrays.asList(string.toLowerCase().trim().split("[.,-:;?!~\\s]+"));
//        Set<String> unique = new HashSet<>(myList);
//        System.out.println(unique);
//        for (String word: unique) {
//            if (Collections.frequency(myList, word) == 1) {
//                System.out.println(word);
//            }
//        }

        String[] arrayFromString = string.toLowerCase().trim().split("[;:!?.,\\s]+");
        List<String> copyOfArrayFromString = new ArrayList<>();
        List<String> uniqueWords = new ArrayList<>();
        int matches = 0;

        for (String str : arrayFromString) {
            copyOfArrayFromString.add(str);
        }
        for (String word : copyOfArrayFromString) {
            for (int i = 0; i < arrayFromString.length; i++) {
                if (word.equals(arrayFromString[i])) {
                    matches++;
                }
            }
            if (matches == 1) {
                uniqueWords.add(word);
            }
            matches = 0;
        }

        System.out.println("Unique words in it: " + uniqueWords);
    }
}
