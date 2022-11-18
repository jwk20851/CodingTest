https://www.acmicpc.net/problem/1940

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int m = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            Array.Sort(arr);
            int a = 0, b = n - 1, cnt = 0;
            while (a < b)
            {
                if (arr[a] + arr[b] == m)
                {
                    cnt++;
                    a++;
                    b--;
                }
                else if (arr[a] + arr[b] > m)
                    b--;
                else
                    a++;
            }

            Console.WriteLine(cnt);
        }
    }
}