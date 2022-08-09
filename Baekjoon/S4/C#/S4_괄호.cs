https://www.acmicpc.net/problem/9012

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string str;

            for (int i = 0; i < n; i++)
            {
                str = Console.ReadLine();
                if (Check(str))
                    Console.WriteLine("YES");
                else
                    Console.WriteLine("NO");
            }
        }

        static bool Check(string str)
        {
            Stack<char> stack = new Stack<char>();
            for (int i = 0; i < str.Length; i++)
            {
                if (str[i] == '(')
                    stack.Push(str[i]);
                else
                {
                    if (stack.Count > 0)
                        stack.Pop();
                    else
                        return false;
                }
            }
            return (stack.Count > 0) ? false : true;
        }
    }
}