https://www.acmicpc.net/problem/10828

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<string> stack = new List<string>();
            StreamWriter sw = new(new BufferedStream(Console.OpenStandardOutput()));
            string[] str = new string[] { };

            for (int i = 0; i < n; i++)
            {
                str = Console.ReadLine().Split(' ');
                switch (str[0])
                {
                    case "push":
                        stack.Add(str[1]);
                        break;

                    case "pop":
                        if (stack.Count != 0)
                        {
                            sw.WriteLine(stack[stack.Count - 1]);
                            stack.RemoveAt(stack.Count - 1);
                        }
                        else
                        {
                            sw.WriteLine("-1");
                        }
                        break;

                    case "size":
                        sw.WriteLine(stack.Count);
                        break;

                    case "empty":
                        sw.WriteLine((stack.Count == 0) ? "1" : "0");
                        break;

                    case "top":
                        sw.WriteLine((stack.Count != 0) ? stack[stack.Count - 1] : "-1");
                        break;
                }
            }
            sw.Close();
        }
    }
}