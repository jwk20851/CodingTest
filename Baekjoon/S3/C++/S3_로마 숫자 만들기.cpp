//https://www.acmicpc.net/problem/16922

#include<iostream>

using namespace std;

int N, ans;
int roma[] = { 1, 5, 10, 50 };
bool visited[1001];

void DFS(int idx, int depth, int sum) {
    if (depth == N) {
        if (!visited[sum]) {
            visited[sum] = true;
            ans++;
        }
        return;
    }

    for (int i = idx; i < 4; i++)
        DFS(i, depth + 1, sum + roma[i]);
}

int main(void) {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    cin >> N;

    DFS(0, 0, 0);

    cout << ans << "\n";

    return 0;
}