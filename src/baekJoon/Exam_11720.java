package baekJoon;

import java.util.Scanner;
import java.util.stream.Stream;

public class Exam_11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input = sc.next();

        int [] arr = Stream.of(String.valueOf(input).split("")).mapToInt(Integer::parseInt).toArray();
        int result = 0;

        for (int i=0; i<arr.length; i++){
            result += arr[i];
        }
        System.out.println(result);
    }
}
