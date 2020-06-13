using System;
using System.Collections.Generic;
using System.Linq;

namespace labo6
{
    internal class Program
    { 
        static Byte aux;
        private static int IntAux;
        
        static Byte opc;
        static Byte opc1;
       
        static int porcentaje;
        static string nombre;
        static DateTime fechaEntrega;
        static int canPregutnas;
        static string tipo;
        

        static String Menu = "\n1.Agregar evaluación\n" + "2.Mostrar evaluaciones almacenadas\n" +
                                  "3.Eliminar evaluación\n" + "0.Terminar programa\n";

        private static String Menu2 = "Seleccione el tipo de evaluacion que desea añadir\n" +
                                      "1.Tarea\n" + "2.Parcial\n" + "3.Laboratiorio\n" + "0.Salir ";
                    
                    
        public static void Main(string[] args) 
        {
            var Evaluaciones = new List<Evaluacion>();
            int PocentajeFree = 100;
            
            do
            {
                PedirMenu();

                switch (opc)
                {
                   case 1:
                       if (PocentajeFree == 0)
                       {
                           Console.Write("No se puede agregar mas evaluaciones por que no ya promedio libre");
                       }
                       else
                       {
                           do 
                           { 
                               PedirMenu2();

                           switch (opc1)
                           {
                               case 1:
                                   
                                    Console.Write("Nombre de evaluacion: ");
                                    nombre = Console.ReadLine();
                                    
                                    PorcentajeExper(PocentajeFree);
                                    PocentajeFree-= porcentaje;
                                    
                                    Console.Write("Introduza la fecha de entrega: ");
                                    fechaEntrega = Convert.ToDateTime(Console.ReadLine());
                                    
                                    Evaluaciones.Add(new Tarea(porcentaje,nombre,fechaEntrega));
                                   
                                   break;
                               case 2:
                                   Console.Write("Nombre de evaluacion: ");
                                   nombre = Console.ReadLine();
                                   
                                   PorcentajeExper(PocentajeFree);
                                   PocentajeFree-= porcentaje;

                                   PedirCantidadP();
                                   
                                  Evaluaciones.Add(new Parcial(porcentaje,nombre,canPregutnas));
                                  
                                  break;
                               case 3:
                                   Console.Write("Nombre de evaluacion: ");
                                   nombre = Console.ReadLine();
                                   
                                   PorcentajeExper(PocentajeFree);
                                   PocentajeFree-= porcentaje;
                                   
                                  Console.Write("Tipo de evalucion: ");
                                   tipo = Console.ReadLine(); 
                                   
                                   Evaluaciones.Add(new Laboratorio(porcentaje,nombre,tipo));
                                   break;
                               case 0:
                                   Console.Write("Saliendo");
                                   break;
                           }
                           
                           } while (opc1!=0);
                       }
                           
                       break;
                   case 2:
                       if (Evaluaciones.Count==0)
                       {
                           Console.WriteLine("No hay evaluaciones");
                       }
                       else
                       {
                          foreach (var ev in Evaluaciones)
                          {
                              Console.Write(ev.ToString());
                          } 
                       }
                       
                       break;
                   case 3:

                       if (Evaluaciones.Count==0)
                       {
                           Console.Write("No hay evaluaciones");
                       }
                       else
                       {
                          Console.Write("Ingrese el nombre de la evaluacion que desea eliminar: ");
                          String NombreDelete = Console.ReadLine();
                          
                       Evaluaciones.Remove(Evaluaciones.FirstOrDefault(s => {
                           
                           if(s.Nombre.Equals(NombreDelete,StringComparison.InvariantCultureIgnoreCase)){
                             PocentajeFree +=s.Porcentaje;
                             return true; 
                           } 
                           return false;
                       })); 
                       
                       }
                       break;
                   case 0: 
                       Console.Write(CalcularNota.Calcular(Evaluaciones));
                       break;
                }
            } while (opc!=0);
            
        }
        
        public static void  PedirMenu()
        {
            try
            {
                Console.Write(Menu); 
                aux = Convert.ToByte(Console.ReadLine());
                opc= aux;
            }
            catch (FormatException e)
            {
               Console.WriteLine("solo se admiten numeros"); 
               PedirMenu();
            }
        }

        public static void PedirMenu2()
        {
            try
            {
                Console.Write(Menu2); 
                aux = Convert.ToByte(Console.ReadLine());
                opc1= aux;
            }
            catch (FormatException e)
            {
                Console.WriteLine("solo se admiten numeros"); 
                PedirMenu2();
            }
        }

        public static void PediPorcentaje()
        {
            try
            {
               Console.Write("Pocentaje: "); 
                IntAux = Convert.ToInt32(Console.ReadLine());
                porcentaje = IntAux;

            }
            catch (FormatException e)
            {
                Console.WriteLine("Porcentaje solo admite numeros");
                PediPorcentaje();
            }
            
        }

        public static void PorcentajeExper(int PocentajeFree)
        {
            try
            {
                
                Console.WriteLine("pocentaje disponble: " + PocentajeFree + "%");
                Console.WriteLine("Pocentaje: ");
                IntAux = Convert.ToInt32(Console.ReadLine());
                porcentaje = 0;
                porcentaje = IntAux;
                
                if (porcentaje <= 0 || porcentaje > PocentajeFree)
                {
                    if (porcentaje == 0) { Console.WriteLine("El porcentaje no puede ser 0%"); }
                   
                    if (porcentaje < 0) { Console.WriteLine("El porcentaje no puede ser negativo"); }
                   
                    if (porcentaje > PocentajeFree) { Console.WriteLine("El Porcentaje no debe ser mayor a :" + PocentajeFree+ "%");} 
                    
                    do
                    {
                        PorcentajeExper(PocentajeFree);

                        if (porcentaje == 0) { Console.WriteLine("El porcentaje no puede ser 0%"); }

                        if (porcentaje < 0) { Console.WriteLine("El porcentaje no puede ser negativo"); }

                        if (porcentaje > PocentajeFree) { Console.WriteLine("El Porcentaje no debe ser mayor a" + PocentajeFree + "%");}
                        
                    } while (porcentaje <= 0 || porcentaje > PocentajeFree); 
                }
            }
            catch (FormatException e)
            {
                Console.WriteLine("Porcentaje solo admite numeros");
                PediPorcentaje();
            }
        }
        
        public static void PedirCantidadP()
        {

            try
            {
                 Console.Write("Cantidad de preguntas: ");
                 IntAux= Convert.ToInt32(Console.ReadLine());
                 canPregutnas = IntAux;
                 if (canPregutnas <= 0)
                 {
                     Console.Write("No puede contener 0 preguntas o numero de preguntas negativas");
                     do
                     {
                         PedirCantidadP();
                         if (canPregutnas<=0)
                         {
                             Console.Write("No puede contener 0 preguntas o numero de preguntas negativas");
                         }
                                                          
                     } while (canPregutnas <= 0);
                 }
            }
            catch (FormatException e)
            {
                Console.WriteLine("Cantidad de preguntas solo admite numeros");
                PedirCantidadP();
            }
        }
    }
}