using System;

namespace lab04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Ingrese una frase o palabra: ");
            String palabra = Console.ReadLine();
            
            Console.Write(palabra.Replace("a","b"));

        }
    }
}