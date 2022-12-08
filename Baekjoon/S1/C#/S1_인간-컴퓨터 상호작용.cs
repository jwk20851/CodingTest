https://www.acmicpc.net/problem/16139

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string S = Console.ReadLine();
            int q = int.Parse(Console.ReadLine());

            int[,] arr = new int[S.Length + 1, 26];
            for (int i = 1; i <= S.Length; i++)
            {
                for (int j = 0; j < 26; j++)
                {
                    if (arr[i - 1, j] > 0)
                        arr[i, j] += arr[i - 1, j];
                }

                int idx = S[i - 1] - 'a';
                arr[i, idx]++;
            }

            StringBuilder sb = new StringBuilder();
            while (q-- > 0)
            {
                string[] clr = Console.ReadLine().Split(' ');
                int c = char.Parse(clr[0]) - 'a';
                int l = int.Parse(clr[1]);
                int r = int.Parse(clr[2]);

                int cnt = arr[r + 1, c] - arr[l, c];

                sb.Append(cnt + "\n");
            }

            Console.Write(sb);
        }
    }
}
/*
using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string S = Console.ReadLine();
            int q = int.Parse(Console.ReadLine());
            
            StringBuilder sb = new StringBuilder();
            while(q-- > 0){
                string[] clr = Console.ReadLine().Split(' ');
                char c = char.Parse(clr[0]);
                int l = int.Parse(clr[1]);
                int r = int.Parse(clr[2]);
                
                string tmp = S.Substring(l, r-l+1);
                int cnt = tmp.Split(c).Length - 1;
                
                sb.Append(cnt+"\n");
            }
            
            Console.Write(sb);
        }
    }
}
 */