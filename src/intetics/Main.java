package intetics;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final String SOURSE_DATA = "src\\intetics\\prime.txt";
    public static void main(String[] args) throws IOException {

            File file = new File(SOURSE_DATA);
            String path = file.getAbsolutePath();
       // System.out.println(path);
            List<Long> simpleFiveDigitNumbers = new ArrayList<>();

           BufferedReader br = Files.newBufferedReader(Paths.get(path));
                simpleFiveDigitNumbers = br.lines().map(Long::valueOf).collect(Collectors.toList());

        //System.out.println(simpleFiveDigitNumbers);

            Calculate maxPalindrome = Palindrome.biggestPal(simpleFiveDigitNumbers);

        System.out.println("Максимальний паліндром"+" "+  maxPalindrome.getPalindrome());
        System.out.println("Просте число1"+" "+ maxPalindrome.getNumberOne());
        System.out.println("Просте число2"+" "+ maxPalindrome.getNumberTwo());

        }


    }

