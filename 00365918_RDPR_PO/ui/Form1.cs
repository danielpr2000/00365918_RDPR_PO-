using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace ui
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<string>() {"Morado","Celeste","Rosado" };
        }

        private void buttonRed_Click(object sender, EventArgs e)
        {
            BackColor = Color.Brown;
        }

        private void buttonBlue_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void buttonGreen_Click(object sender, EventArgs e)
        {
           BackColor = Color.Lime; 
        }


        private void RenameButton_Click(object sender, EventArgs e)
        {
            BackColor = System.Drawing.ColorTranslator.FromHtml("#" + textBox1.Text);
        }

        private void ChangeColor_Click(object sender, EventArgs e)
        {
            String Morado = "#b03ef7", Celeste = "#3ee5f7", Rosado = "#f73eeb";
            switch (comboBox1.SelectedIndex)
            {
               case 0:
                   BackColor = ColorTranslator.FromHtml(Morado);
                   break;
               case 1 :
                   BackColor = ColorTranslator.FromHtml(Celeste); 
                   break;
               case 2 :
                   BackColor= ColorTranslator.FromHtml(Rosado);
                   break;
            }
        }
    }
}