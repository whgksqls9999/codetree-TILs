import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][N];

		for (int i = 0; i < N; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; ++j) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ans = 0;
		for (int i = 0; i < N; ++i) {
			int cnt = 1;
			int max = cnt;
			for (int j = 1; j < N; ++j) {
				if (arr[i][j] == arr[i][j - 1]) {
					++cnt;
					if (cnt > max) {
						max = cnt;
					}
				} else {
					cnt = 1;
				}
			}

			if (max >= M) {
				++ans;
			}

			cnt = 1;
			max = cnt;

			for (int j = 1; j < N; ++j) {
				if (arr[j][i] == arr[j - 1][i]) {
					++cnt;
					if (cnt > max) {
						max = cnt;
					}
				} else {
					cnt = 1;
				}
			}

			if (max >= M) {
				++ans;
			}
		}
		System.out.println(ans);
	}
}