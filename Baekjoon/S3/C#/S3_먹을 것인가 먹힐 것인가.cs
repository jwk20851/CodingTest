https://www.acmicpc.net/problem/7795

using System;

namespace Beakjoon
{
    class Program
    {
        static int[] arrA, arrB;
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            while (t-- > 0)
            {
                int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int n = nm[0];
                int m = nm[1];
                arrA = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                arrB = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                Array.Sort(arrB);
                int sum = 0;
                for (int i = 0; i < n; i++)
                    sum += check(arrA[i], 0, m - 1);

                Console.WriteLine(sum);
            }
        }

        static int check(int a, int l, int r)
        {
            int cnt = 0;

            while (l <= r)
            {
                int mid = (l + r) / 2;

                if (arrB[mid] < a)
                {
                    cnt = mid + 1;
                    l = mid + 1;
                }
                else
                    r = mid - 1;
            }

            return cnt;
        }
    }
}