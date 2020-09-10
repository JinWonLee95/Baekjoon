//https://www.acmicpc.net/problem/18258

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class No_18258 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> dequ = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.contains("push")) {
                Integer data = Integer.parseInt(st.nextToken());
                dequ.add(data);
            }else if(command.equals("pop")) {
                bw.write(dequ.isEmpty()? -1 : dequ.poll());
                bw.newLine();
            }else if(command.equals("size")) {
                bw.write(dequ.size());
                bw.newLine();
            }else if(command.equals("front")) {
                bw.write(dequ.isEmpty()? -1 : dequ.peek());
                bw.newLine();
            }else if(command.equals("back")) {
                bw.write(dequ.isEmpty()? -1 : dequ.getLast());
                bw.newLine();
            }else if(command.equals("empty")) {
                bw.write(dequ.isEmpty()? 1 : 0);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();

    }

}