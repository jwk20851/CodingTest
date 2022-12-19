https://www.acmicpc.net/problem/2776

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            int t = int.Parse(Console.ReadLine());
            while (t-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                int[] note1 = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                Array.Sort(note1);

                int m = int.Parse(Console.ReadLine());
                int[] note2 = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                for (int i = 0; i < m; i++)
                {
                    int tmp = note2[i];
                    int l = 0, r = n - 1;
                    bool check = false;

                    while (l <= r)
                    {
                        int mid = (l + r) / 2;

                        if (note1[mid] == tmp)
                        {
                            check = true;
                            break;
                        }
                        else if (note1[mid] < tmp)
                        {
                            l = mid + 1;
                        }
                        else
                        {
                            r = mid - 1;
                        }
                    }

                    sb.Append(check ? "1\n" : "0\n");
                }
            }

            Console.WriteLine(sb);
        }
    }
}