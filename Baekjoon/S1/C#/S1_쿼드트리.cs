https://www.acmicpc.net/problem/1992

using System;

namespace Baekjoon
{
    class Program
    {
        static string str = "";
        static int[,] arr;

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            arr = new int[n, n];

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    arr[i, j] = Console.Read() - '0';
                }
                Console.ReadLine();
            }

            quad(n, 0, 0);
            Console.Write(str);
        }


        static void quad(int n, int x, int y)
        {
            if (check(n, x, y))
            {
                str += arr[x, y];
                return;
            }
            else
            {
                str += "(";
                quad(n / 2, x, y);
                quad(n / 2, x, y + n / 2);
                quad(n / 2, x + n / 2, y);
                quad(n / 2, x + n / 2, y + n / 2);
                str += ")";
            }
            return;
        }

        static bool check(int n, int x, int y)
        {
            int k = arr[x, y];

            for (int i = x; i < x + n; i++)
            {
                for (int j = y; j < y + n; j++)
                {
                    if (k != arr[i, j])
                        return false;
                }
            }

            return true;
        }
    }
}