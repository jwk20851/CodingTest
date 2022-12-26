https://www.acmicpc.net/problem/1004

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int startX = arr[0], startY = arr[1], endX = arr[2], endY = arr[3];
                int n = int.Parse(Console.ReadLine());
                int ans = 0;

                while (n-- > 0)
                {
                    arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                    int x = arr[0], y = arr[1], r = arr[2];

                    bool check1 = false, check2 = false;

                    if (Math.Pow(startX - x, 2) + Math.Pow(startY - y, 2) > Math.Pow(r, 2))
                        check1 = true;
                    if (Math.Pow(endX - x, 2) + Math.Pow(endY - y, 2) > Math.Pow(r, 2))
                        check2 = true;

                    if ((check1 == true && check2 == false) || (check1 == false && check2 == true))
                        ans++;
                }

                sb.Append(ans + "\n");
            }

            Console.WriteLine(sb);
        }
    }
}