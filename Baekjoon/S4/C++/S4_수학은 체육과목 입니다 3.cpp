//https://www.acmicpc.net/problem/22351

#include<iostream>

using namespace std;

int main() {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    string S;
    cin >> S;

    int l = 0;
    int max = min(3, (int)S.length());
    for (int i = 0; i < max; i++) {
        l = l * 10 + (S[i] - '0');
        string tmp = "";
        for (int j = l; j <= 2889; j++) {
            tmp += to_string(j);
            if (tmp == S) {
                cout << l << " " << j;
                return 0;
            }

            if (tmp.size() > S.size())
                break;
        }
    }

    return 0;
}