//https://www.acmicpc.net/problem/1755

#include<iostream>
#include<map>

using namespace std;

int main(void) {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    int M, N;
    cin >> M >> N;

    string arr[11] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
    map<string, int> map;
    for (int i = M; i <= N; i++) {
        string front = "";
        string back = "";
        if (i / 10 >= 1)
            front = arr[i / 10];
        back = arr[i % 10];

        map[front + back] = i;
    }

    int cnt = 0;
    for (auto var : map) {
        cout << var.second << ' ';
        cnt++;
        if (cnt % 10 == 0)
            cout << '\n';
    }

    return 0;
}