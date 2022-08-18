https://www.acmicpc.net/problem/1074

using System;

namespace Baekjoon
{
	class Program
	{
		static double cnt = 0;
		static void Main(string[] args)
		{
			double[] k = Array.ConvertAll(Console.ReadLine().Split(' '), double.Parse);
			findZ(Math.Pow(2, k[0]), k[1], k[2]);
			Console.WriteLine(cnt);
		}

		static void findZ(double n, double r, double c)
		{
			if (n == 1) return;

			if (r < n / 2 && c < n / 2)
			{
				findZ(n / 2, r, c);
			}
			else if (r < n / 2 && c >= n / 2)
			{
				cnt += n * n / 4;
				findZ(n / 2, r, c - n / 2);
			}
			else if (r >= n / 2 && c < n / 2)
			{
				cnt += (n * n / 4) * 2;
				findZ(n / 2, r - n / 2, c);
			}
			else
			{
				cnt += (n * n / 4) * 3;
				findZ(n / 2, r - n / 2, c - n / 2);
			}
		}
	}
}