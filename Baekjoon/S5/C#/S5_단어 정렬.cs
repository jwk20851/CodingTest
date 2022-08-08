https://www.acmicpc.net/problem/1181

using System;
using System.Linq;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] str = new string[n];
            for (int i = 0; i < n; i++)
            {
                str[i] = Console.ReadLine();
            }

            string[] arr = str.Distinct().ToArray();
            Array.Sort(arr);
            arr = arr.OrderBy(x => x.Length).ToArray();

            foreach (var v in arr)
            {
                Console.WriteLine(v);
            }
        }
    }
}