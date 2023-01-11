https://www.acmicpc.net/problem/27111

using System;
using System.Collections;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            Hashtable ht = new Hashtable();
            int cnt = 0;
            while (n-- > 0)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int a = arr[0], b = arr[1];
                if (!ht.ContainsKey(a))
                {
                    if (b == 1)
                        ht.Add(a, b);
                    else
                        cnt++;
                }
                else
                {
                    ht.Remove(a);
                    if (b == 1)
                    {
                        ht.Add(a, b);
                        cnt++;
                    }
                }
            }

            Console.Write(cnt + ht.Count);
        }
    }
}