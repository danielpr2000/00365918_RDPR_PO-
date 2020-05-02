using System;

namespace labo6
{
    public class Tarea: Evaluacion

    {
    protected DateTime fechaEntrega;

    public Tarea(int porcentaje, string nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
    {
        this.fechaEntrega = fechaEntrega;
    }

    public override string ToString()
    {
        return $"{base.ToString()}, {nameof(fechaEntrega)}: {fechaEntrega}";
    }
    
    }
}