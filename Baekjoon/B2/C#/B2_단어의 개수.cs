https://www.acmicpc.net/submit/1152

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine().Trim();
            if (str.Length == 0)
                Console.WriteLine(0);
            else
                Console.WriteLine(str.Split(' ').Length);
        }
    }
}