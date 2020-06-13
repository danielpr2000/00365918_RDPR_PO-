using System;
using System.Collections.Generic;

namespace labo_10
{
    public class CuentaBancaria
    {
        private String nombre;
        private double saldo;
        static List<CuentaBancaria> cuentas = new List<CuentaBancaria>();

        public CuentaBancaria(String nombre, double saldo)
        {
            this.nombre = nombre;
            this.saldo = saldo;
        }
        
        public static List<CuentaBancaria> Cuentas
        {
            get => cuentas;
        }

        public double Saldo => saldo; 
        public String Nombre => nombre;
        
        public override string ToString()
        {
            return $"{nameof(nombre)}: {nombre}, {nameof(saldo)}: {saldo}";
        }
    }
}