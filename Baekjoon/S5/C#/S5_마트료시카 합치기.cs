https://www.acmicpc.net/problem/25631

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
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            List<int> li = arr.ToList();
            li.Sort();

            if (li[0] == li[li.Count - 1])
            {
                Console.Write(li.Count);
                return;
            }

            int cnt = 1;
            int max = 0;
            while (li.Count > 1)
            {
                if (li[0] == li[1])
                    cnt++;
                else
                    cnt = 1;

                li.RemoveAt(0);
                max = Math.Max(max, cnt);
            }

            Console.Write(max);
        }
    }
}