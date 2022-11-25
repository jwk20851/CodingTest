https://www.acmicpc.net/problem/12891

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int s = arr[0];
            int p = arr[1];
            string str = Console.ReadLine();
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int[] check = new int[4];
            int l = 0, r = 0, ans = 0;
            while (r < s)
            {
                if (r - l < p)
                {
                    switch (str[r++])
                    {
                        case 'A':
                            check[0]++;
                            break;
                        case 'C':
                            check[1]++;
                            break;
                        case 'G':
                            check[2]++;
                            break;
                        case 'T':
                            check[3]++;
                            break;
                    }
                }
                if (r - l == p)
                {
                    if (check[0] >= arr[0] && check[1] >= arr[1] && check[2] >= arr[2] && check[3] >= arr[3])
                        ans++;

                    switch (str[l++])
                    {
                        case 'A':
                            check[0]--;
                            break;
                        case 'C':
                            check[1]--;
                            break;
                        case 'G':
                            check[2]--;
                            break;
                        case 'T':
                            check[3]--;
                            break;
                    }
                }
            }

            Console.Write(ans);
        }
    }
}