//https://www.acmicpc.net/problem/14912

#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n;
	char d;
	cin >> n >> d;

	int ans = 0;
	for (int i = 1; i <= n; i++) {
		string tmp = to_string(i);
		for (int j = 0; j < tmp.length(); j++) {
			if (tmp[j] == d)
				ans++;
		}
	}

	cout << ans << "\n";

	return 0;
}