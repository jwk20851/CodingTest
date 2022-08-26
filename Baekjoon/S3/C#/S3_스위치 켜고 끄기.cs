https://www.acmicpc.net/problem/1244

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] str = Console.ReadLine().Split(' ');
            int[] button = new int[n + 1];

            for (int i = 1; i <= str.Length; i++)
                button[i] = int.Parse(str[i - 1]);

            int m = int.Parse(Console.ReadLine());

            for (int i = 0; i < m; i++)
            {
                int[] A = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                int num = A[1];

                if (A[0] == 1)
                {
                    for (int j = num; j <= n; j += num)
                    {
                        if (j > n)
                            break;
                        button[j] = Math.Abs(button[j] - 1);
                    }
                }
                else
                {
                    button[num] = Math.Abs(button[num] - 1);
                    int cnt = 1;
                    while (true)
                    {
                        if ((num - cnt) >= 1 && (num + cnt) <= n && button[num - cnt] == button[num + cnt])
                        {
                            button[num - cnt] = Math.Abs(button[num - cnt] - 1);
                            button[num + cnt] = Math.Abs(button[num + cnt] - 1);
                            cnt++;
                        }
                        else
                            break;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++)
            {
                sb.Append(button[i]);
                if (i % 20 == 0)
                    sb.Append("\n");
                else
                    sb.Append(" ");
            }
            Console.Write(sb);
        }
    }
}