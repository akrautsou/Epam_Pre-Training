package by.epam.preTraining.krautsou.tasks.task6.code.palindrome;

import by.epam.preTraining.krautsou.tasks.task6.code.IStack;

public class PalindromeChecker {
    public static boolean isPalindrome(String string, IStack customStack) {
        string = string.toUpperCase();
        StringBuilder reversedWord = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            customStack.push(string.charAt(i));
        }
        for (int i = customStack.getSize() - 1; i >= 0; i--) {
            reversedWord.append(customStack.pop());
        }
        return string.equals(reversedWord.toString());
    }
}
