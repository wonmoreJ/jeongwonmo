package baekJoon;

import java.util.Scanner;

public class Exam_1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[26];
        String a = sc.next();

        for (int i=0; i<a.length(); i++){

            if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
                arr[a.charAt(i)-'A']++;
            }
            else {
                arr[a.charAt(i)-'a']++;
            }
        }
        int max = 0;
        char ch = '?';

        for (int i=0; i<26; i++){
            if(max < arr[i]){
                max = arr[i];
                ch = (char) (i+65);
            }else if(max == arr[i]){
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}
