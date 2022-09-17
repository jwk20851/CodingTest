https://www.acmicpc.net/problem/10773

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Stack<int> st = new Stack<int>();

            while (n-- > 0)
            {
                int num = int.Parse(Console.ReadLine());
                if (num != 0)
                    st.Push(num);
                else
                    st.Pop();
            }

            int sum = 0;
            while (st.Count > 0)
                sum += st.Pop();

            Console.Write(sum);
        }
    }
}