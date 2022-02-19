/*
Digital watches
Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59),
i.e. first goes the number of hours, then goes the two-digit number of minutes,
followed by the two-digit number of seconds. If necessary, number of minutes and seconds
are filled by zeroes to a two-digit number.

N seconds passed from the beginning of the day. Output what the watches will display.

Input data format

Given the natural number N on input, not exceeding 10^7 (10000000)

Sample Input 1:
3602
Sample Output 1:
1:00:02

Sample Input 2:
129700
Sample Output 2:
12:01:40
 */

package com.example;

import java.util.Scanner;

public class TaskOneSix {

    public static void main(String[] args) {
        int seconds, minutes = 0, hours = 0;

        Scanner scanner = new Scanner(System.in);
        seconds = scanner.nextInt();

        while (seconds > 86399) {
            seconds = seconds - 86400;
        }
        hours = seconds / 3600;
        seconds = seconds % 3600;

        if (seconds >= 60) {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }

        System.out.println(String.format("%1d:%02d:%02d", hours, minutes, seconds));

    }
}
