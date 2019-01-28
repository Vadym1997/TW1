package intetics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Palindrome {
   static TreeSet<Calculate> palindromes = new TreeSet<>();

       private static void findPalindrome(long simpleNumberOne,long simpleNumberTwo){
           long multyply = simpleNumberOne * simpleNumberTwo;
           String strResult = String.valueOf(multyply);
           if (strResult.equals(new StringBuilder(strResult).reverse().toString())) {
               palindromes.add(new Calculate(multyply, simpleNumberOne, simpleNumberTwo));
           }
       }


       public static Calculate biggestPal(List <Long > simpleFiveDigitNumbers) {
           for (int i = 0; i < simpleFiveDigitNumbers.size(); i++) {
               for (Long number : simpleFiveDigitNumbers) {
                   long arg1 = simpleFiveDigitNumbers.get(i);
                   long arg2 = number;
                   Palindrome.findPalindrome(arg1, arg2);
               }
           }
           return palindromes.last();
       }

}
