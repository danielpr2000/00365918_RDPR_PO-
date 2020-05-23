namespace laboratorio_09
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.registerStudent1 = new laboratorio_09.RegisterStudent();
            this.buttonRegisterStudent = new System.Windows.Forms.Button();
            this.buttonAdSingature = new System.Windows.Forms.Button();
            this.buttonInscription = new System.Windows.Forms.Button();
            this.buttonConsultar = new System.Windows.Forms.Button();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.registerStudent1, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.buttonRegisterStudent, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonAdSingature, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonInscription, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonConsultar, 3, 0);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.tableLayoutPanel1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 2;
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15.58441F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 84.41559F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 20F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(823, 591);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // registerStudent1
            // 
            this.tableLayoutPanel1.SetColumnSpan(this.registerStudent1, 4);
            this.registerStudent1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.registerStudent1.Location = new System.Drawing.Point(3, 97);
            this.registerStudent1.Margin = new System.Windows.Forms.Padding(3, 5, 3, 5);
            this.registerStudent1.Name = "registerStudent1";
            this.registerStudent1.Size = new System.Drawing.Size(817, 489);
            this.registerStudent1.TabIndex = 4;
            // 
            // buttonRegisterStudent
            // 
            this.buttonRegisterStudent.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonRegisterStudent.Location = new System.Drawing.Point(3, 2);
            this.buttonRegisterStudent.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.buttonRegisterStudent.Name = "buttonRegisterStudent";
            this.buttonRegisterStudent.Size = new System.Drawing.Size(199, 88);
            this.buttonRegisterStudent.TabIndex = 5;
            this.buttonRegisterStudent.Text = "Estudiante";
            this.buttonRegisterStudent.UseVisualStyleBackColor = true;
            this.buttonRegisterStudent.Click += new System.EventHandler(this.button1_Click);
            // 
            // buttonAdSingature
            // 
            this.buttonAdSingature.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonAdSingature.Location = new System.Drawing.Point(208, 2);
            this.buttonAdSingature.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.buttonAdSingature.Name = "buttonAdSingature";
            this.buttonAdSingature.Size = new System.Drawing.Size(199, 88);
            this.buttonAdSingature.TabIndex = 6;
            this.buttonAdSingature.Text = "Materia";
            this.buttonAdSingature.UseVisualStyleBackColor = true;
            this.buttonAdSingature.Click += new System.EventHandler(this.button2_Click);
            // 
            // buttonInscription
            // 
            this.buttonInscription.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonInscription.Location = new System.Drawing.Point(413, 2);
            this.buttonInscription.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.buttonInscription.Name = "buttonInscription";
            this.buttonInscription.Size = new System.Drawing.Size(199, 88);
            this.buttonInscription.TabIndex = 7;
            this.buttonInscription.Text = "Inscripcion";
            this.buttonInscription.UseVisualStyleBackColor = true;
            this.buttonInscription.Click += new System.EventHandler(this.button3_Click);
            // 
            // buttonConsultar
            // 
            this.buttonConsultar.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonConsultar.Location = new System.Drawing.Point(618, 2);
            this.buttonConsultar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.buttonConsultar.Name = "buttonConsultar";
            this.buttonConsultar.Size = new System.Drawing.Size(202, 88);
            this.buttonConsultar.TabIndex = 8;
            this.buttonConsultar.Text = "Consultar";
            this.buttonConsultar.UseVisualStyleBackColor = true;
            this.buttonConsultar.Click += new System.EventHandler(this.button4_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(823, 591);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "Form1";
            this.Text = "Form1";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);
        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private laboratorio_09.RegisterStudent registerStudent1;
        private System.Windows.Forms.Button buttonConsultar;
        private System.Windows.Forms.Button buttonInscription;
        private System.Windows.Forms.Button buttonAdSingature;
        private System.Windows.Forms.Button buttonRegisterStudent;
    }
}