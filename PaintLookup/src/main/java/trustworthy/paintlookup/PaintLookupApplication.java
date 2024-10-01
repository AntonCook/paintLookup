/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trustworthy.paintlookup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



/**
 *
 * @author dave
 */
public class PaintLookupApplication extends javax.swing.JFrame {

    /**
     * Creates new form PaintLookupApplication
     */
    
    //Setting up Variables for application
    
    private String CustomerName;
    private String PaintColorName;
    private String PaintColorNumber;
    private String PaintType;
    private String PaintBase;
    private String PaintFinish;
    private String Terior;
    private String Ax, B, C, D, E, F, I, L, Kx, M, S, T;
    
    
    
    
    public PaintLookupApplication() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CustomerNameTextField = new javax.swing.JTextField();
        PaintColorNameTextField = new javax.swing.JTextField();
        PaintColorNumberTextField = new javax.swing.JTextField();
        PaintTypeSelection = new javax.swing.JComboBox<>();
        PaintBaseSelection = new javax.swing.JComboBox<>();
        PaintFinishSelection = new javax.swing.JComboBox<>();
        AxTextField = new javax.swing.JTextField();
        BTextField = new javax.swing.JTextField();
        CTextField = new javax.swing.JTextField();
        DTextField = new javax.swing.JTextField();
        ETextField = new javax.swing.JTextField();
        FTextField = new javax.swing.JTextField();
        ITextField = new javax.swing.JTextField();
        KxTextField = new javax.swing.JTextField();
        LTextField = new javax.swing.JTextField();
        MTextField = new javax.swing.JTextField();
        STextField = new javax.swing.JTextField();
        TTextField = new javax.swing.JTextField();
        AddRecordButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        TeriorSelection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 700));
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("Customer Name:");

        jLabel2.setText("Paint Color Number:");

        jLabel3.setText("Paint Color Name:");

        jLabel4.setText("Base:");

        jLabel5.setText("Finish:");

        jLabel7.setText("Paint Type:");

        jLabel8.setText("Ax:");

        jLabel9.setText("B:");

        jLabel10.setText("C:");

        jLabel11.setText("D:");

        jLabel12.setText("E:");

        jLabel13.setText("F:");

        jLabel14.setText("I:");

        jLabel15.setText("Kx:");

        jLabel16.setText("L:");

        jLabel17.setText("M:");

        jLabel18.setText("S:");

        jLabel19.setText("T:");

        CustomerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNameTextFieldActionPerformed(evt);
            }
        });

        PaintColorNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaintColorNameTextFieldActionPerformed(evt);
            }
        });

        PaintTypeSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expressions ", "Expressions Select", "Medalion", "Medalion Plus" }));
        PaintTypeSelection.setMinimumSize(new java.awt.Dimension(150, 23));
        PaintTypeSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaintTypeSelectionActionPerformed(evt);
            }
        });

        PaintBaseSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastel", "Clear", "Tint", "Ultra White" }));

        PaintFinishSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semi-gloss", "Satin", "Flat", "Eggshell" }));

        AxTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AxTextFieldActionPerformed(evt);
            }
        });

        BTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTextFieldActionPerformed(evt);
            }
        });

        AddRecordButton.setText("Add Record");
        AddRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordButtonActionPerformed(evt);
            }
        });

        jLabel20.setText("Interior/Exterior");

        TeriorSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interior ", "Exterior" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(STextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KxTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ITextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ETextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel20)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TeriorSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaintColorNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaintColorNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaintTypeSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaintBaseSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaintFinishSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AxTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(360, 360, 360))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(AddRecordButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PaintColorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PaintColorNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PaintTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PaintBaseSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaintFinishSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TeriorSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(DTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ETextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(FTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(KxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(LTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(MTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(STextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddRecordButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNameTextFieldActionPerformed

    private void PaintColorNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaintColorNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaintColorNameTextFieldActionPerformed

    private void PaintTypeSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaintTypeSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaintTypeSelectionActionPerformed

    private void BTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTextFieldActionPerformed

    private void AddRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordButtonActionPerformed
        
        
        //Reading Inputs From Form and Assigning them to variables
        
        CustomerName = CustomerNameTextField.getText();
        CustomerNameTextField.setText("");
        PaintColorName = PaintColorNameTextField.getText();
        PaintColorNameTextField.setText("");
        PaintColorNumber = PaintColorNumberTextField.getText();
        PaintColorNumberTextField.setText("");
        PaintType = PaintTypeSelection.getSelectedItem().toString();
        PaintBase = PaintBaseSelection.getSelectedItem().toString();
        PaintFinish = PaintFinishSelection.getSelectedItem().toString();
        Ax = AxTextField.getText();
        AxTextField.setText("");
        B = BTextField.getText();
        BTextField.setText("");
        C = CTextField.getText();
        CTextField.setText("");
        D = DTextField.getText();
        DTextField.setText("");
        E = ETextField.getText();
        ETextField.setText("");
        F = FTextField.getText();
        FTextField.setText("");
        I = ITextField.getText();
        ITextField.setText("");
        Kx = KxTextField.getText();
        KxTextField.setText("");
        L = LTextField.getText();
        LTextField.setText("");
        M = MTextField.getText();
        MTextField.setText("");
        S = STextField.getText();
        STextField.setText("");
        T = TTextField.getText();
        TTextField.setText("");
        Terior = TeriorSelection.getSelectedItem().toString();
        
        
        //Sql Insertion Statement
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trustworthy", "root", "sgjanssen5");
            
            String sql = "INSERT INTO paintLookup (name, paintColor, paintNumber, terior, type, finish, base, Ax, B, C, D, E, F, I, Kx, L, M, S, T)" + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, CustomerName);
            ps.setString(2, PaintColorName);
            ps.setString(3, PaintColorNumber);
            ps.setString(4, Terior);
            ps.setString(5, PaintType);
            ps.setString(6, PaintFinish);
            ps.setString(7, PaintBase);
            ps.setString(8, Ax);
            ps.setString(9, B);
            ps.setString(10, C);
            ps.setString(11, D);
            ps.setString(12, E);
            ps.setString(13, F);
            ps.setString(14, I);
            ps.setString(15, Kx);
            ps.setString(16, L);
            ps.setString(17, M);
            ps.setString(18, S);
            ps.setString(19, T);
            
            ps.execute();
            con.close();
            System.out.println("Success");
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
        



        
        // TODO add your handling code here:
    }//GEN-LAST:event_AddRecordButtonActionPerformed

    private void AxTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AxTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AxTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PaintLookupApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintLookupApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintLookupApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintLookupApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintLookupApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecordButton;
    private javax.swing.JTextField AxTextField;
    private javax.swing.JTextField BTextField;
    private javax.swing.JTextField CTextField;
    private javax.swing.JTextField CustomerNameTextField;
    private javax.swing.JTextField DTextField;
    private javax.swing.JTextField ETextField;
    private javax.swing.JTextField FTextField;
    private javax.swing.JTextField ITextField;
    private javax.swing.JTextField KxTextField;
    private javax.swing.JTextField LTextField;
    private javax.swing.JTextField MTextField;
    private javax.swing.JComboBox<String> PaintBaseSelection;
    private javax.swing.JTextField PaintColorNameTextField;
    private javax.swing.JTextField PaintColorNumberTextField;
    private javax.swing.JComboBox<String> PaintFinishSelection;
    private javax.swing.JComboBox<String> PaintTypeSelection;
    private javax.swing.JTextField STextField;
    private javax.swing.JTextField TTextField;
    private javax.swing.JComboBox<String> TeriorSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
