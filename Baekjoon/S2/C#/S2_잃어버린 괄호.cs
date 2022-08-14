https://www.acmicpc.net/problem/1541

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] arr = Console.ReadLine().Split('-');
            for (int i = 0; i < arr.Length; i++)
            {
                int sum = 0;
                string[] numberArr = arr[i].Split('+');

                if (numberArr.Length > 1)
                {
                    for (int j = 0; j < numberArr.Length; j++)
                        sum += int.Parse(numberArr[j]);
                }
                else
                    sum = int.Parse(arr[i]);

                arr[i] = sum.ToString();
            }

            int result = int.Parse(arr[0]);
            for (int i = 1; i < arr.Length; i++)
                result -= int.Parse(arr[i]);

            Console.WriteLine(result);
        }
    }
}