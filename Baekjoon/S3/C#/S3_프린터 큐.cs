https://www.acmicpc.net/problem/1966

using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0)
            {
                LinkedList<int[]> q = new LinkedList<int[]>();
                int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                for (int i = 0; i < arr.Length; i++)
                    q.AddLast(new int[] { i, arr[i] });

                int cnt = 0;
                while (q.Count > 0)
                {
                    int[] front = q.First.Value;
                    q.RemoveFirst();
                    bool max = true;

                    for (int i = 0; i < q.Count; i++)
                    {
                        if (front[1] < q.ElementAt(i)[1])
                        {
                            q.AddLast(front);
                            for (int j = 0; j < i; j++)
                            {
                                q.AddLast(q.First.Value);
                                q.RemoveFirst();
                            }

                            max = false;
                            break;
                        }
                    }

                    if (!max)
                        continue;

                    cnt++;

                    if (front[0] == nm[1])
                        break;
                }
                sb.Append(cnt + "\n");
            }
            Console.Write(sb);
        }
    }
}