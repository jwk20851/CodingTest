https://www.acmicpc.net/problem/25375

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            int q = int.Parse(Console.ReadLine());
            while (q-- > 0)
            {
                long[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);
                long a = arr[0];
                long b = arr[1];

                sb.Append(a * 2 <= b && b % a == 0 ? "1\n" : "0\n");
            }
            Console.Write(sb);
        }
    }
}