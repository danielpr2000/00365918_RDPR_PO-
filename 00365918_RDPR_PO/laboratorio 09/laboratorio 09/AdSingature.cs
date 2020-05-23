﻿using System;
using System.Windows.Forms;

namespace laboratorio_09
{
    public partial class AdSingature : UserControl
    {
        public AdSingature()
        {
            InitializeComponent();
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
                    ConnectionDB.ExecuteNonQuery($"INSERT INTO MATERIA(nombre) VALUES('{textBox1.Text}')");

                    MessageBox.Show("Se ha registrado la materia");
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Ah ocurrido un error");
                }
                
            }
        }
    }
}