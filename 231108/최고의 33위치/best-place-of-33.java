import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; ++i){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int i = 0; i < N - 2; ++i){
            for (int j = 0; j < N - 2; ++j){
                int sum = 0;
                for (int k = i; k < i + 3; ++k){
                    for (int l = j; l < j + 3; ++l){
                        sum += arr[k][l];
                    }                    
                }
                if (sum > ans){
                    ans = sum;
                }
            }
        }
        System.out.print(ans);
    }
}