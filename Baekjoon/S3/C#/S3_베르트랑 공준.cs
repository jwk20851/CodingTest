https://www.acmicpc.net/problem/4948

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int max = 123456;
            bool[] pn = new bool[max * 2 + 1];
            pn[0] = pn[1] = true;

            for (int i = 2; i <= Math.Sqrt(pn.Length); i++)
            {
                for (int j = i * i; j <= pn.Length; j += i)
                    pn[j] = true;
            }

            StringBuilder sb = new StringBuilder();
            while (true)
            {
                int n = int.Parse(Console.ReadLine());
                if (n == 0)
                    break;

                int cnt = 0;
                for (int i = n + 1; i <= 2 * n; i++)
                {
                    if (pn[i] == false)
                        cnt++;
                }

                sb.Append(cnt + "\n");
            }

            Console.Write(sb);
        }
    }
}