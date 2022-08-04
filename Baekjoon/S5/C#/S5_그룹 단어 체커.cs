https://www.acmicpc.net/problem/1316

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int ctr = 0;

            for (int i = 0; i < n; i++)
            {
                string str = Console.ReadLine();
                int[] charArr = new int[26];
                bool[] boolArr = new bool[26];
                bool check = true;

                for (int j = 0; j < str.Length; j++)
                {
                    if (boolArr[str[j] - 97] == false && charArr[str[j] - 97] > 0)
                    {
                        check = false;
                        break;
                    }
                    charArr[str[j] - 97]++;
                    boolArr[str[j] - 97] = true;
                    if (j != str.Length - 1 && boolArr[str[j] - 97] != boolArr[str[j + 1] - 97])
                        boolArr[str[j] - 97] = false;
                }

                if (check) ctr++;
            }

            Console.WriteLine(ctr);
        }
    }
}