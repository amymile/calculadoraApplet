
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiky
 */
public class dias extends javax.swing.JApplet implements ActionListener {
 
 
  /**
   * Initializes the applet dias
   */
  public Dias(){}
  
  @Override
  public void init() {
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
      java.util.logging.Logger.getLogger(dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the applet */
    try {
      java.awt.EventQueue.invokeAndWait(new Runnable() {
        public void run() {
          initComponents();
        }
      });
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /**
   * This method is called from within the init() method to initialize
   * the form. WARNING: Do NOT modify this code. The content of this
   * method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabelhoras = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabelminutos = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabelsegundos = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jSpinnerD = new javax.swing.JSpinner();
    jButtoncalcular = new javax.swing.JButton();

    jLabel1.setText("horas minutos y segundos");

    jLabel2.setText("agregar cantidad de dias");

    jLabelhoras.setText("agregar cantidad de dias");

    jLabel4.setText("horas");

    jLabelminutos.setText("agregar cantidad de dias");

    jLabel6.setText("minutos");

    jLabelsegundos.setText("agregar cantidad de dias");

    jLabel8.setText("segundos");

    jButtoncalcular.setText("calcular");
    jButtoncalcular.addActionListener(this);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
              .addContainerGap()
              .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(jSpinnerD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
              .add(138, 138, 138)
              .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 203, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(layout.createSequentialGroup()
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelminutos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(layout.createSequentialGroup()
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabelsegundos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                  .add(jButtoncalcular)
                  .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelhoras, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(131, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jSpinnerD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(18, 18, 18)
        .add(jButtoncalcular)
        .add(7, 7, 7)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel4)
          .add(jLabelhoras, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(52, 52, 52)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel6)
          .add(jLabelminutos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(52, 52, 52)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel8)
          .add(jLabelsegundos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(51, Short.MAX_VALUE))
    );
  }

  // Code for dispatching events from components to event handlers.

  public void actionPerformed(java.awt.event.ActionEvent evt) {
    if (evt.getSource() == jButtoncalcular) {
      dias.this.jButtoncalcularActionPerformed(evt);
    }
  }// </editor-fold>//GEN-END:initComponents

  private void jButtoncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncalcularActionPerformed
    // TODO add your handling code here:
    int dias=((Number)jSpinnerD.getValue()).intValue();
    int horas=dias*24;
    jLabelhoras.setText(String.valueOf(horas));
    int minutos=horas*60;
    jLabelminutos.setText(String.valueOf(minutos));
    int segundos=horas*3600;
    jLabelsegundos.setText(String.valueOf(segundos));
    
    
    
  }//GEN-LAST:event_jButtoncalcularActionPerformed
   
  public dias(JButton jButtoncalcular, JLabel jLabel1, JLabel jLabel2, JLabel jLabel4, JLabel jLabel6, JLabel jLabel8, JLabel jLabelhoras, JLabel jLabelminutos, JLabel jLabelsegundos, JSpinner jSpinnerD) throws HeadlessException {
    this.jButtoncalcular = jButtoncalcular;
    this.jLabel1 = jLabel1;
    this.jLabel2 = jLabel2;
    this.jLabel4 = jLabel4;
    this.jLabel6 = jLabel6;
    this.jLabel8 = jLabel8;
    this.jLabelhoras = jLabelhoras;
    this.jLabelminutos = jLabelminutos;
    this.jLabelsegundos = jLabelsegundos;
    this.jSpinnerD = jSpinnerD;
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton jButtoncalcular;
  public javax.swing.JLabel jLabel1;
  public javax.swing.JLabel jLabel2;
  public javax.swing.JLabel jLabel4;
  public javax.swing.JLabel jLabel6;
  public javax.swing.JLabel jLabel8;
  public javax.swing.JLabel jLabelhoras;
  public javax.swing.JLabel jLabelminutos;
  public javax.swing.JLabel jLabelsegundos;
  public javax.swing.JSpinner jSpinnerD;
  // End of variables declaration//GEN-END:variables
}
