https://www.acmicpc.net/problem/4375

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();

            while (true)
            {
                string str = Console.ReadLine();
                if (string.IsNullOrEmpty(str))
                    break;

                int n = int.Parse(str);
                int num = 0, cnt = 1;
                while (true)
                {
                    //(a+b)%c = (a%c + b%c)%c
                    //(a*b)%c = ((a%c)*(v%c))%c
                    num = (num * 10 + 1) % n;
                    if (num == 0)
                    {
                        sb.Append(cnt + "\n");
                        break;
                    }
                    cnt++;
                }
            }

            Console.WriteLine(sb);
        }
    }
}