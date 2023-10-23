//https://www.acmicpc.net/problem/25943

#include<iostream>

using namespace std;

int main() {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    int w[] = { 1, 2, 5, 10, 20, 50, 100 };
    int n;
    cin >> n;

    int l = 0, r = 0, tmp = 0;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        if (l == r) {
            l += tmp;
        }
        else {
            if (l < r)
                l += tmp;
            else
                r += tmp;
        }
    }

    tmp = abs(l - r);

    if (tmp == 0)
        cout << 0;
    else {
        int cnt = 0;
        for (int i = sizeof(w) / sizeof(w[0]) - 1; i >= 0; i--) {
            if (tmp / w[i] > 0) {
                cnt += tmp / w[i];
                tmp %= w[i];
            }
        }
        cout << cnt << '\n';
    }

    return 0;
}