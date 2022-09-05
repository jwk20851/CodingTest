https://www.acmicpc.net/problem/11650

using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StreamReader sr = new StreamReader(new BufferedStream(Console.OpenStandardInput()));
            StreamWriter sw = new StreamWriter(new BufferedStream(Console.OpenStandardOutput()));

            int n = int.Parse(sr.ReadLine());
            List<(int, int)> li = new List<(int, int)>();
            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(sr.ReadLine().Split(' '), int.Parse);
                li.Add((arr[0], arr[1]));
            }

            var v = li.OrderBy(x => x.Item1).ThenBy(x => x.Item2).ToList();

            for (int i = 0; i < n; i++)
                sw.WriteLine($"{v[i].Item1} {v[i].Item2}");

            sr.Close();
            sw.Close();
        }
    }
}