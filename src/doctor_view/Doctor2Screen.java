/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package doctor_view;

//import Model.User;
//import Model.UserDirectory;
import Model.Doctor;
import Model.DoctorDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeyarajjeyakumar
 */
public class Doctor2Screen extends javax.swing.JPanel {

    /**
     * Creates new form viewPanel
     */
    JPanel bottomPanel; 
    DoctorDirectory doctors;
    private Doctor selectedDoctor;
    public Doctor2Screen(JPanel bottomPanel, DoctorDirectory doctors) {
        initComponents();
        this.bottomPanel = bottomPanel; 
        this.doctors = doctors;
        poplutateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        illnessField = new javax.swing.JTextField();
        BPLabel = new javax.swing.JLabel();
        prescriptionField = new javax.swing.JTextField();
        heartlabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        bloodLabel = new javax.swing.JLabel();
        illnessLabel = new javax.swing.JLabel();
        prescriptionLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        bpField = new javax.swing.JTextField();
        heartField = new javax.swing.JTextField();
        bloodField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Previous Record");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "patient ID", "Age", "Gender", "Doctor", "BP", "Heart Rate", "Blood Sugar", "Illness", "Prescription"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        BPLabel.setText("BP");

        heartlabel.setText("Heart Rate");

        bloodLabel.setText("Blood Sugar");

        illnessLabel.setText("Illness");

        prescriptionLabel.setText("Prescription");

        mailLabel.setText("Search");

        bpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpFieldActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Encounter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(337, 337, 337))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(heartlabel)
                                        .addComponent(prescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(illnessLabel)
                                    .addComponent(BPLabel)
                                    .addComponent(bloodLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloodField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bpField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heartField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(illnessField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addGap(207, 207, 207)
                                .addComponent(viewButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mailLabel)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(viewButton))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPLabel)
                    .addComponent(bpField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heartlabel)
                    .addComponent(heartField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodLabel)
                    .addComponent(bloodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(illnessLabel)
                    .addComponent(illnessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prescriptionLabel)
                    .addComponent(prescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addGap(262, 262, 262))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            Doctor selectedDoctor = (Doctor) model.getValueAt(selectedIndex, 0);
            doctors.removeDoctor(selectedDoctor);
            JOptionPane.showMessageDialog(this, "User Information is deleted successfully.");
            poplutateTable();
    }//GEN-LAST:event_deleteButtonActionPerformed
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
         Doctor selectedUser;
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be updated", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            //selectedDoctor = (Doctor) model.getValueAt(selectedIndex, 0);
            //selectedDoctor.setAge(Integer.parseInt(bloodField.getText()));
            //selectedDoctor.setPatientID(Integer.parseInt(PatientField.getText()));
            //selectedDoctor.setName(bpField.getText());
            //selectedDoctor.setPhoneNumber((prescriptionField.getText()));
            //selectedDoctor.setGender(illnessField.getText());
            //selectedDoctor.setdoctorName(DoctorField.getText());
            selectedDoctor.setBP(bpField.getText());
            selectedDoctor.setHeartRate(heartField.getText());
            selectedDoctor.setBloodSugar(bloodField.getText());
            selectedDoctor.setIllness(illnessField.getText());
            selectedDoctor.setPrescription(prescriptionField.getText());
            
            JOptionPane.showMessageDialog(this, "User updated successfully", "Success", HEIGHT);
            poplutateTable();
    }//GEN-LAST:event_updateButtonActionPerformed
    }    
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            Doctor selectedUser = (Doctor) model.getValueAt(selectedIndex, 0);
            bpField.setText(selectedUser.getBP());
            bloodField.setText(String.valueOf(selectedUser.getBloodSugar()));
            heartField.setText(String.valueOf(selectedUser.getHeartRate()));
            illnessField.setText(selectedUser.getIllness());
            prescriptionField.setText(selectedUser.getPrescription());
            //doctorField.setText(selectedUser.getDoctorName());
            
    }//GEN-LAST:event_viewButtonActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabel;
    private javax.swing.JTextField bloodField;
    private javax.swing.JLabel bloodLabel;
    private javax.swing.JTextField bpField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField heartField;
    private javax.swing.JLabel heartlabel;
    private javax.swing.JTextField illnessField;
    private javax.swing.JLabel illnessLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField prescriptionField;
    private javax.swing.JLabel prescriptionLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userTable;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void poplutateTable() {
         DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        for (Doctor u : doctors.getAllDoctor()) {
            Object[] row = new Object[11];
            row[0] = u.getName();
            row[0] = u;
            row[1] = u.getPatientID();
            row[2] = u.getAge();
            row[3] = u.getGender();
            row[4] = u.getPhoneNumber();
            row[5] = u.getDoctorName();
            row[6] = u.getBP();
            row[7] = u.getBloodSugar();
            row[8] = u.getHeartRate();
            row[9] = u.getIllness();
            row[10] = u.getPrescription();
            model.addRow(row);
        }
        clearFields();
    }

    private void clearFields() {
        bpField.setText("");
        bloodField.setText("");
        heartField.setText("");
        illnessField.setText("");
        prescriptionField.setText("");
        emailField.setText("");
        
    }

}

    
