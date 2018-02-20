package by.epam.preTraining.krautsou.tasks.task2.code.symbol;

import java.io.UnsupportedEncodingException;

public class CheckVowels {
    private static final char[] VOWELS = {'a', 'i', 'o', 'e', 'u', 'y'};

    // switch
    public boolean isVowelsFirst(Character symbol) {
        switch (symbol) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
        }
        return false;
    }

    // array
    public boolean isVowelsSecond(Character symbol) {

        return symbol == VOWELS[0] ||
                symbol == VOWELS[1] ||
                symbol == VOWELS[2] ||
                symbol == VOWELS[3] ||
                symbol == VOWELS[4] ||
                symbol == VOWELS[5];
    }

    //if
    public boolean isVowelsThirst(Character symbol) {
        return symbol == 'a' ||
                symbol == 'i' ||
                symbol == 'o' ||
                symbol == 'e' ||
                symbol == 'u' ||
                symbol == 'y';
    }

    //contains
    public boolean isVowelsFourth(Character symbol) {
        String string = Character.toString(symbol);
        return "a i o e u y ".contains(string);
    }

    //code
    public boolean isVowelsFifth(Character symbol) {
        String s = Character.toString(symbol);
        byte[] codes = new byte[0];
        try {
            codes = s.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte code = codes[0];
        return code == 97 ||
                code == 105 ||
                code == 111 ||
                code == 101 ||
                code == 117 ||
                code == 121;
    }
}
