/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.util.ArrayList;

/**
 *
 * @author yunus
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static int counter =0;
    static int totalPrim =0;
    static ArrayList<String> titles = new ArrayList<>();
    static ArrayList<Integer> prices = new ArrayList<>();
    
    public NewJFrame() {
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        calculateButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        vehicleTitle = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InsuranceTotal = new javax.swing.JLabel();
        primValue = new javax.swing.JLabel();
        NumberofVehicles = new javax.swing.JLabel();
        showCurrentButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title");

        jLabel2.setText("Vehicle Age");

        jRadioButton1.setText("< 15");

        jRadioButton2.setText(">= 15");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        vehicleTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hyundai", "BMW", "Mercedes", "Toyota", "Renault", "Ferrari", "Ford", "Opel", "Skoda" }));
        vehicleTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleTitleActionPerformed(evt);
            }
        });

        jLabel3.setText("Insurance Premium Total");

        jLabel4.setText("Insurance Premium");

        jLabel5.setText("Number of Insured Vehicles");

        InsuranceTotal.setText("0");

        primValue.setText("0");

        NumberofVehicles.setText("0");

        showCurrentButton.setText("Show Current Bill");
        showCurrentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCurrentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(primValue)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InsuranceTotal)
                        .addGap(272, 272, 272)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumberofVehicles)
                    .addComponent(showCurrentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(vehicleTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showCurrentButton)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsuranceTotal)
                    .addComponent(primValue)
                    .addComponent(NumberofVehicles))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehicleTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleTitleActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        if(jRadioButton1.isSelected() && jRadioButton2.isSelected()){
            System.out.println("Please select only one age attribute to continue.");
            return;
        }
        
        if(!jRadioButton1.isSelected() && !jRadioButton2.isSelected()){
            System.out.println("No age attribute has been chosen. Please choose an age attribute to continue.");
            return;
        }
        
        //Hyundai
        if (vehicleTitle.getSelectedIndex() == 0 && jRadioButton1.isSelected()) {
            primValue.setText("250");
            ;
        }
        if (vehicleTitle.getSelectedIndex() == 0 && jRadioButton2.isSelected()) {
            primValue.setText("450");
            ;
        }
        
        //BMW
        if (vehicleTitle.getSelectedIndex() == 1 && jRadioButton1.isSelected()) {
            primValue.setText("650");
            }     
        
        if (vehicleTitle.getSelectedIndex() == 1 && jRadioButton2.isSelected()) {
            primValue.setText("750");
            }      
        
        //Mercedes
        if (vehicleTitle.getSelectedIndex() == 2 && jRadioButton1.isSelected()) {
            primValue.setText("550");
        }
        if (vehicleTitle.getSelectedIndex() == 2 && jRadioButton2.isSelected()) {
            primValue.setText("700");
        }
        
        
        //Toyota
        if (vehicleTitle.getSelectedIndex() == 3 && jRadioButton1.isSelected()) {
            primValue.setText("400");
        }
        if (vehicleTitle.getSelectedIndex() == 3 && jRadioButton2.isSelected()) {
            primValue.setText("450");
        }
        
        
        //Reanult
        if (vehicleTitle.getSelectedIndex() == 4 && jRadioButton1.isSelected()) {
            primValue.setText("150");
        }
        if (vehicleTitle.getSelectedIndex() == 4 && jRadioButton2.isSelected()) {
            primValue.setText("250");
        }
        
        
        //Ferrari
        if (vehicleTitle.getSelectedIndex() == 5 && jRadioButton1.isSelected()) {
            primValue.setText("850");
        }
        if (vehicleTitle.getSelectedIndex() == 5 && jRadioButton2.isSelected()) {
            primValue.setText("1000");
        }
        
        
        //Ford
        if (vehicleTitle.getSelectedIndex() == 6 && jRadioButton1.isSelected()) {
            primValue.setText("550");
        }
        if (vehicleTitle.getSelectedIndex() == 6 && jRadioButton2.isSelected()) {
            primValue.setText("750");
        }
        
        
        //Opel
        if (vehicleTitle.getSelectedIndex() == 7 && jRadioButton1.isSelected()) {
            primValue.setText("150");
        titles.add(vehicleTitle.getSelectedItem().toString());
            prices.add(Integer.valueOf(primValue.getText()));}
        if (vehicleTitle.getSelectedIndex() == 7 && jRadioButton2.isSelected()) {
            primValue.setText("250");
       }
        
        //Skoda
        if (vehicleTitle.getSelectedIndex() == 8 && jRadioButton1.isSelected()) {
            primValue.setText("600");
        }
        if (vehicleTitle.getSelectedIndex() == 8 && jRadioButton2.isSelected()) {
            primValue.setText("700");
       }

    }//GEN-LAST:event_calculateButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
            if(Integer.valueOf(primValue.getText())== 0){
                System.out.println("You must calculate first!");
                return;
            }
            counter +=1;           
            NumberofVehicles.setText(Integer.toString(counter));                     
            totalPrim += (int)Integer.valueOf(primValue.getText());           
            InsuranceTotal.setText(Integer.toString(totalPrim));
            titles.add(vehicleTitle.getSelectedItem().toString());
            prices.add(Integer.valueOf(primValue.getText()));
            primValue.setText("0");
    }//GEN-LAST:event_nextButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.err.println("GoodBye!!!");
        showCurrentButtonActionPerformed(evt);
        //System.out.println("Insurance Premium Total = " + InsuranceTotal.getText());
        System.out.println("Number of Vehicles Insured = " + counter);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void showCurrentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCurrentButtonActionPerformed
         if(titles.isEmpty()){
                System.out.println("You haven't add any vehicle yet!");
                return;                            
            }
        for(int i =0;i<prices.size();i++){
           
            System.out.println(titles.get(i) + " -----> " + prices.get(i));
        }
        
        
        System.out.println("Total -----> " + InsuranceTotal.getText());
        System.out.println("\n --------------------------------------------------------------------------------------------");
    }//GEN-LAST:event_showCurrentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InsuranceTotal;
    private javax.swing.JLabel NumberofVehicles;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel primValue;
    private javax.swing.JButton showCurrentButton;
    private javax.swing.JComboBox vehicleTitle;
    // End of variables declaration//GEN-END:variables
}
