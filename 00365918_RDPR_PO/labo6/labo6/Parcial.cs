namespace labo6
{
    public class Parcial : Evaluacion
    {
        private int CanPregutnas;

        public Parcial(int porcentaje, string nombre, int canPregutnas) : base(porcentaje, nombre)
        {
            CanPregutnas = canPregutnas;
        }

        public override string ToString()
        {
            return $"{base.ToString()},{nameof(CanPregutnas)}: {CanPregutnas}";
        }
    }
}