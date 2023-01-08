https://www.acmicpc.net/problem/10610

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();

            if (!str.Contains("0"))
            {
                Console.WriteLine("-1");
            }
            else
            {
                int sum = 0, n = 0;
                int[] arr = new int[10];
                for (int i = 0; i < str.Length; i++)
                {
                    n = int.Parse(str[i].ToString());
                    arr[n]++;
                    sum += n;
                }

                if (sum % 3 != 0)
                    Console.WriteLine("-1");
                else
                {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 9; i >= 0; i--)
                    {
                        while (arr[i]-- > 0)
                            sb.Append(i);
                    }
                    Console.WriteLine(sb);
                }
            }
        }
    }
}