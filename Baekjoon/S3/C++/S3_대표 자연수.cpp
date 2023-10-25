//https://www.acmicpc.net/problem/2548

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    std::cin.tie(0);
    std::cout.tie(0);
    std::ios_base::sync_with_stdio(false);

    int N;
    cin >> N;

    int arr[N];
    for (int i = 0; i < N; i++)
        cin >> arr[i];

    sort(arr, arr + N);

    cout << ((N % 2 == 1) ? arr[N / 2] : arr[N / 2 - 1]) << '\n';

    return 0;
}