https://www.acmicpc.net/problem/18258

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
            Queue<string> q = new Queue<string>();
            StringBuilder sb = new StringBuilder();
            string back = "";

            while (n-- > 0)
            {
                string[] str = Console.ReadLine().Split(' ');
                switch (str[0])
                {
                    case "push":
                        q.Enqueue(str[1]);
                        back = str[1];
                        break;

                    case "pop":
                        if (q.Count > 0)
                            sb.AppendLine(q.Dequeue());
                        else
                            sb.AppendLine("-1");
                        break;

                    case "size":
                        sb.AppendLine(q.Count.ToString());
                        break;

                    case "empty":
                        sb.AppendLine((q.Count == 0) ? "1" : "0");
                        break;

                    case "front":
                        sb.AppendLine((q.Count > 0) ? q.Peek() : "-1");
                        break;

                    case "back":
                        sb.AppendLine((q.Count > 0) ? back : "-1");
                        break;
                }
            }
            Console.Write(sb);
        }
    }
}