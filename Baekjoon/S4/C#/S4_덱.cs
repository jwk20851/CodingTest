https://www.acmicpc.net/problem/10866

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
            List<string> deque = new List<string>();
            StringBuilder sb = new StringBuilder();

            while (n-- > 0)
            {
                string[] str = Console.ReadLine().Split(' ');

                switch (str[0])
                {
                    case "push_front":
                        deque.Insert(0, str[1]);
                        break;

                    case "push_back":
                        deque.Insert(deque.Count, str[1]);
                        break;

                    case "pop_front":
                        if (deque.Count != 0)
                        {
                            sb.Append(deque[0] + "\n");
                            deque.RemoveAt(0);
                        }
                        else
                            sb.Append("-1\n");
                        break;

                    case "pop_back":
                        if (deque.Count != 0)
                        {
                            sb.Append(deque[deque.Count - 1] + "\n");
                            deque.RemoveAt(deque.Count - 1);
                        }
                        else
                            sb.Append("-1\n");
                        break;

                    case "size":
                        sb.Append(deque.Count + "\n");
                        break;

                    case "empty":
                        sb.Append((deque.Count == 0) ? "1\n" : "0\n");
                        break;

                    case "front":
                        if (deque.Count != 0)
                            sb.Append(deque[0] + "\n");
                        else
                            sb.Append("-1\n");
                        break;

                    case "back":
                        if (deque.Count != 0)
                            sb.Append(deque[deque.Count - 1] + "\n");
                        else
                            sb.Append("-1\n");
                        break;
                }
            }
            Console.Write(sb);
        }
    }
}