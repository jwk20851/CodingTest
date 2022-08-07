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
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int p = int.Parse(Console.ReadLine());

            for (int i = 0; i < p; i++)
            {
                String str = Console.ReadLine();
                int num = (int)Char.GetNumericValue(str[2]);
                if (str[0] == '1')
                {
                    for (int j = num - 1; j < n; j += num)
                        arr[j] = (arr[j] == 0) ? 1 : 0;
                }
                else
                {
                    arr[num - 1] = (arr[num - 1] == 0) ? 1 : 0;
                    int cnt = (num <= n - num) ? num - 1 : n - num;
                    for (int j = 1; j <= cnt; j++)
                    {
                        if (arr[num - 1 - j] == arr[num - 1 + j])
                        {
                            arr[num - 1 - j] = (arr[num - 1 - j] == 0) ? 1 : 0;
                            arr[num - 1 + j] = (arr[num - 1 + j] == 0) ? 1 : 0;
                        }
                        else
                            break;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++)
            {
                sb.Append(arr[i] + " ");
                if ((i + 1) % 20 == 0)
                    sb.Append("\n");
            }
            Console.WriteLine(sb);
        }
    }
}