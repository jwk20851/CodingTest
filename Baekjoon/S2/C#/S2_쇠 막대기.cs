https://www.acmicpc.net/problem/10799

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();

            Stack<char> st = new Stack<char>();
            int ans = 0;
            for (int i = 0; i < str.Length; i++)
            {
                if (str[i] == '(')
                {
                    st.Push('(');
                }
                else
                {
                    st.Pop();
                    if (str[i - 1] == '(')
                        ans += st.Count;
                    else
                        ans++;
                }
            }

            Console.WriteLine(ans);
        }
    }
}