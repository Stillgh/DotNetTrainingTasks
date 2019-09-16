package com.epam.nettrainingtasks.fifthtask;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        String brackets = "(){}[][,]{!({[]})}";
        String[] strings = brackets.trim().split("[;:!?.,\\s]+");
        String stringWithOutUnnecessarySymbols = Arrays.toString(strings);
        char[] newChars = stringWithOutUnnecessarySymbols.toCharArray();

        BracketSequenceValidator myBracketSequenceValidator = new BracketSequenceValidator();
        myBracketSequenceValidator.validateBracketSequence(newChars);
    }
}
