https://www.acmicpc.net/problem/11728

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = nm[0];
            int m = nm[1];

            int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] b = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            StringBuilder sb = new StringBuilder();
            int ap = 0, bp = 0;
            while (ap + bp < n + m)
            {
                if (ap == n)
                    sb.Append(b[bp++] + " ");
                else if (bp == m)
                    sb.Append(a[ap++] + " ");
                else
                {
                    if (a[ap] < b[bp])
                        sb.Append(a[ap++] + " ");
                    else
                        sb.Append(b[bp++] + " ");
                }
            }

            Console.WriteLine(sb);
        }
    }
}