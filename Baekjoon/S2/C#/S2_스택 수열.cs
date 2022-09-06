https://www.acmicpc.net/problem/1874

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

            Stack<int> s = new Stack<int>();
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            for (int i = 0; i < n; i++)
            {
                int value = int.Parse(Console.ReadLine());

                if (value > cnt)
                {
                    for (int j = cnt + 1; j <= value; j++)
                    {
                        s.Push(j);
                        sb.Append("+\n");
                    }
                    cnt = value;
                }
                else
                {
                    if (s.Peek() != value)
                    {
                        Console.WriteLine("NO");
                        return;
                    }
                }
                s.Pop();
                sb.Append("-\n");
            }

            Console.Write(sb);
        }
    }
}