package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam_2941 {
    public static void main(String[] args) throws IOException {
        /*
        크로아티아 알파벳	변경
                    dž	dz=
                    đ	d-
                    lj	lj
                    nj	nj
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (i != str.length()-1){
                if (ch == 'c' || ch == 's' || ch == 'z'){
                    if (str.charAt(i+1) == '='){
                        i++;
                    } else if (ch == 'c' && str.charAt(i+1) == '-') {
                        i++;
                    }
                } else if (ch == 'd') {
                    if (str.charAt(i+1) == '-'){
                        i++;
                    } else if (str.charAt(i+1) == 'z') {
                        if (i != str.length()-2){
                            if (str.charAt(i+2) == '='){
                                i += 2;
                            }
                        }
                    }
                } else if (ch == 'l' || ch == 'n') {
                    if (str.charAt(i+1) == 'j'){
                        i++;
                    }

                }
            }
            count++;
        }

        System.out.println(count);

    }
}
