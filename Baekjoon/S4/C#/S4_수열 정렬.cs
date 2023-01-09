https://www.acmicpc.net/problem/1015

using System;
using System.Collections.Generic;
using System.Linq;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] tmp = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            List<List<int>> li = new List<List<int>>();
            for (int i = 0; i < n; i++)
                li.Add(new List<int> { tmp[i], i });

            var b = li.OrderBy(x => x[0]);

            int[] arr = new int[n];
            int cnt = 0;
            foreach (var item in b)
            {
                arr[cnt] = item[1];
                cnt++;
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[arr[i]] = i;

            Console.WriteLine($"{string.Join(" ", ans)}");
        }
    }
}