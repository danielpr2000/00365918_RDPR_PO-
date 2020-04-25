using System;

namespace lab01
{
    internal class Program
    {
        
        static void Main(string[] args)
        {

            int a = 0;
            int b = 1;
            int resutado=0;
            
            Console.Write("Ingrese hasta que termino desea que llegue la secuencia: ");
                        
            byte n = Convert.ToByte(Console.ReadLine());
                        
            if (n == 1)
            {
                            
                Console.WriteLine("Secuencia de Fibonacci"); 
                Console.Write(a);
            }
            
            if (n == 2)
            {
                Console.WriteLine("Secuencia de Fibonacci");
                Console.WriteLine(a +" "+ b );
                            
            }
            
            if (n > 3)
            {
                Console.WriteLine("Secuencia de Fibonacci");
                Console.Write(a +" "+ b );
            
                for (byte i = 3; i <= n; i++)
                {
                    resutado = a + b;
                    a = b;
                    b = resutado;
                                
                    Console.Write(" " + resutado);
            
                }
            
            }
                        
        }
        
    }
}