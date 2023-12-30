import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] dr = new int[]{1,0,-1,0};
        int[] dc = new int[]{0,1,0,-1};
        int dir = 0;
        int r = 0, c = 0;

        char[] arr = br.readLine().toCharArray();
        for (char item : arr){
            switch(item){
                case 'L':
                    dir = (dir + 3) % 4;
                    break;
                case 'R':
                    dir = (dir + 1) % 4;
                    break;
                case 'F':
                    r += dr[dir];
                    c += dc[dir];
                    break;
            }
        }

        System.out.print(c + " " + r);
    }
}