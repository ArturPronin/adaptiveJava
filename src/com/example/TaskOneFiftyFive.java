/* "Task 1.55" The percentage of G and C characters
GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum
of all guanines and cytosines to the overall number of nucleic bases in the genome sequence.
Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the
entered string. Your program should be case independent.

For example, in the string "acggtgttat" the percentage of characters G and C equals to 4/10*100 = 40.0,
where 4 is the number of symbols G and C, and 10 is the length of the string.
Output your result as a double value.

Sample Input:
acggtgttat

Sample Output:
40.0
 */

package com.example;

import java.util.Scanner;

public class TaskOneFiftyFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        double numberSymbols = 0, percent, lenghtString = inputString.length();

        for (char element : inputString.toCharArray()) {
            if (element == 'g' || element == 'G') numberSymbols++;
            if (element == 'c' || element == 'C') numberSymbols++;
        }

        percent = numberSymbols / lenghtString * 100;

        System.out.println(percent);

    }
}
