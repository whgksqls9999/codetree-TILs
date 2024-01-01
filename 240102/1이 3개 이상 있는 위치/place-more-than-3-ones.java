import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] dr = new int[] { -1, 0, 1, 0 };
	public static int[] dc = new int[] { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][N];
		for (int i = 0; i < N; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; ++j) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int answer = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				int sum = 0;
				for (int dir = 0; dir < 4; ++dir) {
					int nr = i + dr[dir];
					int nc = j + dc[dir];
					if (isValid(nr, nc, N)) {
						sum += arr[nr][nc];
					}
				}

				if (sum >= 3) {
					++answer;
				}
			}
		}
		
		System.out.print(answer);
	}

	public static boolean isValid(int r, int c, int N) {
		return (r >= 0 && r < N && c >= 0 && c < N);
	}
}