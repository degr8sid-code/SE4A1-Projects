using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Sum Of Two Numbers\n\n");
            Console.WriteLine("Enter first number");
            int one = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter second number");
            int second = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("sum " +(one+second)) ;
        }
    }
}
