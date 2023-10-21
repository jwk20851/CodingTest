//https://www.acmicpc.net/problem/3135

#include <iostream>
#include <climits>

using namespace std;

int main() {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    int A, B, N;
    cin >> A >> B >> N;

    int move = INT_MAX;
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;

        move = min(move, abs(tmp - B) + 1);
    }

    cout << min(move, abs(A - B));

    return 0;
}