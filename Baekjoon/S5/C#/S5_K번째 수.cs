https://www.acmicpc.net/problem/11004

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0], k = arr[1];

            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            Array.Sort(arr);

            Console.WriteLine(arr[k - 1]);
        }
    }
}