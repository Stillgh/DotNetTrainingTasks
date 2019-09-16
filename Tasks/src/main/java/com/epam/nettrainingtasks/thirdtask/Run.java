package com.epam.nettrainingtasks.thirdtask;

public class Run {
    public static void main(String[] args) {
        String str = "Hello how are! you. what doing, hello ,are great no.";
        System.out.println("Default string:  " + "\"" + str + "\"");
        UniqueWordSearcher myWordSearcher = new UniqueWordSearcher();
        myWordSearcher.uniqueWordSearch(str);
    }
}
