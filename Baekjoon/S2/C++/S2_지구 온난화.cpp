//https://www.acmicpc.net/problem/5212

#include<iostream>

using namespace std;

int R, C;
char map[11][11];
char ans[11][11];

void checkAround() {
    int dr[] = { -1, 1, 0, 0 };
    int dc[] = { 0, 0, -1, 1 };
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            if (map[i][j] == '.')
                continue;

            int cnt = 0;
            for (int k = 0; k < 4; k++) {
                int nr = i + dr[k];
                int nc = j + dc[k];

                if (nr < 0 || nr >= R || nc < 0 || nc >= C) {
                    cnt++;
                    continue;
                }
                if (map[nr][nc] == '.')
                    cnt++;
            }

            if (cnt >= 3)
                ans[i][j] = '.';
        }
    }
}

int main(void) {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    cin >> R >> C;

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++)
            cin >> map[i][j];
    }

    checkAround();

    int minR = 11, minC = 11, maxR = -1, maxC = -1;
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            if (ans[i][j] != '.')
                ans[i][j] = map[i][j];

            if (ans[i][j] == 'X') {
                minR = min(i, minR);
                minC = min(j, minC);
                maxR = max(i, maxR);
                maxC = max(j, maxC);
            }
        }
    }

    for (int i = minR; i <= maxR; i++) {
        for (int j = minC; j <= maxC; j++)
            cout << ans[i][j];
        cout << "\n";
    }

    return 0;
}