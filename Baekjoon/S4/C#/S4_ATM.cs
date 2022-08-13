https://www.acmicpc.net/problem/11399

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            Array.Sort(arr);
            int[] sumArr = new int[arr.Length];
            int sum = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                sum += arr[i];
                sumArr[i] = sum;
            }

            int cnt = 0;
            foreach (var e in sumArr)
                cnt += e;

            Console.WriteLine(cnt);
        }
    }
}