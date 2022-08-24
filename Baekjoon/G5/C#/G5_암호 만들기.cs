https://www.acmicpc.net/problem/1759

using System;

namespace Baekjoon
{
    class Program
    {
        static int l, c;
        static char[] pwd;
        static bool[] select;

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            l = arr[0];
            c = arr[1];

            pwd = string.Join(string.Empty, Console.ReadLine().Split(' ')).ToCharArray();
            Array.Sort(pwd);
            select = new bool[c];

            Combi(0, 0);
        }

        static void Combi(int first, int cnt)
        {
            int n = first;

            if (cnt == l)
            {
                int consonant = 0;
                int vowel = 0;

                for (int i = 0; i < c; i++)
                {
                    if (select[i])
                    {
                        if (pwd[i] == 'a' || pwd[i] == 'e' || pwd[i] == 'i' || pwd[i] == 'o' || pwd[i] == 'u')
                            vowel++;
                        else
                            consonant++;
                    }
                }

                if (vowel >= 1 && consonant >= 2)
                {
                    for (int i = 0; i < c; i++)
                    {
                        if (select[i])
                            Console.Write(pwd[i]);
                    }
                    Console.WriteLine();
                }
            }

            for (int i = n; i < c; i++)
            {
                select[i] = true;
                Combi(i + 1, cnt + 1);
                select[i] = false;
            }
        }
    }
}