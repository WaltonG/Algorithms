package com.walton.singlerowkeyboard;


public class SingleRowKeyboardApplication {

    public static int solution(String keyboard, String word) {
        int time = 0;
        int fromIndex = 0;

        for (Character c : word.toCharArray()) {
            time += Math.abs(fromIndex - keyboard.indexOf(c));
            fromIndex = keyboard.indexOf(c);
        }
        return time;

    }

    public static void main(String[] args) {
        System.out.println(solution("8459761203", "210"));

    }

}
