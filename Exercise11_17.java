/** 
*Program: Algebra: a perfect square
*File: Exercise11_17.java
*Summary: Prompts the user to enter 
*an integer m and find the smallest 
*integer n such that m * n is a 
*perfect square.
*Author: Charles Maple III
*Date: July 23,2016 
**/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 
{
    private static Scanner input;

	public static void main(String[] args) {
        System.out.print("Enter an integer m: ");
        input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<Integer>();

        getFactors(m, factors);

        int smallestSquare = smallestSquare(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }

    private static int smallestSquare(ArrayList<Integer> factors) 
    {
        int[][] occurrences = copy(factors);
        for (int i : factors) 
        {
        	search(occurrences, i);
        }

        // remove duplicates and get odd sequence factors
        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

        // get smallest square by multiplying oddSequenceFactors
        int smallestSquare = 1;
        for (int i : oddSequenceFactors) 
        {
            smallestSquare *= i;
        }
        return smallestSquare;
    }

    private static ArrayList<Integer> removeDuplicates(int[][] m) 
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < m.length; i++) 
        {
            if (m[i][1] % 2 != 0) 
            {
                temp.add(m[i][0]);
            }
        }

        // removing duplicates
        ArrayList<Integer> duplicateRemoved = new ArrayList<Integer>();
        for (int i = 0; i < temp.size(); i++) 
        {

            if (!duplicateRemoved.contains(temp.get(i))) 
            {
                duplicateRemoved.add(temp.get(i));
            }
        }

        return duplicateRemoved;
    }

    private static void search(int[][] m, int number) 
    {
        for (int i = 0; i < m.length; i++) 
        {
            if (m[i][0] == number) 
            {
                m[i][1]++;
            }
        }
    }

    private static int[][] copy(ArrayList<Integer> factors) 
    {
        int[][] temp = new int[factors.size()][2];

        for (int i = 0; i < temp.length; i++) 
        {
            temp[i][0] = factors.get(i);
        }
        return temp;
    }

    private static void getFactors(int m, ArrayList<Integer> factors) 
    {
        int count = 2;
        while (count <= m) 
        {
            if (m % count == 0) 
            {
                factors.add(count);
                m /= count;
            }
            else 
            {
                count++;
            }
        }
    }

}