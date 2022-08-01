https://www.acmicpc.net/problem/1546

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] arr = Console.ReadLine().Split(' ');
            float[] score = Array.ConvertAll(arr, float.Parse);
            float max = 0;
            for (int i = 0; i < score.Length; i++)
            {
                if (max < score[i])
                    max = score[i];
            }

            float sum = 0;
            for (int i = 0; i < score.Length; i++)
            {
                score[i] = score[i] / max * 100;
                sum += score[i];
            }

            Console.WriteLine(sum / score.Length);
        }
    }
}