package dongkii.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String a = N.substring(0, N.length()/2), b = N.substring(N.length()/2, N.length()), c, d;
        for(int i=0;i<b.length();i++) {
            String t = new StringBuffer(a).reverse().toString();
            c=a+t;
            a+=b.charAt(i);
            d=a+t;
            if(c.contains(N)) {
                System.out.println(c.length());
                break;
            }
            if(d.contains(N)) {
                System.out.println(d.length());
                break;
            }
        }
    }
}
