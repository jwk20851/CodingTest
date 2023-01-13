https://www.acmicpc.net/problem/1946

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            while (t-- > 0)
            {
                int n = int.Parse(Console.ReadLine());

                int[] people = new int[n + 1];
                for (int i = 0; i < n; i++)
                {
                    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                    people[arr[0]] = arr[1];
                }

                int ans = 1;
                int tmp = people[1];
                for (int i = 2; i <= n; i++)
                {
                    if (tmp > people[i])
                    {
                        ans++;
                        tmp = people[i];
                    }
                }

                Console.WriteLine(ans);
            }
        }
    }
}