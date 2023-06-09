/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package doctor_view;


import Model.Doctor;
import Model.DoctorDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jeyarajjeyakumar
 */
public class Doctor1Screen extends javax.swing.JPanel {

    /**
     *
     * @param bottomPanel
     * @param doctors
     */
    /**
     * Creates new form Doctor1Screen
     */
    JPanel bottomPanel;
    DoctorDirectory doctors;
    
    public Doctor1Screen(JPanel bottomPanel,DoctorDirectory doctors) {
        initComponents();
        this.bottomPanel=bottomPanel;
        this.doctors= doctors;
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
        nameLabel = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        patientField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        doctorField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        oldPatient = new javax.swing.JButton();
        illnessField = new javax.swing.JTextField();
        BPLabel = new javax.swing.JLabel();
        prescriptionField = new javax.swing.JTextField();
        heartlabel = new javax.swing.JLabel();
        bloodLabel = new javax.swing.JLabel();
        illnessLabel = new javax.swing.JLabel();
        prescriptionLabel = new javax.swing.JLabel();
        bpField = new javax.swing.JTextField();
        heartField = new javax.swing.JTextField();
        bloodField = new javax.swing.JTextField();

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Enter Patient Details");
        titleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nameLabel.setText("Full Name");

        patientLabel.setText("Patient ID");

        ageLabel.setText("Age");

        genderLabel.setText("Gender");

        numberLabel.setText("Phone Number");

        doctorLabel.setText("Doctor Name");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save New Patient");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        oldPatient.setText("Old Patient");
        oldPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPatientActionPerformed(evt);
            }
        });

        BPLabel.setText("BP");

        heartlabel.setText("Heart Rate");

        bloodLabel.setText("Blood Sugar");

        illnessLabel.setText("Illness");

        prescriptionLabel.setText("Prescription");

        bpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oldPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(heartlabel)
                                        .addComponent(prescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(illnessLabel)
                                    .addComponent(BPLabel)
                                    .addComponent(bloodLabel))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(illnessField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bloodField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(heartField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bpField)
                                    .addComponent(prescriptionField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(patientLabel)
                                        .addComponent(doctorLabel)
                                        .addComponent(numberLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(genderLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(ageLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(doctorField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneNumberField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(patientField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(genderField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientLabel)
                    .addComponent(patientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLabel)
                    .addComponent(doctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Doctor newDoctor = new Doctor();
        try{
            
        newDoctor.setName(nameField.getText());
        newDoctor.setPatientID(Integer.parseInt(patientField.getText()));
        newDoctor.setAge(Integer.parseInt(ageField.getText()));
        newDoctor.setGender(genderField.getText());
        newDoctor.setPhoneNumber(phoneNumberField.getText());
        newDoctor.setDoctorName(doctorField.getText());
        newDoctor.setBP((bpField.getText()));
        newDoctor.setBloodSugar((bloodField.getText()));
        newDoctor.setHeartRate((heartField.getText()));
        newDoctor.setIllness(illnessField.getText());
        newDoctor.setPrescription(prescriptionField.getText());
        
        }
        
       
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Please enter correct details", "Error", HEIGHT);
        }
        doctors.addDoctor(newDoctor);
        //System.out.println(doctors);
        JOptionPane.showMessageDialog(this, "User saved successfully", "Success", HEIGHT);

    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void oldPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPatientActionPerformed
        // TODO add your handling code here:
       // Doctor2Screen Doctor2Screen = new Doctor2Screen(bottomPanel, doctors);
        //bottomPanel.add("doctor2screen",Doctor2Screen);
        //CardLayout layout = (CardLayout) bottomPanel.getLayout();
        //layout.next(bottomPanel);
        Doctor2Screen viewPanel = new Doctor2Screen(bottomPanel,doctors);
        bottomPanel.add("viewScreen", viewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_oldPatientActionPerformed

    private void bpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField bloodField;
    private javax.swing.JLabel bloodLabel;
    private javax.swing.JTextField bpField;
    private javax.swing.JTextField doctorField;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField heartField;
    private javax.swing.JLabel heartlabel;
    private javax.swing.JTextField illnessField;
    private javax.swing.JLabel illnessLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JButton oldPatient;
    private javax.swing.JTextField patientField;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField prescriptionField;
    private javax.swing.JLabel prescriptionLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
    }



