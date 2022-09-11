https://www.acmicpc.net/problem/18870

using System;
using System.Collections;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] arr_ori = (int[])arr.Clone();

            Array.Sort(arr);

            Hashtable ht = new Hashtable();
            int cnt = 0;
            for (int i = 0; i < n; i++)
            {
                if (!ht.Contains(arr[i]))
                    ht.Add(arr[i], cnt++);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++)
                sb.Append(ht[arr_ori[i]] + " ");

            Console.Write(sb);
        }
    }
}