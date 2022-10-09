https://www.acmicpc.net/problem/1406

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            Stack<string> stL = new Stack<string>();
            Stack<string> stR = new Stack<string>();

            for (int i = 0; i < str.Length; i++)
                stL.Push(str[i].ToString());

            int n = int.Parse(Console.ReadLine());
            while (n-- > 0)
            {
                string[] arr = Console.ReadLine().Split(' ');
                switch (arr[0])
                {
                    case "L":
                        if (stL.Count > 0)
                            stR.Push(stL.Pop());
                        break;
                    case "D":
                        if (stR.Count > 0)
                            stL.Push(stR.Pop());
                        break;
                    case "B":
                        if (stL.Count > 0)
                            stL.Pop();
                        break;
                    case "P":
                        stL.Push(arr[1]);
                        break;
                }
            }

            while (stL.Count > 0)
                stR.Push(stL.Pop());

            Console.Write($"{string.Join("", stR)}");
        }
    }
}