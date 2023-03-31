/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin_View;

import Model.Person;
import Model.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JINESH
 */

public class adminOnePage extends javax.swing.JPanel {

    /**
     * Creates new form adminOnePage
     */
    JPanel bottomPanel; 
    PersonDirectory persons;
    private Person selectedPerson;
    public adminOnePage(JPanel bottomPanel, PersonDirectory person) {
        initComponents();
         this.bottomPanel=bottomPanel;
        this.persons=persons;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        adminViewLabel = new javax.swing.JLabel();
        addCommunityDetailsLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        districtLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        provinceLabel = new javax.swing.JLabel();
        pincodeLabel = new javax.swing.JLabel();
        locationField = new javax.swing.JTextField();
        districtField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        provinceField = new javax.swing.JTextField();
        pincodeField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        viewCommunityDetailsLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        locationLabel1 = new javax.swing.JLabel();
        districtLabel1 = new javax.swing.JLabel();
        cityLabel1 = new javax.swing.JLabel();
        provinceLabel1 = new javax.swing.JLabel();
        pincodeLabel1 = new javax.swing.JLabel();
        locationField1 = new javax.swing.JTextField();
        districtField1 = new javax.swing.JTextField();
        cityField1 = new javax.swing.JTextField();
        provinceField1 = new javax.swing.JTextField();
        pincodeField1 = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        adminViewLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminViewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminViewLabel.setText("Admin View");
        adminViewLabel.setToolTipText("");

        addCommunityDetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addCommunityDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCommunityDetailsLabel.setText("Add Community Details");

        locationLabel.setText("Location ");

        districtLabel.setText("District");

        cityLabel.setText("City");

        provinceLabel.setText("Province");

        pincodeLabel.setText("Pincode");

        locationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        viewCommunityDetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewCommunityDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCommunityDetailsLabel.setText("View Community Details");

        searchLabel.setText("Search");

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        locationLabel1.setText("Location ");

        districtLabel1.setText("District");

        cityLabel1.setText("City");

        provinceLabel1.setText("Province");

        pincodeLabel1.setText("Pincode");

        locationField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationField1ActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Location", "District", "City", "Province", "Pincode"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(viewCommunityDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(updateButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pincodeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(locationLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cityLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(districtLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(provinceLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locationField1)
                                    .addComponent(districtField1)
                                    .addComponent(cityField1)
                                    .addComponent(provinceField1)
                                    .addComponent(pincodeField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addCommunityDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pincodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(districtLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(provinceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveButton)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(districtField)
                                    .addComponent(cityField)
                                    .addComponent(provinceField)
                                    .addComponent(pincodeField)
                                    .addComponent(locationField)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(adminViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(viewButton)
                        .addGap(436, 436, 436)
                        .addComponent(deleteButton)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCommunityDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(districtLabel)
                    .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provinceLabel)
                    .addComponent(provinceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pincodeLabel)
                    .addComponent(pincodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(saveButton)
                .addGap(38, 38, 38)
                .addComponent(viewCommunityDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel1)
                    .addComponent(locationField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(districtLabel1)
                    .addComponent(districtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provinceLabel1)
                    .addComponent(provinceField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pincodeLabel1)
                    .addComponent(pincodeField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
          Person newPerson = new Person();
        try {
             
              newPerson.setLocation(locationField.getText());
              newPerson.setDistrict(districtField.getText());
              newPerson.setCity(cityField.getText());
              newPerson.setProvince(provinceField.getText());
              newPerson.setPincode(pincodeField.getText());
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"please enter correct details");
            
        }
        
        persons.addPerson(newPerson);
        System.out.println(persons);
        JOptionPane.showMessageDialog(this,"User saved successfully");
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void locationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationFieldActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
          int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            Person selectedPerson = (Person) model.getValueAt(selectedIndex, 0);
            locationField.setText(selectedPerson.getLocation());
            districtField.setText(selectedPerson.getDistrict());
            cityField.setText(selectedPerson.getCity());
            provinceField.setText(selectedPerson.getProvince());
            pincodeField.setText(selectedPerson.getPincode());
            
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void locationField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationField1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
                Person selectedPerson;
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be updated", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            selectedPerson = (Person) model.getValueAt(selectedIndex, 0);
            selectedPerson.setLocation(locationField1.getText());
            selectedPerson.setDistrict(districtField1.getText());
            selectedPerson.setCity(cityField1.getText());
            selectedPerson.setProvince(provinceField1.getText());
            selectedPerson.setPincode(pincodeField1.getText());
            JOptionPane.showMessageDialog(this, "User updated successfully", "Success", HEIGHT);
            populateTable();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            Person selectedPerson = (Person) model.getValueAt(selectedIndex, 0);
            persons.removePerson(selectedPerson);
            JOptionPane.showMessageDialog(this, "Employee Information is deleted successfully.");
            populateTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCommunityDetailsLabel;
    private javax.swing.JLabel adminViewLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField cityField1;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityLabel1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField districtField;
    private javax.swing.JTextField districtField1;
    private javax.swing.JLabel districtLabel;
    private javax.swing.JLabel districtLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField locationField;
    private javax.swing.JTextField locationField1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel locationLabel1;
    private javax.swing.JTextField pincodeField;
    private javax.swing.JTextField pincodeField1;
    private javax.swing.JLabel pincodeLabel;
    private javax.swing.JLabel pincodeLabel1;
    private javax.swing.JTextField provinceField;
    private javax.swing.JTextField provinceField1;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JLabel provinceLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userTable;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel viewCommunityDetailsLabel;
    // End of variables declaration//GEN-END:variables

  public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        for(Person u: persons.getAllPerson()){
            Object[] row= new Object[5]; 
            
            row[0] = u.getLocation();
            row[0] = u;
            row[1] = u.getDistrict();
            row[2] = u.getCity();
            row[3] = u.getProvince();
            row[4] = u.getPincode();
            model.addRow(row);
        }
        clearFields();
    }

    public void clearFields() {
        
        locationField1.setText("");
        districtField1.setText("");
        cityField1.setText("");
        provinceField1.setText("");
        pincodeField1.setText("");
        
    }

}