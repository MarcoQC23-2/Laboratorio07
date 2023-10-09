/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Entidades.Cita;
import Entidades.Medico;
import Entidades.Paciente;
import Entidades.TextPrompt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author mco_a
 */
public class NuevaCita extends javax.swing.JFrame {

    

    private GestorCitas padre;
    private ListaPacientes listaPacientes;
    private ListaMedicos listaMedicos;
    private boolean isCreando;
    private int citaSelecIndex;
    /**
     * Creates new form NuevaCita
     */
    public NuevaCita() {
        initComponents();
    }
    
    public NuevaCita(ListaPacientes listaPacientes) {
        initComponents();
        this.listaPacientes = listaPacientes;
    }
    public NuevaCita(ListaMedicos listaMedicos) {
        initComponents();
        this.listaMedicos = listaMedicos;
    }
    
    public NuevaCita(GestorCitas padre) {
        initComponents();
        this.padre = padre;
        TextPrompt txtPrompt = new TextPrompt("Sin paciente", txtPaciente);
        TextPrompt txtPrompt1 = new TextPrompt("Sin medico", txtMedico);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbHora = new javax.swing.JComboBox<>();
        cbFecha = new javax.swing.JComboBox<>();
        cbEspecialidad = new javax.swing.JComboBox<>();
        txtMedico = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBuscarMedico = new javax.swing.JLabel();
        btnBuscarPaciente = new javax.swing.JLabel();
        btnCrearCita = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 AM", "12:30 AM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", " ", " " }));
        jPanel1.add(cbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, -1));

        cbFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10/09/2023", "11/09/2023", "12/09/2023", "13/09/2023", "14/09/2023", "15/09/2023", "16/09/2023", "17/09/2023", "18/09/2023", "19/09/2023", "20/09/2023", "21/09/2023", "22/09/2023", "23/09/2023", "24/09/2023", "25/09/2023", "26/09/2023", "27/09/2023", "28/09/2023", "29/09/2023", "30/09/2023", "31/09/2023", "01/11/2023", "02/11/2023", "03/11/2023", "04/11/2023", "05/11/2023", "06/11/2023", "07/11/2023", "08/11/2023", "09/11/2023", "10/11/2023", "11/11/2023", "12/11/2023", "13/11/2023", "14/11/2023", "15/11/2023", "16/11/2023", "17/11/2023", "18/11/2023", "19/11/2023", "20/11/2023", "21/11/2023", "22/11/2023", "23/11/2023", "24/11/2023", "25/11/2023", "26/11/2023", "27/11/2023", "28/11/2023", "29/11/2023", "30/11/2023", "01/12/2023", "02/12/2023", "03/12/2023", "04/12/2023", "05/12/2023", "06/12/2023", "07/12/2023", "08/12/2023", "09/12/2023", "10/12/2023", "11/12/2023", "12/12/2023", "13/12/2023", "14/12/2023", "15/12/2023", "16/12/2023", "17/12/2023", "18/12/2023", "19/12/2023", "20/12/2023", "21/12/2023", "22/12/2023", "23/12/2023", "24/12/2023", "25/12/2023", "26/12/2023", "27/12/2023", "28/12/2023", "29/12/2023", "30/12/2023", "31/12/2023" }));
        jPanel1.add(cbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, -1));

        cbEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina Familiar", "Medicina Interna", "Endocrinología", "Pediatría", "Gineco-osbtetricia", "Cirugía", "Psiquiatría", "Cardiología", "Dermatología", "Gastroenterología", "Infectología", "Nefrología", "Oftalmología", "Otorrinolaringología", "Neumología", "Neurología", "Radiología", "Anestesiología", "Oncología", "Patología", "Urología", "Medicina física y rehabilitación", "Medicina Intensiva" }));
        cbEspecialidad.setBorder(null);
        jPanel1.add(cbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 176, 270, 30));

        txtMedico.setEditable(false);
        txtMedico.setBackground(new java.awt.Color(255, 255, 255));
        txtMedico.setBorder(null);
        jPanel1.add(txtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, -1));

        txtPaciente.setEditable(false);
        txtPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtPaciente.setBorder(null);
        jPanel1.add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 260, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ComboBox1.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 220, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ComboBox.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 220, -1, -1));

        btnBuscarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Btn-Turquesa1.png"))); // NOI18N
        btnBuscarMedico.setText("Buscar Medico");
        btnBuscarMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMedicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMedicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMedicoMouseExited(evt);
            }
        });
        jPanel1.add(btnBuscarMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 120, -1, -1));

        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Btn-Turquesa1.png"))); // NOI18N
        btnBuscarPaciente.setText("Buscar Paciente");
        btnBuscarPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarPacienteMouseExited(evt);
            }
        });
        jPanel1.add(btnBuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 70, -1, -1));

        btnCrearCita.setForeground(new java.awt.Color(204, 204, 204));
        btnCrearCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Btn-Verde1.png"))); // NOI18N
        btnCrearCita.setText("Crear Cita");
        btnCrearCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCitaMouseExited(evt);
            }
        });
        jPanel1.add(btnCrearCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 284, -1, -1));

        btnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Btn-Rojo1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 284, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/TextField2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 170, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/TextField2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/TextField2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 70, -1, -1));

        jLabel2.setText("Nueva Cita");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ListarPacientes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 478, 349));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnBuscarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPacienteMouseClicked
        if(listaPacientes == null){
            listaPacientes = new ListaPacientes(this);
        }
        listaPacientes.setLocationRelativeTo(this);
        listaPacientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBuscarPacienteMouseClicked

    private void btnBuscarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPacienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPacienteMouseEntered

    private void btnBuscarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPacienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPacienteMouseExited

    private void btnBuscarMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedicoMouseClicked
        if(listaMedicos == null){
            listaMedicos = new ListaMedicos(this);
        }
        listaMedicos.setLocationRelativeTo(this);
        listaMedicos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBuscarMedicoMouseClicked

    private void btnBuscarMedicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedicoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMedicoMouseEntered

    private void btnBuscarMedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedicoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMedicoMouseExited

    private void btnCrearCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCitaMouseClicked
        // Obtén los datos ingresados en los campos
        String fecha = (String) cbFecha.getSelectedItem();
        String hora = (String) cbHora.getSelectedItem();
        String especialidad = (String) cbEspecialidad.getSelectedItem();
        String medicoNombre = txtMedico.getText();
        String pacienteNombre = txtPaciente.getText();

        // Aquí debes crear instancias de Medico y Paciente con los nombres ingresados
        Medico medico = new Medico(medicoNombre); // Debes definir la clase Medico adecuadamente
        Paciente paciente = new Paciente(pacienteNombre); // Debes definir la clase Paciente adecuadamente

        // Crea una nueva instancia de Cita con los datos
        Cita cita = new Cita(medico, paciente, fecha, hora, especialidad);

        // Agrega la nueva cita al DefaultListModel de GestorCitas
        padre.listaCitas.addElement(cita);

        padre.agregarCita(cita);
        // Cierra la ventana actual y muestra la ventana de GestorCitas
        Cerrar();
    }//GEN-LAST:event_btnCrearCitaMouseClicked

    private void btnCrearCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCitaMouseEntered

    private void btnCrearCitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCitaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCitaMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if(padre == null){
            padre = new GestorCitas(this);
        }
        padre.setLocationRelativeTo(this);
        padre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseExited

    private void Cerrar(){
       this.padre.setVisible(true);
       this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarMedico;
    private javax.swing.JLabel btnBuscarPaciente;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCrearCita;
    public javax.swing.JComboBox<String> cbEspecialidad;
    public javax.swing.JComboBox<String> cbFecha;
    public javax.swing.JComboBox<String> cbHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtMedico;
    public javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}