https://www.acmicpc.net/problem/17219

using System;
using System.Collections;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            Hashtable ht = new Hashtable();
            while (n-- > 0)
            {
                string[] str = Console.ReadLine().Split(' ');
                ht.Add(str[0], str[1]);
            }

            StringBuilder sb = new StringBuilder();
            while (m-- > 0)
            {
                string str = Console.ReadLine();
                sb.Append(ht[str] + "\n");
            }

            Console.WriteLine(sb);
        }
    }
}