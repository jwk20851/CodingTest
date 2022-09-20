https://www.acmicpc.net/problem/11651

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int cnt = int.Parse(Console.ReadLine());
            List<(int, int)> li = new List<(int, int)>();

            while (cnt-- > 0)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int n = arr[0];
                int m = arr[1];
                li.Add((n, m));
            }

            var tmp = li.OrderBy(x => x.Item2).ThenBy(x => x.Item1);

            StringBuilder sb = new StringBuilder();
            foreach (var v in tmp)
                sb.Append($"{v.Item1} {v.Item2}\n");

            Console.Write(sb);
        }
    }
}