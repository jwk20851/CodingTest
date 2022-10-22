https://www.acmicpc.net/problem/13458

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] bc = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int b = bc[0];
            int c = bc[1];

            double sum = arr.Length;
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] > b)
                    sum += Math.Ceiling((arr[i] - b) / (double)c);
            }

            Console.Write(sum);
        }
    }
}