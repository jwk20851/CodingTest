https://www.acmicpc.net/problem/1158

using System;
using System.Collections.Generic;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Queue<int> q = new Queue<int>();
            int[] n = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            for (int i = 1; i <= n[0]; i++)
                q.Enqueue(i);

            StringBuilder sb = new StringBuilder();
            if (q.Count != 0)
                sb.Append("<");
            while (q.Count > 0)
            {
                for (int i = 1; i < n[1]; i++)
                    q.Enqueue(q.Dequeue());
                sb.Append(q.Dequeue());
                sb.Append((q.Count > 0) ? ", " : ">");
            }
            Console.Write(sb);
        }
    }
}