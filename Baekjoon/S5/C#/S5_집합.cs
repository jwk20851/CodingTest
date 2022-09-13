https://www.acmicpc.net/problem/11723

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
            List<string> S = new List<string>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                switch (str[0])
                {
                    case "add":
                        if (!S.Contains(str[1]))
                            S.Add(str[1]);
                        break;

                    case "remove":
                        if (S.Contains(str[1]))
                            S.Remove(str[1]);
                        break;

                    case "check":
                        sb.Append((S.Contains(str[1])) ? "1\n" : "0\n");
                        break;

                    case "toggle":
                        if (S.Contains(str[1]))
                            S.Remove(str[1]);
                        else
                            S.Add(str[1]);
                        break;

                    case "all":
                        if (S.Count > 0)
                            S.RemoveRange(0, S.Count - 1);
                        for (int j = 1; j <= 20; j++)
                            S.Add(j.ToString());
                        break;

                    case "empty":
                        if (S.Count > 0)
                            S.RemoveRange(0, S.Count - 1);
                        break;
                }
            }
            Console.Write(sb);
        }
    }
}