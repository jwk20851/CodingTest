https://www.acmicpc.net/problem/11659

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StreamWriter sw = new(new BufferedStream(Console.OpenStandardOutput()));
            int[] sum = new int[100001];
            int[] NM = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            for (int i = 1; i <= NM[0]; i++)
            {
                sum[i] = sum[i - 1] + arr[i - 1];
            }

            while (NM[1]-- > 0)
            {
                int[] IJ = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                sw.WriteLine(sum[IJ[1]] - sum[IJ[0] - 1]);
            }
            sw.Close();
        }
    }
}