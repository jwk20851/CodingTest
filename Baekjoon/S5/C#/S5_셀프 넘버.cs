https://www.acmicpc.net/problem/4673

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            bool[] arr = new bool[10001];
            for (int i = 1; i <= 10000; i++)
            {
                if (cr(i) <= 10000)
                    arr[cr(i)] = true;
                if (arr[i] == false)
                    sb.Append(i + "\n");
            }
            Console.WriteLine(sb);
        }

        static int cr(int a)
        {
            int m = a;
            while (a > 0)
            {
                m = m + a % 10;
                a /= 10;
            }
            return m;
        }
    }
}