https://www.acmicpc.net/problem/10816

using System;
using System.Collections;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] sgArr = Console.ReadLine().Split(' ');


            Hashtable hash = new Hashtable();
            for (int i = 0; i < n; i++)
            {
                if (hash.ContainsKey(sgArr[i]))
                    hash[sgArr[i]] = (int)hash[sgArr[i]] + 1;
                else
                    hash.Add(sgArr[i], 1);
            }


            int m = int.Parse(Console.ReadLine());
            string[] findArr = Console.ReadLine().Split(' ');
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++)
            {
                if (hash.ContainsKey(findArr[i]))
                    sb.Append(hash[findArr[i]] + " ");
                else
                    sb.Append("0 ");
            }
            Console.Write(sb);
        }
    }
}