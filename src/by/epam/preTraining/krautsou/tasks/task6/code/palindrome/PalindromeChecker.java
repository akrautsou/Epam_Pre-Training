package by.epam.preTraining.krautsou.tasks.task6.code.palindrome;

import by.epam.preTraining.krautsou.tasks.task6.code.IStack;

public class PalindromeChecker {
    public static boolean isPalindrome(String string, IStack customStack) {
        string = string.toUpperCase();//O(1)
        StringBuilder reversedWord = new StringBuilder(); //O(1)
        for (int i = 0; i < string.length(); i++) {
            customStack.push(string.charAt(i));  //O(n) )
        }
        for (int i = customStack.getSize() - 1; i >= 0; i--) {
            reversedWord.append(customStack.pop());//O(n) )
        }
        return string.equals(reversedWord.toString());//O(1)
        //O(1) + O(1) + O(n) + O(n) + O(1)  = O(n)
        //где n - размерность строки
    }
}
