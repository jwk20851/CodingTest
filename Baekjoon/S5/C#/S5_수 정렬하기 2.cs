https://www.acmicpc.net/submit/2751

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[int.Parse(Console.ReadLine())];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            Array.Sort(arr);
            for (int i = 0; i < arr.Length; i++)
            {
                sb.Append(arr[i] + "\n");
            }

            Console.WriteLine(sb);
        }
    }
}