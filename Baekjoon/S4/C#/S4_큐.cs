https://www.acmicpc.net/problem/10845

using System;
using System.Collections.Generic;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<string> q = new List<string>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                switch (str[0])
                {
                    case "push":
                        q.Add(str[1]);
                        break;

                    case "pop":
                        if (q.Count > 0)
                        {
                            sb.Append(q[0] + "\n");
                            q.RemoveAt(0);
                        }
                        else
                            sb.Append("-1" + "\n");
                        break;

                    case "size":
                        sb.Append(q.Count + "\n");
                        break;

                    case "empty":
                        sb.Append((q.Count == 0) ? "1\n" : "0\n");
                        break;

                    case "front":
                        sb.Append((q.Count > 0) ? q[0] + "\n" : "-1\n");
                        break;

                    case "back":
                        sb.Append((q.Count > 0) ? q[q.Count - 1] + "\n" : "-1\n");
                        break;
                }
            }
            Console.Write(sb);
        }
    }
}