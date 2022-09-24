https://www.acmicpc.net/problem/14888

using System;

namespace Beakjoon
{
    class Program
    {
        static int max = Int32.MinValue;
        static int min = Int32.MaxValue;

        static int n = 0;
        static int[] num;
        static int[] oper;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            num = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            oper = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            DFS(num[0], 1);

            Console.WriteLine(max);
            Console.WriteLine(min);
        }

        static void DFS(int number, int idx)
        {
            if (idx == n)
            {
                max = Math.Max(max, number);
                min = Math.Min(min, number);
                return;
            }

            for (int i = 0; i < 4; i++)
            {
                if (oper[i] > 0)
                {
                    oper[i]--;
                    switch (i)
                    {
                        case 0:
                            DFS(number + num[idx], idx + 1);
                            break;
                        case 1:
                            DFS(number - num[idx], idx + 1);
                            break;
                        case 2:
                            DFS(number * num[idx], idx + 1);
                            break;
                        case 3:
                            DFS(number / num[idx], idx + 1);
                            break;
                    }
                    oper[i]++;
                }
            }
        }
    }
}