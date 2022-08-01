https://www.acmicpc.net/problem/2869

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int a = arr[0], b = arr[1], v = arr[2];
            Console.WriteLine(((v - b) % (a - b) == 0) ? (v - b) / (a - b) : (v - b) / (a - b) + 1);
        }
    }
}