using System;
using System.Collections.Generic;

namespace labo6
{
    public static class CalcularNota
    {
        public static double Calcular(List<Evaluacion> ev)
        {
            double Total = 0;

            foreach (var obj in ev)
            {
                double nota;
                Console.Write("Nombre de evaluacion: " + obj.Nombre +", Porcentaje: " + obj.Porcentaje);
                Console.Write("\nEscriba la nota: ");
                nota = Convert.ToDouble(Console.ReadLine());
                nota = nota * (obj.Porcentaje / 100d);
                Total += nota;
                
            }
            Console.Write("la nota final es: ");

            return Total;
        }
    }
}