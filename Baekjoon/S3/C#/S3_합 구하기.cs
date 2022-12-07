https://www.acmicpc.net/problem/11441

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] sum = new int[n + 1];
            for (int i = 1; i <= n; i++)
                sum[i] = sum[i - 1] + arr[i - 1];

            int m = int.Parse(Console.ReadLine());
            StringBuilder sb = new StringBuilder();
            while (m-- > 0)
            {
                int[] ij = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int i = ij[0];
                int j = ij[1];

                sb.Append(sum[j] - sum[i - 1] + "\n");
            }

            Console.Write(sb);
        }
    }
}
/*
using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int m = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();
            while (m-- > 0)
            {
                int[] ij = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int i = ij[0];
                int j = ij[1];

                int sum = 0;
                for (int a = i; a <= j; a++)
                    sum += arr[a - 1];
                sb.Append(sum + "\n");
            }

            Console.Write(sb);
        }
    }
}
*/