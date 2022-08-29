https://www.acmicpc.net/problem/1764

using System;
using System.Collections;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Hashtable ht = new Hashtable();
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];
            List<string> li = new List<string>();

            for (int i = 0; i < n; i++)
            {
                ht.Add(Console.ReadLine(), 1);
            }

            for (int i = 0; i < m; i++)
            {
                string str = Console.ReadLine();
                if (ht.Contains(str))
                    li.Add(str);
            }

            li.Sort();
            Console.WriteLine(li.Count);
            Console.WriteLine(string.Join("\n", li));
        }
    }
}