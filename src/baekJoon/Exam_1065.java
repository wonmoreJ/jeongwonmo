package baekJoon;

import java.util.Scanner;
import java.util.stream.Stream;

public class Exam_1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int count = 0;

        for (int i=1; i<=input; i++){
            if (i<100){
                count++;
            }else {
                if (intReturn(i)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean intReturn (int a){
        int [] digits = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
        int b = 0;
        boolean flag = true;

        for (int i=0; i<digits.length;i++){
            if(i != digits.length-1){
                if (i==0){
                    b = digits[i] - digits[i+1];
                } else {
                    int c = digits[i] - digits[i+1];
                    if (c != b){
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}