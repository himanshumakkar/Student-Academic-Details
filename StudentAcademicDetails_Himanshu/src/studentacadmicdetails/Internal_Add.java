/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentacadmicdetails;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu Makkar
 */
public class Internal_Add extends javax.swing.JFrame {

    /**
     * Creates new form Internal_Add
     */
    public Internal_Add() {
        initComponents();
        fill();
    }
    int internal=0;
    int enrol=0;
    TreeMap<String, Integer> course=new TreeMap<>();
    TreeMap<String, Integer> semester=new TreeMap<>();
    TreeMap<String, Integer> session=new TreeMap<>();
    TreeMap<String, Integer> branch=new TreeMap<>();
    TreeMap<String, Integer> month=new TreeMap<>();
    TreeMap<String, Integer> subject=new TreeMap<>();
void fill()
{
    
        jLabel16.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel14.setVisible(false);
        jLabel22.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jButton3.setEnabled(false);
        
                
    {
    try
        {
            int a;
            String s;
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
            jComboBox3.removeAllItems();
            jComboBox4.removeAllItems();
            jComboBox5.removeAllItems();
            String query="select * from course";
            ResultSet rs=dbaccess.selectquery(query, new Object[0]);
            while(rs.next())
            {
                a=rs.getInt(1);
                s=rs.getString(2);
                course.put(s, a);
                jComboBox2.addItem(s);
            }
            
            query="select * from semester";
            rs=dbaccess.selectquery(query, new Object[0]);
            
            while(rs.next())
            {
                a=rs.getInt(1);
                s=rs.getString(2);
                semester.put(s, a);
                jComboBox4.addItem(s);
            }
            query="select * from session";
            rs=dbaccess.selectquery(query, new Object[0]);
            while(rs.next())
            {
                a=rs.getInt(1);
                s=rs.getString(2);
                session.put(s,a);
                jComboBox1.addItem(s);
            }
            
            
                   
            
            
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentacadmicdetails/college_view.JPG"))); // NOI18N

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBox2.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBox4.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("H.C.T.M Technical Campus");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Session :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Course :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Branch :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText(" Semester :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Subject :");

        jComboBox5.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Roll Number :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Assingment :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sessional :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Evaluvated Internals :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Attendance  :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("%");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("%");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("%");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("/ 50");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Fetch Record");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Allot Internals");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator2);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Delete Record");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Status :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("jLabel22");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel15)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel21)
                .addGap(26, 26, 26)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try
        {
            branch.clear();
            if(jComboBox2.getSelectedItem()==null)
            {
                return;
            }
            String query="select * from branch where courseid=?";
            Object ob[]=new Object[1];
            ob[0]=course.get(jComboBox2.getSelectedItem());
            ResultSet rs=dbaccess.selectquery(query, ob);
            jComboBox3.removeAllItems();
            while(rs.next())
            {
                int a=rs.getInt(1);
                String s=rs.getString(2);
                branch.put(s, a);
                jComboBox3.addItem(s);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new menu_user().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        try
        {
            if(jComboBox1.getSelectedItem()==null)
            {
                return;
            }
            if(jComboBox4.getSelectedItem()==null)
            {
                return;
            }
            if(jComboBox3.getSelectedItem()==null)
            {
                return;
            }

            jComboBox5.removeAllItems();
            subject.clear();
            String query="select * from subjects where subid in (select subid from syllabus where semid=? and sessionid=? and branchid=?)";
            Object ob[]=new Object[3];
            ob[0]=semester.get(jComboBox4.getSelectedItem());
            ob[1]=session.get(jComboBox1.getSelectedItem());
            ob[2]=branch.get(jComboBox3.getSelectedItem());
            ResultSet rs=dbaccess.selectquery(query, ob);

            while(rs.next())
            {
                int a=rs.getInt(1);
                String s=rs.getString(2);
                subject.put(s, a);
                jComboBox5.addItem(s);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jLabel16.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel14.setVisible(true);
        jLabel22.setVisible(true);
        jLabel15.setVisible(true);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel7.setVisible(true);
        jLabel10.setVisible(true);
        jLabel13.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jButton3.setEnabled(true);
        if(jComboBox5.getSelectedItem()==null||jTextField1.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(null,"Fill All details");
                    jLabel16.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel14.setVisible(false);
        jLabel22.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
jButton3.setEnabled(false);
            return;
        }
        String query="{call check_internals(?,?,?)}";
        Object ob[]=new Object[3];
        ob[0]=jTextField1.getText();
        ob[1]=jComboBox4.getSelectedItem();
        ob[2]=subject.get(jComboBox5.getSelectedItem());
        ResultSet rs=dbaccess.selectquery(query, ob);
        
        try
        {
            if(rs.next())
        {
            jLabel22.setForeground(Color.green);
            jLabel22.setText("Allotted");
        }
            else
            {
                    jLabel22.setForeground(Color.red);
                    jLabel22.setText("Not Allotted");
        
            }        
            query="{call get_enrollid(?,?)}";
            ob=new Object[2];
            ob[0]=jTextField1.getText();
            ob[1]=jComboBox4.getSelectedItem();
             rs=dbaccess.selectquery(query, ob);
            if(rs.next())
            {
                enrol=rs.getInt(1);
                query="select totalpercentage from attendance where enrollstudentid=? and subid=?";
                ob=new Object[2];
                ob[0]=enrol;
                ob[1]=subject.get(jComboBox5.getSelectedItem());
                rs=dbaccess.selectquery(query, ob);
                int i=0,totalper=0;
                while(rs.next())
                {
                    totalper+=rs.getInt(1);
                    i++;
                }
                if(i!=0)
                {
                    totalper=totalper/i;
                    jLabel16.setText(String.valueOf(totalper));
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Attendance not Available");
                jLabel16.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel14.setVisible(false);
        jLabel22.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
jButton3.setEnabled(false);
                }
                query="select marks from sessionalMarks where enrollstudentid=? and subid=?";
                ob=new Object[2];
                ob[0]=enrol;
                ob[1]=subject.get(jComboBox5.getSelectedItem());
                rs=dbaccess.selectquery(query, ob);
                i=0;totalper=0;
                while(rs.next())
                {
                    totalper+=rs.getInt(1);
                    i++;
                }
                if(i!=0)
                {
                    i=40*i;
                    totalper=(totalper*100)/i;
                    jLabel12.setText(String.valueOf(totalper));
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sessional Marks not Available");
                jLabel16.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel14.setVisible(false);
        jLabel22.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
jButton3.setEnabled(false);
                }
                query="select marks from assingmentMarks where enrollstudentid=? and assingmentid in (select assingmentid from assingment where subid=?)";
                ob=new Object[2];
                ob[0]=enrol;
                ob[1]=subject.get(jComboBox5.getSelectedItem());
                rs=dbaccess.selectquery(query, ob);
                i=0;totalper=0;
                while(rs.next())
                {
                    totalper+=rs.getInt(1);
                    i++;
                }
                if(i!=0)
                {
                    i=10*i;
                    totalper=(totalper*100)/i;
                    jLabel11.setText(String.valueOf(totalper));
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Assingment Marks not Available");
                jLabel16.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel14.setVisible(false);
        jLabel22.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
jButton3.setEnabled(false);
                }
                
    int att=      Integer.parseInt(jLabel16.getText());
    int assi=        Integer.parseInt(jLabel11.getText());
    int sess=        Integer.parseInt(jLabel12.getText());
    internal=((att*20)/100)+((assi*10)/100)+((sess*20)/100);
    jButton3.setEnabled(true);
       
    jLabel14.setText(String.valueOf(internal));
                    
            }
            else
            {
                JOptionPane.showMessageDialog(null,"invalid details");
                jLabel16.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel14.setVisible(false);
        jLabel22.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
            jButton3.setEnabled(false);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{
    String Query="insert into internal values(?,?,?)";
    Object ob[]=new Object[3];
    ob[0]=enrol;
    ob[1]=subject.get(jComboBox5.getSelectedItem());
    ob[2]=internal;
    if(dbaccess.updatequery(Query, ob))
    {
        JOptionPane.showMessageDialog(null,"Alloted succesfully");
        jButton1ActionPerformed(evt);
        
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Try Again");
    }
   
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null, ex);
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jLabel22.isVisible())
        {
            try
            {
                String query="delete from internal where enrollstudentid=? and subid=?";
                Object ob[]=new Object[2];
                ob[0]=enrol;
                ob[1]=subject.get(jComboBox5.getSelectedItem());
                if(dbaccess.updatequery(query, ob))
                {
                    JOptionPane.showMessageDialog(null,"Record Deleted");
                    jButton1ActionPerformed(evt);
                    
                }
                else
                    JOptionPane.showMessageDialog(null, "Try Again");
            }
            catch(Exception ex)
            {
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Failed. First fetch before deletion");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Internal_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internal_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internal_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internal_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internal_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}