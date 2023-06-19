package com.green.java.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();
        int i= Integer.parseInt(str);

        for(int z=0; z<i; z++){

            String A = br.readLine();
            int AA= Integer.parseInt(A);
            String B = br.readLine();
            int BB= Integer.parseInt(B);
            bw.write(Integer.parseInt(st.nextToken()));
        }
    }
}
