https://www.acmicpc.net/problem/14425

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            List<string> li = new List<string>();
            for (int i = 0; i < n; i++)
            {
                li.Add(Console.ReadLine());
            }

            int cnt = 0;
            for (int i = 0; i < m; i++)
            {
                if (li.Contains(Console.ReadLine()))
                    cnt++;
            }

            Console.Write(cnt);
        }
    }
}