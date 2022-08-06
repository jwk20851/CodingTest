https://www.acmicpc.net/problem/17478

using System;

namespace Baekjoon
{
    class Program
    {
        static StreamWriter sw = new(new BufferedStream(Console.OpenStandardOutput()));
        static string[] arr = {
                "\"����Լ��� ������?\"",
                "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.",
                "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.",
                "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"",
                "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"",
                "��� �亯�Ͽ���.",
                "____"
            };

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int m = n;
            sw.WriteLine("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
            call(0, m);
            sw.Close();
        }

        static void call(int n, int m)
        {
            under(n);
            sw.WriteLine(arr[0]);
            if (n == m)
            {
                under(n);
                sw.WriteLine(arr[4]);
                under(n);
                sw.WriteLine(arr[5]);
                return;
            }
            under(n);
            sw.WriteLine(arr[1]);
            under(n);
            sw.WriteLine(arr[2]);
            under(n);
            sw.WriteLine(arr[3]);

            call(n + 1, m);
            under(n);
            sw.WriteLine(arr[5]);
        }

        static void under(int n)
        {
            for (int i = 0; i < n; i++)
                sw.Write(arr[6]);
        }
    }
}