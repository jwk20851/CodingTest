https://www.acmicpc.net/problem/4344

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            float sum = 0;
            float cnt = 0;
            float aver = 0;
            float answer = 0;

            for (int i = 0; i < n; i++)
            {
                string[] str = Console.ReadLine().Split();
                sum = 0;
                cnt = 0;
                for (int j = 1; j < str.Length; j++)
                {
                    sum += int.Parse(str[j]);
                }
                aver = sum / float.Parse(str[0]);

                for (int k = 1; k < str.Length; k++)
                {
                    if (int.Parse(str[k]) > aver)
                        cnt++;
                }
                answer = cnt / float.Parse(str[0]);

                Console.WriteLine("{0:#0.000%}", answer);
            }
        }
    }
}