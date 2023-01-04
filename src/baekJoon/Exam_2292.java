package baekJoon;

import java.util.Scanner;

public class Exam_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int firstNum = 1;
        int lastNum  = 1;
        int result = 0;

        for (int i=1; i<=num; i++){
            int num1 = i*6;
            int num2 = (i-1) * 6;
            if (firstNum <=num && num <= lastNum){

                result = i;
                break;
            }
            lastNum = lastNum + num1;

            if (i == 1){
                firstNum++;
            }else
                firstNum += num2;


        }

        System.out.println(result);
    }
}
