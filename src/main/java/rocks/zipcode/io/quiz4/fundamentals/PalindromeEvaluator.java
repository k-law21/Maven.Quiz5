package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

            Set<String> palindromes = new HashSet<>();
            for (int i = 0; i < string.length(); i++) {
                for (int j = i + 1; j <= string.length(); j++) {
                    if (isPalindrome(string.substring(i, j))) {
                        palindromes.add(string.substring(i, j));
                    }
                }
            }
            return palindromes.toArray(new String[0]);
        }

    public static Boolean isPalindrome(String string) {

        int i = 0;
        int j = string.length()-1;

        while ( i < j) {

            if (string.charAt(i) != string.charAt(j))
                return false;

            i++;
            j--;
        }

            return true;

    }

    public static String reverseString(String string) {
        String reverse = new StringBuilder(string).reverse().toString();

        return reverse;
    }
}
