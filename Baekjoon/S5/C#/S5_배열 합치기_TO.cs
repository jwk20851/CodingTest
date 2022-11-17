https://www.acmicpc.net/problem/11728

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = nm[0];
            int m = nm[1];

            int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] b = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int[] ans = new int[n + m];

            for (int i = 0; i < n; i++)
                ans[i] = a[i];
            for (int i = n; i < n + m; i++)
                ans[i] = b[i - n];

            Array.Sort(ans);

            Console.WriteLine($"{string.Join(" ", ans)}");
        }
    }
}