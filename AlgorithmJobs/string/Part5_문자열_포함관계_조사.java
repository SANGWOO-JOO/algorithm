package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Part5_문자열_포함관계_조사 {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();
        String s2 = br.readLine();

        if(s1.contains(s2)) bw.write("YES");
        else bw.write("NO");
        br.close();
        bw.flush();
        bw.close();
    }
}
