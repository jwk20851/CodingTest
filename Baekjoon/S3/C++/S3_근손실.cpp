//https://www.acmicpc.net/problem/18429

#include <iostream>

using namespace std;

int N, K, w = 500, ans = 0;
int A[51];
bool visited[51];

void DFS(int depth) {
    if (depth == N) {
        ans++;
        return;
    }

    for (int i = 0; i < N; i++) {
        if (!visited[i]) {
            if (w + A[i] - K >= 500) {
                visited[i] = true;
                w += A[i] - K;
                DFS(depth + 1);
                w -= A[i] - K;
                visited[i] = false;
            }
            else
                continue;
        }
    }
}

int main() {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    cin >> N >> K;
    for (int i = 0; i < N; i++)
        cin >> A[i];

    DFS(0);

    cout << ans;

    return 0;
}