https://www.acmicpc.net/problem/1789

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            ulong n = ulong.Parse(Console.ReadLine());
            ulong num = 1;
            ulong sum = 0;

            while (true)
            {
                sum += num;

                if (sum > n)
                    break;

                num++;
            }

            Console.Write(--num);
        }
    }
}