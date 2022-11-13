https://www.acmicpc.net/problem/11478

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            HashSet<string> hs = new HashSet<string>();

            for (int i = 0; i < str.Length; i++)
            {
                for (int j = 1; j <= str.Length - i; j++)
                {
                    string tmp = str.Substring(i, j);
                    hs.Add(tmp);
                }
            }

            Console.WriteLine(hs.Count);
        }
    }
}