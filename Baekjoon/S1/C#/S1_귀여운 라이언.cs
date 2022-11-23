https://www.acmicpc.net/problem/15565

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int k = arr[1];
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int[] check = new int[3];
            int l = 0, r = 0, ans = -1;
            while (l <= r)
            {
                if (r < n)
                {
                    if (check[1] < k)
                        check[arr[r++]]++;
                    else if (check[1] == k)
                    {
                        if (ans == -1)
                            ans = r;
                        check[arr[l++]]--;
                    }
                }
                else
                {
                    if (check[1] < k)
                        break;
                    else if (check[1] == k)
                    {
                        if (ans == -1)
                            ans = r;
                        check[arr[l++]]--;
                    }
                }
                ans = Math.Min(ans, r - l + 1);
            }

            Console.Write(ans);
        }
    }
}