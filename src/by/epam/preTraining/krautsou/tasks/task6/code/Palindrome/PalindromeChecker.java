package by.epam.preTraining.krautsou.tasks.task6.code.Palindrome;

import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomException;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomStack;

public class PalindromeChecker {
    public static boolean isPalindrome(String string, CustomStack customStack) throws CustomException {
        string = string.toUpperCase();
        customStack.setCapacity(string.length());
        StringBuilder reversedWord = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            customStack.push(string.charAt(i));
        }
        for(int i = customStack.getNumberOfElements()-1; i >= 0 ; i--){
            reversedWord.append(customStack.getArrayIndex(i));
        }
        return string.equals(reversedWord.toString());
    }
}
