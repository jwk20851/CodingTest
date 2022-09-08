https://www.acmicpc.net/problem/1620

using System;
using System.Collections.Generic;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            Dictionary<int, string> dt_str = new Dictionary<int, string>();
            Dictionary<string, int> dt_int = new Dictionary<string, int>();

            for (int i = 1; i <= n; i++)
            {
                string str = Console.ReadLine();
                dt_str.Add(i, str);
                dt_int.Add(str, i);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= m; i++)
            {
                string mon = Console.ReadLine();

                if (dt_int.ContainsKey(mon))
                    sb.Append(dt_int[mon] + "\n");
                else
                    sb.Append(dt_str[int.Parse(mon)] + "\n");
            }
            Console.Write(sb);
        }
    }
}