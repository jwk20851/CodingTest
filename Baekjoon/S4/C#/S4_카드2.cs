https://www.acmicpc.net/problem/2164

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Queue<int> que = new Queue<int>();

            for (int i = 1; i <= n; i++)
                que.Enqueue(i);

            while (que.Count > 1)
            {
                que.Dequeue();
                que.Enqueue(que.Dequeue());
            }

            Console.WriteLine(que.Dequeue());
        }
    }
}