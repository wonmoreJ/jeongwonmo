package baekJoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        int b = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));

        System.out.println(a > b ? a : b);
    }
}
