https://www.acmicpc.net/problem/17413

using System;
using System.Collections.Generic;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();

            Stack<char> st = new Stack<char>();
            bool check = false;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.Length; i++)
            {
                if (str[i] == '<')
                {
                    while (st.Count > 0)
                    {
                        sb.Append(st.Pop());
                    }
                    check = true;
                }
                else if (str[i] == '>')
                {
                    sb.Append('>');
                    check = false;
                    continue;
                }

                if (check)
                {
                    sb.Append(str[i]);
                }
                else
                {
                    if (str[i] == ' ')
                    {
                        while (st.Count > 0)
                        {
                            sb.Append(st.Pop());
                        }
                        sb.Append(' ');
                        continue;
                    }
                    else
                    {
                        st.Push(str[i]);
                    }
                }
            }

            while (st.Count > 0)
            {
                sb.Append(st.Pop());
            }

            Console.Write(sb);
        }
    }
}