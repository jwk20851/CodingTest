//https://www.acmicpc.net/problem/14469

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b) {
    if (a.first == b.first)
        return a.second < b.second;
    else
        return a.first < b.first;
}

int main()
{
    int N;
    cin >> N;

    vector<pair<int, int>> cow;
    for (int i = 0; i < N; i++) {
        int start, time;
        cin >> start >> time;

        pair<int, int> tmp(start, time);
        cow.push_back(tmp);
    }

    sort(cow.begin(), cow.end(), cmp);

    int ans = 0;
    for (auto now : cow) {
        if (ans < now.first)
            ans = now.first;
        ans += now.second;
    }

    cout << ans;

    return 0;
}