https://www.acmicpc.net/problem/9996

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string str = Console.ReadLine();
            string[] arr = str.Split('*');

            StringBuilder sb = new StringBuilder();
            while (n-- > 0)
            {
                string tmp = Console.ReadLine();

                if (tmp.Length < str.Length - 1)
                {
                    sb.Append("NE\n");
                    continue;
                }

                string front = tmp.Substring(0, arr[0].Length);
                string back = tmp.Substring(tmp.Length - arr[1].Length, arr[1].Length);

                sb.Append((front.Equals(arr[0]) && back.Equals(arr[1])) ? "DA\n" : "NE\n");
            }

            Console.WriteLine(sb);
        }
    }
}