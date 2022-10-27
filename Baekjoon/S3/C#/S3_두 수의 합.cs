https://www.acmicpc.net/problem/3273

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int x = int.Parse(Console.ReadLine());

            int cnt = 0;
            for (int i = 0; i < n - 1; i++)
            {
                for (int j = i + 1; j < n; i++)
                {
                    if (x == arr[i] + arr[j])
                        cnt++;
                }
            }

            Console.WriteLine(cnt);
        }
    }
}