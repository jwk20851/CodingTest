https://www.acmicpc.net/problem/11728

using System;
using System.IO;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StreamWriter sw = new StreamWriter(new BufferedStream(Console.OpenStandardOutput()));
            StreamReader sr = new StreamReader(new BufferedStream(Console.OpenStandardInput()));

            int[] nm = Array.ConvertAll(sr.ReadLine().Split(' '), int.Parse);
            int n = nm[0];
            int m = nm[1];

            int[] a = Array.ConvertAll((sr.ReadLine() + " " + Int32.MaxValue).Split(' '), int.Parse);
            int[] b = Array.ConvertAll((sr.ReadLine() + " " + Int32.MaxValue).Split(' '), int.Parse);

            for (int cntA = 0, cntB = 0; cntA + cntB < n + m;)
                sw.Write((a[cntA] > b[cntB]) ? b[cntB++] + " " : a[cntA++] + " ");

            sw.Flush();
            sw.Close();
            sr.Close();
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
*/