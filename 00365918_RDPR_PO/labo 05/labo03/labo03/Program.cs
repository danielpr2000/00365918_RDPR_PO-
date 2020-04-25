using System;

namespace labo03
{
    internal class Program
    {
       public static void Main(String[] args)
       {


           Console.Write(" Ingrese el numero hasta que la secuencia llegara: ");
           
                int n = Int32.Parse(Console.ReadLine());
                n++;
                    
               String resultado = recursiveDesc(1, n) + ", " + recursiveAsc(n - 1);
               Console.Write("Result: " + resultado);
           }
       
             private static String recursiveAsc(int a) {
                 
                 return a == 1 ? "" + a : (a + ", " + recursiveAsc(a - 1));
            } 
          
             private static String recursiveDesc(int a, int i) {
                     return a == i? ("" + a) : a + ", " + recursiveDesc(a + 1, i);
            }
           
    }
}