https://www.acmicpc.net/problem/1057

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0], ji = arr[1], han = arr[2];
            int cnt = 0;

            while (ji != han)
            {
                ji = ji / 2 + ji % 2;
                han = han / 2 + han % 2;
                cnt++;
            }

            Console.Write(cnt);
        }
    }
}