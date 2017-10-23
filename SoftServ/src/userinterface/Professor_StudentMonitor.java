package userinterface;

import database.DatabaseInsertException;
import api.UserManagementAPI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fideslinga
 */
public class Professor_StudentMonitor extends javax.swing.JFrame {
    /**
     * Creates new form Professor_StudentMonitor
     */
    public Professor_StudentMonitor() {
        try {
            initComponents();
            updateStudentList();
        } catch (SQLException ex) {
            Logger.getLogger(Professor_StudentMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        labelCurrentStudents = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listStudents = new javax.swing.JList<>();
        fieldNewStudentFirstName = new javax.swing.JTextField();
        labelNewStudentLastName = new javax.swing.JLabel();
        labelNewStudentFirstName = new javax.swing.JLabel();
        fieldNewStudentLastName = new javax.swing.JTextField();
        labelNewStudent = new javax.swing.JLabel();
        buttonAddStudent = new javax.swing.JButton();
        labelNewStudentUtorid = new javax.swing.JLabel();
        fieldNewStudentUTORid = new javax.swing.JTextField();
        labelNewStudentPassword = new javax.swing.JLabel();
        fieldNewStudentPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        navProblemSets = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCurrentStudents.setFont(new java.awt.Font("Menlo", 0, 18)); // NOI18N
        labelCurrentStudents.setText("Current Students");

        listStudents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listStudents, org.jdesktop.beansbinding.ObjectProperty.create(), listStudents, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(listStudents);

        fieldNewStudentFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNewStudentFirstNameActionPerformed(evt);
            }
        });

        labelNewStudentLastName.setText("Last Name");

        labelNewStudentFirstName.setText("Unit Name");

        fieldNewStudentLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNewStudentLastNameActionPerformed(evt);
            }
        });

        labelNewStudent.setFont(new java.awt.Font("Menlo", 0, 18)); // NOI18N
        labelNewStudent.setText("New Unit");

        buttonAddStudent.setText("Add Student");
        buttonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddStudentActionPerformed(evt);
            }
        });

        labelNewStudentUtorid.setText("UTORid");

        fieldNewStudentUTORid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNewStudentUTORidActionPerformed(evt);
            }
        });

        labelNewStudentPassword.setText("Password");

        fieldNewStudentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNewStudentPasswordActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Students");
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        navProblemSets.setBackground(new java.awt.Color(204, 204, 204));
        navProblemSets.setText("ProblemSets");
        navProblemSets.setToolTipText("");
        navProblemSets.setMargin(new java.awt.Insets(0, 0, 0, 0));
        navProblemSets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navProblemSetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelNewStudentUtorid, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNewStudentUTORid))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNewStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNewStudentLastName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNewStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNewStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNewStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNewStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(260, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNewStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonAddStudent))
                            .addComponent(jScrollPane1))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCurrentStudents)
                            .addComponent(navProblemSets, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(navProblemSets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(labelCurrentStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNewStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNewStudentFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNewStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNewStudentLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNewStudentUTORid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNewStudentUtorid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNewStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNewStudentPassword))
                .addGap(48, 48, 48))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void fieldNewStudentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNewStudentFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNewStudentFirstNameActionPerformed
 
    private void buttonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddStudentActionPerformed
        // TODO add your handling code here:
        String newStudentFirstName = fieldNewStudentFirstName.getText();
        String newStudentLastName = fieldNewStudentLastName.getText();
        String newStudentUTORid = fieldNewStudentUTORid.getText();
        String newStudentPassword = fieldNewStudentPassword.getText();
        try {
            UserManagementAPI.insertStudent(newStudentUTORid, newStudentFirstName, newStudentLastName, newStudentPassword);
            updateStudentList();
        } catch (DatabaseInsertException ex) {
            
        } catch (SQLException ex) {
            Logger.getLogger(Professor_StudentMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAddStudentActionPerformed
    
    private void fieldNewStudentLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNewStudentLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNewStudentLastNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void navProblemSetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navProblemSetsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        System.out.println("HELLO");
        new Professor_ProblemSetMonitor().setVisible(true);
    }//GEN-LAST:event_navProblemSetsActionPerformed

    private void fieldNewStudentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNewStudentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNewStudentPasswordActionPerformed

    private void fieldNewStudentUTORidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNewStudentUTORidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNewStudentUTORidActionPerformed
  
    private void problemSets(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
        //this.setVisible(false);
        System.out.println("HELLO");
        JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
        //new Professor_StudentMonitor().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(Professor_StudentMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor_StudentMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor_StudentMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor_StudentMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professor_StudentMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddStudent;
    private javax.swing.JTextField fieldNewStudentFirstName;
    private javax.swing.JTextField fieldNewStudentLastName;
    private javax.swing.JTextField fieldNewStudentPassword;
    private javax.swing.JTextField fieldNewStudentUTORid;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCurrentStudents;
    private javax.swing.JLabel labelNewStudent;
    private javax.swing.JLabel labelNewStudentFirstName;
    private javax.swing.JLabel labelNewStudentLastName;
    private javax.swing.JLabel labelNewStudentPassword;
    private javax.swing.JLabel labelNewStudentUtorid;
    private javax.swing.JList<String> listStudents;
    private javax.swing.JButton navProblemSets;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void updateStudentList() throws SQLException {
        ResultSet newStudents;
        newStudents = UserManagementAPI.getStudents();
        DefaultListModel<String> alistStudents = new DefaultListModel<String>();
    
        while (newStudents.next()) {
            String studentFirstName = newStudents.getString("FIRSTNAME");
            String studentLastName = newStudents.getString("LASTNAME");
            String studentutorID = newStudents.getString("STUDENTID");
            
            String studentInfo = studentFirstName + ", " + studentLastName + ", " + studentutorID;
            /*
            ArrayList studentInfo = new ArrayList<ArrayList>();
            studentInfo.add(studentFirstName);
            studentInfo.add(studentLastName);
            studentInfo.add(studentutorID);
            */

            alistStudents.addElement(studentInfo);
        }
        
        listStudents.setModel(alistStudents);
        
    }
    
}