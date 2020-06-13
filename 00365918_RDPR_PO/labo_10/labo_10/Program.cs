using System;

namespace labo_10
{
    internal class Program
    {
        
        public delegate void MyDelegate();
        private static MyDelegate md;
        
        public static void Main(string[] args)
        {
            md = Mostrar;
            md += Totales;

            Action myAction;
            myAction = Mostrar;
            myAction += Totales;
            myAction += ComienzaPor;
            
            int i;
            String menu = "1.Agregar Cuenta\n2.Mostrar Cunetas\n3.Mostrar Cunetas y total\n" +
                          "4.Mostrar Cuentas,Totales,Usario con la letra: \n0.Salir\n";

            do
            {
                Console.Write(menu +"Escriba la opcion\n");
                i = Convert.ToInt32(Console.ReadLine());
                
                switch (i)
                {
                    case 1:
                        
                        Console.Write("\n");
                        
                        string name;
                        double salario;
                    
                        Console.Write("Escriba el nombre\n");
                        name = Console.ReadLine();
                    
                        Console.Write("Escriba el salario\n");
                        salario = Convert.ToInt32(Console.ReadLine());
                    
                        Console.Write("Se ha agregado la cuenta");
                        CuentaBancaria.Cuentas.Add(new CuentaBancaria(name,salario));
                        Console.Write("\n");
                        break;
                    
                    case 2:
                        
                        Console.Write("\n");
                        
                        foreach (var cu in CuentaBancaria.Cuentas)
                        {
                            Console.Write(cu.ToString());
                            Console.Write("\n");
                        }
                        Console.Write("\n");
                        break;
                    case 3:
                        Console.Write("\n");
                        md();
                        break;
                    case 4:
                        myAction();
                        Console.Write("\n");
                        break;
                }
                
            } while (i!=0);

        }

        public static void Mostrar()
        {
            foreach (var cu in CuentaBancaria.Cuentas)
            {
                Console.Write(cu.ToString());
                Console.Write("\n");
            }

        }

        public static void Totales()
        {
            string totales;
            double total=0;

            foreach (var bc in CuentaBancaria.Cuentas)
            {
                total += bc.Saldo;
            }
            
            totales = Convert.ToString(total);
            Console.Write("El total de salarios es: "+ totales);
            Console.Write("\n");
        }

        public static void ComienzaPor()
        {
            
            foreach (var b in CuentaBancaria.Cuentas)
            {
                if (b.Nombre.Substring(0,1).Equals("A") || 
                    b.Nombre.Substring(0,1).Equals("E") ||
                    b.Nombre.Substring(0,1).Equals("I") ||
                    b.Nombre.Substring(0,1).Equals("O") ||
                    b.Nombre.Substring(0,1).Equals("U"))
                {
                    Console.WriteLine(b.ToString() + "\n");
                }
            }
            
        }
    }
}