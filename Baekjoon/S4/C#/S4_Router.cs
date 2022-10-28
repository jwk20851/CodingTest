https://www.acmicpc.net/problem/15828

using System;
using System.Collections.Generic;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Queue<int> q = new Queue<int>();

            while (true)
            {
                int m = int.Parse(Console.ReadLine());
                if (m == -1)
                    break;
                else if (m == 0)
                    q.Dequeue();
                else if (q.Count < n)
                    q.Enqueue(m);
            }

            StringBuilder sb = new StringBuilder();
            if (q.Count > 0)
            {
                for (int i = 0; i < n; i++)
                {
                    if (q.Count > 0)
                        sb.Append(q.Dequeue() + " ");
                    else
                        break;
                }
            }
            else
                sb.Append("empty");

            Console.Write(sb);
        }
    }
}