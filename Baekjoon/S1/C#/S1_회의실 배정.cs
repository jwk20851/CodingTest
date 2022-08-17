https://www.acmicpc.net/problem/1931

using System;
using System.Collections.Generic;
using System.Linq;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<List<long>> list1 = new List<List<long>>();

            for (int i = 0; i < n; i++)
            {
                long[] time = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);
                list1.Add(new List<long> { time[0], time[1] });
            }

            var b = list1.OrderBy(x => x[1]).ThenBy(x => x[0]);

            long[,] timetable = new long[2, list1.Count];
            int cnt = 0;
            foreach (var item in b)
            {
                timetable[0, cnt] = item[0];
                timetable[1, cnt] = item[1];
                cnt++;
            }

            cnt = 1;
            long[,] nowtable = new long[2, 1];
            nowtable[0, 0] = timetable[0, 0];
            nowtable[1, 0] = timetable[1, 0];

            for (int i = 1; i < timetable.GetLength(1); i++)
            {
                if (timetable[0, i] >= nowtable[1, 0])
                {
                    nowtable[1, 0] = timetable[1, i];
                    cnt++;
                }
            }
            Console.WriteLine(cnt);
        }
    }
}