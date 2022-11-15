https://www.acmicpc.net/problem/1475

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int max = 0;

            if (str != "0")
            {
                int[] set = new int[9];

                for (int i = 0; i < str.Length; i++)
                {
                    int n = int.Parse(str[i].ToString());
                    if (n == 9)
                        set[6]++;
                    else
                        set[n]++;
                }

                if (set[6] % 2 == 1)
                    set[6]++;

                set[6] /= 2;

                for (int i = 0; i < 9; i++)
                {
                    if (max <= set[i])
                        max = set[i];
                }
            }

            Console.Write(max);
        }
    }
}