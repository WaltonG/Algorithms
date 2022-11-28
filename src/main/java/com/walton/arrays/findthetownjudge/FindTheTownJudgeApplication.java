
package com.walton.arrays.findthetownjudge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheTownJudgeApplication {

    public static int reverseOnlyLetters(int[][] inputCards) {
        Set<Integer> mySet = new HashSet<Integer>();
        int highestCard = -1;
        mySet.add(highestCard);
        for (int i = 0; i < inputCards.length; i++) {
            Arrays.sort(inputCards[i]);
            for (int card : inputCards[i]) {
                if (mySet.contains(card)) {
                    mySet.remove(card);
                } else {
                    mySet.add(card);
                }
            }
        }
        for (int value : mySet) {
            highestCard = value;
        }
        return highestCard;
        }

    public static void main(String[] args) {
        int[][] input = new int[][] { { 4, 5 }, { 2, 2 } };
        System.out.println(reverseOnlyLetters(input));
    }

}
