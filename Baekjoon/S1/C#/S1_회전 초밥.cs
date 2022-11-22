https://www.acmicpc.net/problem/2531

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int d = arr[1];
            int k = arr[2];
            int c = arr[3];

            arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = int.Parse(Console.ReadLine());

            int[] dish = new int[d + 1];
            int cnt = 0;
            for (int i = 0; i < k; i++)
            {
                if (dish[arr[i]]++ == 0)
                    cnt++;
            }

            int ans = cnt;
            for (int i = 0; i < n; i++)
            {
                if (ans <= cnt)
                {
                    if (dish[c] == 0)
                        ans = cnt + 1;
                    else
                        ans = cnt;
                }

                if (dish[arr[i]]-- == 1)
                    cnt--;

                if (dish[arr[(i + k) % n]]++ == 0)
                    cnt++;
            }

            Console.Write(ans);
        }
    }
}