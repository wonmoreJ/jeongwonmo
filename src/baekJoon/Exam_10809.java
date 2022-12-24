package baekJoon;

import java.util.Scanner;

public class Exam_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.next().split("");
        //b,a,e

        boolean flag = true;

        for (char i='a'; i<='z'; i++){
            System.out.print(num(i,arr) + " ");
        }
    }

    public static int num(char str, String[] arr){
        int result = -1;
        for (int i=0; i<arr.length; i++){
            if (str == arr[i].charAt(0)){
                return i;
            }
        }

        return result;
    }
}
