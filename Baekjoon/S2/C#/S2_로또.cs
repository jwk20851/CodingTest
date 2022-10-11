https://www.acmicpc.net/problem/6603

using System;

namespace Baekjoon
{
    class Program
    {
        static int k = 0;
        static int[] arr;
        static bool[] check;
        static void Main(string[] args)
        {
            while (true)
            {
                arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                Console.WriteLine($"{string.Join(",", arr)}");
                int k = arr[0];
                check = new bool[k];

                if (k == 0)
                    break;

                DFS(0, 0);
                Console.WriteLine();
            }
        }

        static void DFS(int start, int dep)
        {
            Console.WriteLine("dep: " + dep);
            if (dep == 6)
            {
                for (int i = 0; i < k; i++)
                {
                    if (check[i])
                        Console.Write(arr[i + 1] + " ");
                }
                Console.WriteLine();
            }

            for (int i = start; i < k; i++)
            {
                check[i] = true;
                DFS(i + 1, dep +);
                check[i] = false;
            }
        }
    }
}