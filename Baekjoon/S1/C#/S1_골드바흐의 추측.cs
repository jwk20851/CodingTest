https://www.acmicpc.net/problem/6588

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static bool[] prime;
        static StringBuilder sb = new StringBuilder();

        static void Main(string[] args)
        {
            int max = 1000000;
            prime = new bool[max + 1];

            for (int i = 2; i <= Math.Sqrt(max); i++)
            {
                if (!prime[i])
                {
                    for (int j = 2 * i; j <= max; j += i)
                    {
                        prime[j] = true;
                    }
                }
            }

            while (true)
            {
                int n = int.Parse(Console.ReadLine());

                if (n == 0)
                    break;
                Gold(n);
            }
            Console.Write(sb);
        }

        static void Gold(int n)
        {
            int a = 2;
            int b = n - 2;

            while (true)
            {
                if (!prime[a] && !prime[b])
                {
                    sb.AppendLine(n + " = " + a + " + " + b);
                    break;
                }
                else
                {
                    a++;
                    b--;
                }
            }
        }
    }
}