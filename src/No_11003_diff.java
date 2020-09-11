//https://www.acmicpc.net/problem/11003

// 윗줄부터 최소값 찾는 문제로 풀었을 때

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11003_diff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MAX_VALUE;
        int maxTree = 0;
        int date = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmpTree = max;
            max = Integer.MAX_VALUE;

            while(st.hasMoreTokens()){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp>maxTree && tmp<max){
                    max = tmp;
                }
            }

            if(max != cmpTree) {
                maxTree = max;
                date++;
            }
        }

        System.out.println(date);

    }
}
