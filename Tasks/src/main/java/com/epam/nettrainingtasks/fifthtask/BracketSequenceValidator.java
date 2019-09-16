package com.epam.nettrainingtasks.fifthtask;

public class BracketSequenceValidator {


    public void validateBracketSequence(char[] bracketArray) {
        //Если показатель больше 0, то значит есть открывающая скобка соответствующего типа, а закрывающей нет.
        // Если значение отрицательное, то есть закрывающая, а открывающей нет.
        int round = 0;
        int square = 0;
        int curly = 0;

        for (int i = 0; i < bracketArray.length; i++) {

            switch (bracketArray[i]) {
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    break;
            }

            //если показатель меньше 0, то значит есть закрывающая скобка, а открывающей нет
            if (round < 0 || square < 0 || curly < 0) {
                System.out.println("Brackets are not in correct order!");
                return;
            }

            //Проверка на пересечение скобок напр."({)}", если i-тая скобка - открывающая, а следующая за ней - закрывающая и другого типа, то скобки неверно стоят
            if ((bracketArray[i] == '(') && (bracketArray[i + 1] == '}' || bracketArray[i + 1] == ']')) {
                System.out.println("Brackets are not in correct order!");
                return;
            }

            if ((bracketArray[i] == '[') && (bracketArray[i + 1] == '}' || bracketArray[i + 1] == ')')) {
                System.out.println("Brackets are not in correct order!");
                return;
            }

            if ((bracketArray[i] == '{') && (bracketArray[i + 1] == ')' || bracketArray[i + 1] == ']')) {
                System.out.println("Brackets are not in correct order!");
                return;
            }

        }

        if (round == 0 && square == 0 && curly == 0) {
            System.out.println("All brackets are in correct order");
        } else {
            System.out.println("Brackets are not in correct order!");
        }
    }


}
