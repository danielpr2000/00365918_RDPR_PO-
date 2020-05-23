﻿using System;
using System.Collections.Generic;
using System.Data;
using System.Windows.Forms;
using System.Windows.Forms.VisualStyles;

namespace laboratorio_09
{
    public partial class Inscripition : UserControl
    {
        public Inscripition()
        {
            InitializeComponent();
        }


        private void Inscripition_Load(object sender, EventArgs e)
        {
            var assignatures = ConnectionDB.ExecuteQuery("SELECT nombre FROM materia");
            var assignatureCombo = new List<string>();

            foreach (DataRow dr in assignatures.Rows)
            {
                assignatureCombo.Add(dr[0].ToString());
            }

            comboBox1.DataSource = assignatureCombo;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se pueden dejar campos vacios");
            }
            else
            {
                try
                {
                    string query = $"SELECT idMateria FROM materia WHERE nombre = '{comboBox1.SelectedItem.ToString()}'";

                    var dt = ConnectionDB.ExecuteQuery(query);

                    var dr = dt.Rows[0];
                    
                    var idMateria = Convert.ToInt32(dr[0].ToString());

                    string nonQuery = $"INSERT INTO INSCRIPCION(idMateria,carnet) VALUES(" +
                                      $"{idMateria}," +
                                      $"'{textBox1.Text}')";

                    ConnectionDB.ExecuteNonQuery(nonQuery);

                    MessageBox.Show("Se ha inscrito la materia");
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Ah ocurrido un error");
                }
                
            }
        }
    }
}