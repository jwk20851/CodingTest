https://www.acmicpc.net/problem/10825

using System;
using System.Collections;
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

            List<ArrayList> li = new List<ArrayList>();
            while (n-- > 0)
            {
                string[] tmp = Console.ReadLine().Split(' ');
                li.Add(new ArrayList { tmp[0], int.Parse(tmp[1]), int.Parse(tmp[2]), int.Parse(tmp[3]) });
            }

            var b = li.OrderByDescending(x => x[1]).ThenBy(x => x[2]).ThenByDescending(x => x[3]).ThenBy(x => x[0]);

            StringBuilder sb = new StringBuilder();
            foreach (var item in b)
                sb.Append(item[0] + "\n");

            Console.Write(sb);
        }
    }
}