https://www.acmicpc.net/problem/9375

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());

            while (t-- > 0)
            {
                Dictionary<string, int> dt = new Dictionary<string, int>();
                int n = int.Parse(Console.ReadLine());

                while (n-- > 0)
                {
                    string[] arr = Console.ReadLine().Split(' ');
                    string kind = arr[1];

                    int cntt = 1;
                    if (dt.ContainsKey(kind))
                        dt[kind]++;
                    else
                        dt.Add(kind, 1);
                }

                int cnt = 1;
                foreach (KeyValuePair<string, int> kvp in dt)
                    cnt *= (kvp.Value + 1);

                Console.WriteLine(cnt - 1);
            }
        }
    }
}