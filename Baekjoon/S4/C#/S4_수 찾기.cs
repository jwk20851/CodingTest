https://www.acmicpc.net/problem/1920

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
            Array.Sort(arr);

            int m = int.Parse(Console.ReadLine());
            string[] str = Console.ReadLine().Split(' ');
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++)
            {
                int low = 0, high = n - 1;
                bool check = false;
                while (low <= high)
                {
                    int mid = (low + high) / 2;
                    if (int.Parse(str[i]) == arr[mid])
                    {
                        check = true;
                        break;
                    }
                    else if (int.Parse(str[i]) > arr[mid])
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
                sb.Append(check ? "1\n" : "0\n");
            }

            Console.WriteLine(sb);
        }
    }
}