//https://www.acmicpc.net/problem/25945

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    /*
    std::cin.tie(0);    //C와 C++ 표준 stream의 동기화를 비활성화(cin, cout등 C++ 만 사용하도록 주의)
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);  //cin, cout을 묶어주는 과정(알고리즘 문제를 풀때 상관x)을 수행하지 않아 시간 절약
    */
    int N;
    cin >> N;

    int cons[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
        cin >> cons[i];
        sum += cons[i];
    }

    int avr = sum / N;
    int high = 0, low = 0;
    for (int i = 0; i < N; i++) {
        if (cons[i] > avr + 1)
            high += cons[i] - (avr + 1);
        else if (cons[i] < avr)
            low += avr - cons[i];
    }

    cout << max(high, low);
}