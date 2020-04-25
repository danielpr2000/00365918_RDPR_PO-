using System;
using System.Collections.Generic;

namespace lab05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            String vocales="";
            String Mayusculas="";
            String Minusculas="";
            
            int n=0;
            Console.Write("Ingrese el numero de letra desea isertar: ");
             n=Int32.Parse(Console.ReadLine());
            
            Console.WriteLine(n);

            char[] lista= new char[n];
            
            for (int i = 0; i < n; i++)
            {   
                Char letra;
                Console.WriteLine("Ingresa una letra: ");
                letra = Convert.ToChar(Console.ReadLine());
                lista[i] = letra;
            }
            
            foreach (var i in lista)
            {
                if (i >= 65 && i <= 90)
                {
                    Mayusculas = Mayusculas + Convert.ToString(i) + " ";

                }
                else
                {
                    Minusculas = Minusculas + Convert.ToString(i) + " ";
                }

                switch (i)
                {
                   case 'a' :
                   case 'e':
                   case 'i':
                   case 'o':
                   case 'u': vocales = vocales + Convert.ToString(i) + " ";
                       break;
                   
                }
                
            }

            Console.Write("Vocales: ");
            Console.Write(vocales);
            Console.Write("\n");
            Console.Write("Mayusculas: ");
            Console.Write(Mayusculas);
            Console.Write("\n");  
            Console.Write("Minusculas: ");
            Console.Write(Minusculas);
            
        }
    }
}