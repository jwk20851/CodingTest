https://www.acmicpc.net/problem/10814

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
            int n = int.Parse(Console.ReadLine());
            List<(int, string)> li = new List<(int, string)>();

            for (int i = 0; i < n; i++)
            {
                string[] info = Console.ReadLine().Split(' ');
                li.Add((int.Parse(info[0]), info[1]));
            }

            var v = li.OrderBy(x => x.Item1).ToList();

            StringBuilder sb = new StringBuilder();
            foreach (var item in v)
                sb.Append(item.Item1 + " " + item.Item2 + "\n");

            Console.Write(sb);
        }
    }
}