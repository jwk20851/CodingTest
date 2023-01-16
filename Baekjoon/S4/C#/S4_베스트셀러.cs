https://www.acmicpc.net/problem/1302

using System;
using System.Collections;
using System.Collections.Generic;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Hashtable ht = new Hashtable();

            int max = 1, val = 0;
            while (n-- > 0)
            {
                string str = Console.ReadLine();

                if (!(ht.Contains(str)))
                    ht.Add(str, 1);
                else
                {
                    val = int.Parse(ht[str].ToString()) + 1;
                    ht.Remove(str);
                    ht.Add(str, val);
                }

                max = Math.Max(val, max);
            }

            List<string> li = new List<string>();
            foreach (var item in ht.Keys)
            {
                if (int.Parse(ht[item].ToString()) == max)
                    li.Add(item.ToString());
            }

            li.Sort();

            Console.WriteLine(li[0]);
        }
    }
}