https://www.acmicpc.net/problem/10867

using System;
using System.Collections.Generic;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            List<int> li = new List<int>();
            for (int i = 0; i < n; i++)
            {
                if (!(li.Contains(arr[i])))
                    li.Add(arr[i]);
            }

            li.Sort();

            Console.WriteLine($"{string.Join(" ", li)}");
        }
    }
}