https://www.acmicpc.net/problem/1436

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int num = 666;

            while (true)
            {
                if (n == 1)
                    break;

                num++;

                if (num.ToString().Contains("666"))
                    n--;
            }

            Console.Write(num);
        }
    }
}