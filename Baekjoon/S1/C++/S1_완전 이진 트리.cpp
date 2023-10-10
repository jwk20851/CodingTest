//https://www.acmicpc.net/problem/9934

#include <iostream>
#include <cmath>
#include <vector>

using namespace std;

int K;
vector<int> num;
vector<vector<int>> lv;

void DFS(int start, int end, int depth) {
	if (depth == K)
		return;

	int mid = (start + end) / 2;
	lv[depth].push_back(num[mid]);

	DFS(start, mid - 1, depth + 1);
	DFS(mid + 1, end, depth + 1);
}

int main() {
	std::cin.tie(0);
	std::cout.tie(0);
	std::ios_base::sync_with_stdio(false);

	cin >> K;

	num.resize(pow(2, K) - 1);
	for (int i = 0; i < num.size(); i++)
		cin >> num[i];

	lv.resize(K);

	DFS(0, num.size() - 1, 0);

	for (int i = 0; i < K; i++) {
		for (int j : lv[i])
			cout << j << " ";
		cout << "\n";
	}

	return 0;
}