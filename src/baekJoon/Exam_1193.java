package baekJoon;

import java.util.Scanner;

public class Exam_1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 2;
        int num = 3;

        if (N == 1){
            System.out.println("1/1");
            return;

        } else {

            while(N > num){
                count++;
                num = num + count;
            }

        }



        int firstNum = num - count + 1;
        int a = count;
        int b = 1;

        if (count%2 == 0){
            System.out.println(result(num, N, count, "even"));
        }else {
            System.out.println(result(num, N, count, "odd"));
        }
    }

    public static String result(int num, int N, int a, String eo){
        int b = 1;

        for (int i=0; i<(num - N); i++){
            a = a-1;
            b = b+1;
        }

        if (eo.equals("even")){
            return a + "/" + b;
        }else {
            return b + "/" + a;
        }
    }
}
