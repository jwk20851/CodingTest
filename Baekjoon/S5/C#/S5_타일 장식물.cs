https://www.acmicpc.net/problem/13301

using System;
using System.Collections.Generic;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            List<long> li = new List<long>();
            List<long> ans = new List<long>();

            li.Add(1);
            li.Add(1);

            for (int i = 2; i < n; i++)
                li.Add(li[i - 2] + li[i - 1]);

            ans.Add(4);

            for (int i = 1; i < n; i++)
                ans.Add(ans[i - 1] + li[i] * 2);

            Console.Write(ans[n - 1]);
        }
    }
}