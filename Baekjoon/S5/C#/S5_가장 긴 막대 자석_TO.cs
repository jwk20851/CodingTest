https://www.acmicpc.net/problem/26122

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int k = int.Parse(Console.ReadLine());
            string str = Console.ReadLine();
            string ns = "NS";
            string sn = "SN";
            string s = "S";
            string n = "N";

            int cnt = 0;
            while (true)
            {
                if (str.Contains(ns) || str.Contains(sn))
                {
                    cnt++;
                    if (str.Contains(ns))
                        ns = n + ns + s;
                    if (str.Contains(sn))
                        sn = s + sn + n;
                }
                else
                    break;
            }

            Console.Write(cnt * 2);
        }
    }
}