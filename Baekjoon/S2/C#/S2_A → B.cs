https://www.acmicpc.net/problem/16953

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] ab = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int a = ab[0];
            int b = ab[1];

            int cnt = 1;
            bool check = false;

            while (b > 0)
            {
                if (b % 10 == 1)
                    b /= 10;
                else if (b % 2 == 1)
                    break;
                else
                    b /= 2;

                cnt++;

                if (a == b)
                {
                    check = true;
                    break;
                }
            }

            Console.Write((check) ? cnt : -1);
        }
    }
}