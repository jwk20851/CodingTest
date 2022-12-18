https://www.acmicpc.net/problem/26265

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<List<string>> li = new List<List<string>>();

            while (n-- > 0)
            {
                string[] str = Console.ReadLine().Split(' ');
                li.Add(new List<string> { str[0], str[1] });
            }

            var v = li.OrderBy(x => x[0]).ThenByDescending(x => x[1]);

            StringBuilder sb = new StringBuilder();
            foreach (var item in v)
                sb.Append(item[0] + " " + item[1] + "\n");
            Console.Write(sb);
        }
    }
}