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
                bw.write(dequ.isEmpty()? -1+"\n": dequ.poll()+"\n");
            }else if(command.equals("size")) {
                bw.write(dequ.size()+"\n");
            }else if(command.equals("front")) {
                bw.write(dequ.isEmpty()? -1+"\n" : dequ.peek()+"\n");
            }else if(command.equals("back")) {
                bw.write(dequ.isEmpty()? -1+"\n" : dequ.getLast()+"\n");
            }else if(command.equals("empty")) {
                bw.write(dequ.isEmpty()? 1+"\n" : 0+"\n");
            }
        }
        bw.flush();
        bw.close();
    }

}