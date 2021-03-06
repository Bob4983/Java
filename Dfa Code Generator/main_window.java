/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recognizer;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdelrahman
 */
public class main_window extends javax.swing.JFrame {

    public static String base2;
    public static String str = "";
    /**
     * Creates new form main_window
     */
    public main_window() {
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

        states = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        generate = new javax.swing.JButton();
        char_number = new javax.swing.JTextField();
        char_submit = new javax.swing.JButton();
        char_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        accept_states = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        accept_states_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        states.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesActionPerformed(evt);
            }
        });

        label.setText("enter number of states");

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "state"
            }
        ));
        jScrollPane1.setViewportView(table);

        generate.setText("Generate");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        char_submit.setText("Submit");
        char_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                char_submitActionPerformed(evt);
            }
        });

        char_label.setText("enter Language Characters");

        jLabel1.setText("example : a,b,c,d,e,f,g");

        jLabel2.setText("enter accept states");

        accept_states_btn.setText("submit");
        accept_states_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accept_states_btnActionPerformed(evt);
            }
        });

        jLabel3.setText("example : 1,2,3,4,5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submit_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(char_number, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(char_submit))
                                    .addComponent(char_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(accept_states, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(accept_states_btn))
                                    .addComponent(jLabel3))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(char_label)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(char_number, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(char_submit)
                    .addComponent(accept_states, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accept_states_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setNumRows(0);
            String i = states.getText();
            int c = Integer.parseInt(i);
            int index = 1;
            while (c > 0) {
                model.addRow(new Object[]{index});
                c--;
                index++;
            }
            label.setText("Enter number of states");
        } catch (Exception e) {
            label.setText("Empty Field");
        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
            File myCode = new File("yourcode.txt");

            if (myCode.createNewFile()) {
                System.out.println("File created: " + myCode.getName());
            } else {
                System.out.println("File already exists.");
            }

            int state = Integer.parseInt(states.getText());
            String base1 = "import java.util.Scanner;\n"
                    + "\n\n"
                    + "public class yourcode{"
                    + "\n"
                    + "\t public static void main(String[]args){"
                    + "\n"
                    + "\t\tScanner s = new Scanner(System.in);"
                    + "\n"
                    + "\n"
                    + "\t\tSystem.out.println(\"Enter input token : \");"
                    + "\n"
                    + "\t\tString token = s.next();"
                    + "\t\tint state = 1;"
                    + "\n"
                    + "\t\tint i =0;"
                    + "\n"
                    + "\t\twhile(i< token.length()){"
                    + "\n"
                    + "\t\t\tchar ch = token.charAt(i);"
                    + "\n";
            base2 = "\n"
                    + "\t\ti+=1;"
                    + "\n"
                    + "\t\t}"
                    + "\n"
                    + "\t\tif(%s){"
                    + "\n"
                    + "\t\tSystem.out.println(true);"
                    + "\n"
                    + "\t\t}else "
                    + "\n"
                    + "\t\tSystem.out.println(false);"
                    + "\n"
                    + "\t\t}"
                    + "\n"
                    + "}";
            
            try {
                FileWriter myWriter = new FileWriter("yourcode.txt");
                myWriter.write(base1);
                myWriter.write("\t\t\tswitch(state){\n");
                String lang_char = char_number.getText();
                String[] arrOfChar = lang_char.split(",");
                for (int i = 0; i != state; i++) {
                    myWriter.write("\t\t\t\tcase "+(i+1)+" :"
                            + "\n");
                    myWriter.write("\t\t\t\t\tswitch(ch){"
                            + "\n");
                    for (int c = 1; c <= arrOfChar.length; c++) {
                        //myWriter.write(String.format("\t\t\t\t\tif(ch == \'%s\'){state=%s;}\n",table.getColumnName(c),table.getValueAt(i, c)));
                        myWriter.write(String.format("\t\t\t\t\t\tcase \'%s\' : "
                                + "\n",table.getColumnName(c)));
                        myWriter.write(String.format("\t\t\t\t\t\t\tstate = %s;"
                                + "\n"
                                +"\t\t\t\t\t\t\tbreak;"
                                + "\n",table.getValueAt(i, c)));
                        
                    }
                    myWriter.write("\t\t\t\t\t}\n");
                    myWriter.write("\t\t\t\t\tbreak;\n");
                }
                myWriter.write("\t\t\t}");
                myWriter.write(String.format(base2,str));
                myWriter.close();
                File Code_rename = new File("yourcode.java");
                myCode.renameTo(Code_rename);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An error occurred while creating file.");
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Successfully wrote to the file.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while writing to file.");
            e.printStackTrace();
        }

        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"javac yourcode.java && java yourcode\"");
        } catch (IOException ex) {
            Logger.getLogger(main_window.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_generateActionPerformed

    private void statesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statesActionPerformed

    private void char_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_char_submitActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String lang_char = char_number.getText();
            String column_name = "";
            model.setColumnCount(0);
            model.addColumn("state");
            String[] arrOfChar = lang_char.split(",");
            for (String i : arrOfChar) {
                model.addColumn(i);
            }
            char_label.setText("Enter number of states");
        } catch (Exception e) {
            char_label.setText("Empty Field");
        }
    }//GEN-LAST:event_char_submitActionPerformed

    private void accept_states_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accept_states_btnActionPerformed
        String accept_state = accept_states.getText();
        String[] arrOfAccept = accept_state.split(",");
        System.out.println(accept_state);
        String string = "state == %s ";
        int c = 1;
        for (String i : arrOfAccept) {
            str = str + String.format(string, i) ;
            if (c<arrOfAccept.length){str = str + "|| ";c++;}
        }
        System.out.println(str);
    }//GEN-LAST:event_accept_states_btnActionPerformed

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
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accept_states;
    private javax.swing.JButton accept_states_btn;
    private javax.swing.JLabel char_label;
    private javax.swing.JTextField char_number;
    private javax.swing.JButton char_submit;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private static javax.swing.JTextField states;
    private javax.swing.JButton submit_btn;
    private static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
