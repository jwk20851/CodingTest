https://www.acmicpc.net/problem/11866

using System;
using System.Collections.Generic;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int k = arr[1];

            Queue<int> q = new Queue<int>();
            for (int i = 1; i <= n; i++)
                q.Enqueue(i);

            StringBuilder sb = new StringBuilder();
            sb.Append("<");
            while (q.Count > 0)
            {
                for (int i = 1; i < k; i++)
                    q.Enqueue(q.Dequeue());
                sb.Append(q.Dequeue());
                sb.Append((q.Count > 0) ? ", " : ">");
            }
            Console.Write(sb);
        }
    }
}