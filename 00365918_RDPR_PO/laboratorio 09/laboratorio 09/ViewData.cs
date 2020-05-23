using System;
using System.Windows.Forms;

namespace laboratorio_09
{
    public partial class ViewData : UserControl
    {
        public ViewData()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se puede dejar campos vacios");
            }
            else
            {
                try
                {
                    var dt = ConnectionDB.ExecuteQuery($"SELECT mat.idMateria, mat.nombre " +
                                                       "FROM INSCRIPCION ins, MATERIA mat, ESTUDIANTE est " +
                                                       $"WHERE ins.idMateria = mat.idMateria AND ins.carnet = est.carnet " +
                                                       $"AND ins.carnet = '{textBox1.Text}'");
                    
                    dataGridView1.DataSource = dt;
                    MessageBox.Show("Datos obtenido exitosamente");
                }
                catch (Exception exception)
                {
                    MessageBox.Show("Ha ocurrido un problema");
                }
            }
        }
    }
}