package intetics;

import java.util.Objects;

public class Calculate implements Comparable<Calculate>{
    private long palindrome;
    private long NumberOne;
    private long NumberTwo;

    public Calculate(long palindrome, long numberOne, long numberTwo) {
        this.palindrome = palindrome;
        NumberOne = numberOne;
        NumberTwo = numberTwo;
    }

    public long getPalindrome() {
        return palindrome;
    }

    public long getNumberOne() {
        return NumberOne;
    }

    public long getNumberTwo() {
        return NumberTwo;
    }

    @Override
    public int compareTo(Calculate calculate) {
        if (this.palindrome > calculate.getPalindrome()) {
            return 1;
        } else if (this.palindrome < calculate.getPalindrome()) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public int hashCode() {

        return Objects.hash(getPalindrome(),getNumberOne(),getNumberTwo());
    }
}
