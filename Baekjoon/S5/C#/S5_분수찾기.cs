https://www.acmicpc.net/problem/1193

using System;

namespace Baekjoon
{
	class Program
	{
		static void Main(string[] args)
		{
			int n = int.Parse(Console.ReadLine());
			int a = 1, b = 1;
			int tmp = 0, cnt = 0;

			if (n == 1)
				Console.WriteLine(a + "/" + b);
			else
			{
				while (cnt < n)
				{
					tmp++;
					cnt = tmp * (tmp + 1) / 2;
				}

				int num = n - (tmp - 1) * n / 2;

				if (tmp % 2 == 0)
				{
					a = num;
					b = tmp - num + 1;
				}
				else
				{
					a = tmp - num + 1;
					b = num;
				}
				Console.WriteLine(a + "/" + b);
			}
		}
	}
}