using System;

namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Por favor entre com o valor a ser calculado o fatorial");    
            int n;
            n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine ("Hello HacktoberFest!\n");

            Console.WriteLine("Fatorial de "+n+" = "+fat(n));
            
            Console.WriteLine ("\n");

        }
        public static int fat(int n)
        {
            int resp;
            if(n==0||n==1)
            {
                resp = 1;
            }
            else
            {
                resp = n*fat(n-1);
            }
            return resp;

        }
    }
}