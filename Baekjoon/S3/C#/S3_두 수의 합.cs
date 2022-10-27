https://www.acmicpc.net/problem/3273

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int x = int.Parse(Console.ReadLine());

            Array.Sort(arr);

            int left = 0;
            int right = n - 1;
            int cnt = 0;
            while (left < right)
            {
                int sum = arr[left] + arr[right];
                if (sum == x)
                {
                    left++;
                    right--;
                    cnt++;
                }
                else if (sum > x)
                    right--;
                else
                    left++;
            }

            Console.WriteLine(cnt);
        }
    }
}