https://www.acmicpc.net/problem/26069

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            bool check = false;
            int cnt = 0;
            Dictionary<string, int> dt = new Dictionary<string, int>();
            while (n-- > 0)
            {
                string[] arr = Console.ReadLine().Split(' ');
                if (cnt == 0 && (arr[0] == "ChongChong" || arr[1] == "ChongChong"))
                {
                    dt.Add(arr[0], cnt++);
                    dt.Add(arr[1], cnt++);
                    check = true;
                    continue;
                }

                if (check)
                {
                    if (dt.ContainsKey(arr[0]) || dt.ContainsKey(arr[1]))
                    {
                        if (dt.ContainsKey(arr[0]) && dt.ContainsKey(arr[1]))
                            continue;
                        else if (dt.ContainsKey(arr[0]))
                            dt.Add(arr[1], cnt++);
                        else
                            dt.Add(arr[0], cnt++);
                    }
                }
            }

            Console.Write(cnt);
        }
    }
}