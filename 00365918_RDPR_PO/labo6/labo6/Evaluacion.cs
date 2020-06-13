using System;
using System.Collections.Generic;

namespace labo6
{
    public class Evaluacion
    {

        protected int porcentaje;
        protected String nombre;

        public int Porcentaje => porcentaje;

        public string Nombre => nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }
        
        public override string ToString()
        {
            return $"{nameof(nombre)}: {nombre},{nameof(porcentaje)}: {porcentaje}";
        }
    }
}