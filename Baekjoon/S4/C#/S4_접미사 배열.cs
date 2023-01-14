https://www.acmicpc.net/problem/11656

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int n = str.Length;

            string[] arr = new string[n];
            for (int i = 1; i <= n; i++)
                arr[i - 1] = str.Substring(n - i);

            Array.Sort(arr);

            Console.WriteLine($"{string.Join("\n", arr)}");
        }
    }
}