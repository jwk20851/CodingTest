https://www.acmicpc.net/problem/2577

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());

            int n = a * b * c;
            char[] numArr = n.ToString().ToCharArray();
            int[] arr = new int[10];
            for (int i = 0; i < numArr.Length; i++)
            {
                arr[int.Parse(numArr[i].ToString())]++;
            }

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
        }
    }
}