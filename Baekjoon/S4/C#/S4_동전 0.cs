https://www.acmicpc.net/problem/11047/

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int money = arr[1];
            int[] coin = new int[n];

            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                coin[i] = int.Parse(Console.ReadLine());
            }

            for (int i = coin.Length - 1; i >= 0; i--)
            {
                if (money >= coin[i])
                {
                    sum += money / coin[i];
                    money = money % coin[i];
                }
            }

            Console.WriteLine(sum);
        }
    }
}