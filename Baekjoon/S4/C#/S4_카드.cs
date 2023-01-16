https://www.acmicpc.net/problem/11652

using System;
using System.Collections.Generic;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Dictionary<long, int> dt = new Dictionary<long, int>();
            int max = 0;
            while (n-- > 0)
            {
                long num = long.Parse(Console.ReadLine());
                if (!(dt.ContainsKey(num)))
                    dt.Add(num, 1);
                else
                    dt[num]++;

                max = Math.Max(dt[num], max);
            }

            long ans = long.MaxValue;
            foreach (long tmp in dt.Keys)
            {
                if (dt[tmp] == max)
                    ans = Math.Min(ans, tmp);
            }

            Console.WriteLine(ans);
        }
    }
}