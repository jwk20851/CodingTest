https://www.acmicpc.net/problem/4949

using System;
using System.Text;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();

            while (true)
            {
                string str = Console.ReadLine();
                if (str.Equals("."))
                    break;
                sb.Append(Check(str) + "\n");
            }

            Console.Write(sb);
        }

        static string Check(string s)
        {
            Stack<int> st = new Stack<int>();

            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == '(')
                    st.Push(1);

                else if (s[i] == '[')
                    st.Push(2);

                else if (s[i] == ']' || s[i] == ')')
                {
                    if (st.Count > 0)
                    {
                        if (s[i] == ')')
                        {
                            if (st.Pop() != 1)
                                return "no";
                        }
                        else if (s[i] == ']')
                        {
                            if (st.Pop() != 2)
                                return "no";
                        }
                    }
                    else
                        return "no";
                }
            }

            if (st.Count == 0)
                return "yes";
            else
                return "no";
        }
    }
}