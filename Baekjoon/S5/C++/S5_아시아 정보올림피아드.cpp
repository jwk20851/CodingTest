//https://www.acmicpc.net/problem/2535

#include<iostream>
#include<map>

using namespace std;

int main(void) {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    int N;
    cin >> N;

    map<int, pair<int, int>, greater<int>> scoreMap;
    for (int i = 0; i < N; i++) {
        int nation, stuNum, score;
        cin >> nation >> stuNum >> score;

        scoreMap[score] = make_pair(nation, stuNum);
    }

    map<int, int> check;
    int cnt = 0;
    for (auto var : scoreMap) {
        if (check[var.second.first] < 2) {
            cout << var.second.first << ' ' << var.second.second << '\n';
            check[var.second.first]++;
            cnt++;
        }
        if (cnt == 3)
            break;
    }

    return 0;
}