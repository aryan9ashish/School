/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainPage.java
 *
 * Created on Sep 28, 2015, 5:32:47 PM
 */

package school;

import java.awt.Color;

/**
 *
 * @author abc
 */
public class MainPage extends javax.swing.JFrame {

     String Grade;
    /** Creates new form MainPage */
    public MainPage() {
        initComponents();
       
       // MainPage m =new MainPage();
       // m.setBackground(Color.RED);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        S_Add = new javax.swing.JMenuItem();
        S_Update = new javax.swing.JMenuItem();
        S_Search = new javax.swing.JMenuItem();
        S_Del = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        T_Add = new javax.swing.JMenuItem();
        T_Update = new javax.swing.JMenuItem();
        T_Search = new javax.swing.JMenuItem();
        T_Del = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        LKG = new javax.swing.JMenuItem();
        UKG = new javax.swing.JMenuItem();
        First = new javax.swing.JMenuItem();
        Second = new javax.swing.JMenuItem();
        Third = new javax.swing.JMenuItem();
        Fourth = new javax.swing.JMenuItem();
        Fifth = new javax.swing.JMenuItem();
        Sixth = new javax.swing.JMenuItem();
        Seventh = new javax.swing.JMenuItem();
        Eighth = new javax.swing.JMenuItem();
        Nineth = new javax.swing.JMenuItem();
        Tenth = new javax.swing.JMenuItem();
        Eleven_S = new javax.swing.JMenuItem();
        Eleven_C = new javax.swing.JMenuItem();
        Twelfth_S = new javax.swing.JMenuItem();
        Twelfth_C = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        F_Update = new javax.swing.JMenuItem();
        F_Deposited = new javax.swing.JMenuItem();
        F_Remaining = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");
        setAlwaysOnTop(true);
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/school/Capture.PNG")))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Welcome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 220, 270, 50);

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(460, 290, 130, 23);
        jPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(260, 100, 0, 0);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jMenu1.setText("Student");

        S_Add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        S_Add.setText("Add");
        S_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_AddActionPerformed(evt);
            }
        });
        jMenu1.add(S_Add);

        S_Update.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        S_Update.setText("Update");
        S_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_UpdateActionPerformed(evt);
            }
        });
        jMenu1.add(S_Update);

        S_Search.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        S_Search.setText("Search");
        S_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_SearchActionPerformed(evt);
            }
        });
        jMenu1.add(S_Search);

        S_Del.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        S_Del.setText("Delete");
        S_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_DelActionPerformed(evt);
            }
        });
        jMenu1.add(S_Del);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Teachers Detail");

        T_Add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        T_Add.setText("Add");
        T_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_AddActionPerformed(evt);
            }
        });
        jMenu2.add(T_Add);

        T_Update.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        T_Update.setText("Update");
        T_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_UpdateActionPerformed(evt);
            }
        });
        jMenu2.add(T_Update);

        T_Search.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        T_Search.setText("Search");
        T_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_SearchActionPerformed(evt);
            }
        });
        jMenu2.add(T_Search);

        T_Del.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        T_Del.setText("Delete");
        T_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_DelActionPerformed(evt);
            }
        });
        jMenu2.add(T_Del);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Class");

        LKG.setText("L.K.G");
        LKG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LKGActionPerformed(evt);
            }
        });
        jMenu3.add(LKG);

        UKG.setText("U.K.G");
        UKG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UKGActionPerformed(evt);
            }
        });
        jMenu3.add(UKG);

        First.setText("1");
        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });
        jMenu3.add(First);

        Second.setText("2");
        Second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondActionPerformed(evt);
            }
        });
        jMenu3.add(Second);

        Third.setText("3");
        Third.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdActionPerformed(evt);
            }
        });
        jMenu3.add(Third);

        Fourth.setText("4");
        Fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthActionPerformed(evt);
            }
        });
        jMenu3.add(Fourth);

        Fifth.setText("5");
        Fifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifthActionPerformed(evt);
            }
        });
        jMenu3.add(Fifth);

        Sixth.setText("6");
        Sixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixthActionPerformed(evt);
            }
        });
        jMenu3.add(Sixth);

        Seventh.setText("7");
        Seventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeventhActionPerformed(evt);
            }
        });
        jMenu3.add(Seventh);

        Eighth.setText("8");
        Eighth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EighthActionPerformed(evt);
            }
        });
        jMenu3.add(Eighth);

        Nineth.setText("9");
        Nineth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NinethActionPerformed(evt);
            }
        });
        jMenu3.add(Nineth);

        Tenth.setText("10");
        Tenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenthActionPerformed(evt);
            }
        });
        jMenu3.add(Tenth);

        Eleven_S.setText("11-Science");
        Eleven_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleven_SActionPerformed(evt);
            }
        });
        jMenu3.add(Eleven_S);

        Eleven_C.setText("11-Commerce");
        Eleven_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleven_CActionPerformed(evt);
            }
        });
        jMenu3.add(Eleven_C);

        Twelfth_S.setText("12-Science");
        Twelfth_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Twelfth_SActionPerformed(evt);
            }
        });
        jMenu3.add(Twelfth_S);

        Twelfth_C.setText("12-Commerce");
        Twelfth_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Twelfth_CActionPerformed(evt);
            }
        });
        jMenu3.add(Twelfth_C);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Fee Structure");

        F_Update.setText("Update");
        F_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_UpdateActionPerformed(evt);
            }
        });
        jMenu4.add(F_Update);

        F_Deposited.setText("Deposited");
        F_Deposited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_DepositedActionPerformed(evt);
            }
        });
        jMenu4.add(F_Deposited);

        F_Remaining.setText("Remaining");
        F_Remaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_RemainingActionPerformed(evt);
            }
        });
        jMenu4.add(F_Remaining);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void S_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_AddActionPerformed
        // TODO add your handling code here:
        Student_info m=new Student_info();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_S_AddActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_formWindowActivated

    private void S_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_UpdateActionPerformed
        // TODO add your handling code here:
          Student_update m=new Student_update();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_S_UpdateActionPerformed

    private void S_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_SearchActionPerformed
        // TODO add your handling code here:
          student_sear m=new student_sear();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_S_SearchActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formComponentShown

    private void T_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_AddActionPerformed
        // TODO add your handling code here:
        Teacher_info m=new Teacher_info();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_T_AddActionPerformed

    private void T_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_UpdateActionPerformed
        // TODO add your handling code here:
        Teacher_update m=new Teacher_update();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_T_UpdateActionPerformed

    private void T_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_SearchActionPerformed
        // TODO add your handling code here:
        teacher_search m=new teacher_search();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_T_SearchActionPerformed

    private void SecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondActionPerformed
        // TODO add your handling code here
        Grade=Second.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_SecondActionPerformed

    private void ThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdActionPerformed
        // TODO add your handling code here:
       Grade=Third.getText();
       NewJFrame m=new NewJFrame();
       m.Grade=Grade;
        m.setVisible(true);
        this.dispose(); 
}//GEN-LAST:event_ThirdActionPerformed

    private void FifthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FifthActionPerformed
        // TODO add your handling code here:
        Grade=Fifth.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_FifthActionPerformed

    private void EighthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EighthActionPerformed
        // TODO add your handling code here:
        Grade=Eighth.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_EighthActionPerformed

    private void LKGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LKGActionPerformed
        // TODO add your handling code here:
        Grade=LKG.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_LKGActionPerformed

    private void UKGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UKGActionPerformed
        // TODO add your handling code here:
        Grade=UKG.getText();
        NewJFrame m=new NewJFrame();
        m.setVisible(true);
        m.Grade=Grade;
        this.dispose();
}//GEN-LAST:event_UKGActionPerformed

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
        // TODO add your handling code here:
        Grade=First.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_FirstActionPerformed

    private void FourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthActionPerformed
        // TODO add your handling code here:
        Grade=Fourth.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_FourthActionPerformed

    private void SixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixthActionPerformed
        // TODO add your handling code here:
        Grade=Sixth.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_SixthActionPerformed

    private void SeventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeventhActionPerformed
        // TODO add your handling code here:
        Grade=Seventh.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_SeventhActionPerformed

    private void NinethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NinethActionPerformed
        // TODO add your handling code here:
        Grade=Nineth.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
         m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_NinethActionPerformed

    private void TenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenthActionPerformed
        // TODO add your handling code here:
        Grade=Tenth.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose()
                ;
}//GEN-LAST:event_TenthActionPerformed

    private void Eleven_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleven_SActionPerformed
        // TODO add your handling code here:
        Grade=Eleven_S.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_Eleven_SActionPerformed

    private void Eleven_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleven_CActionPerformed
        // TODO add your handling code here:
        Grade=Eleven_C.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_Eleven_CActionPerformed

    private void Twelfth_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Twelfth_SActionPerformed
        // TODO add your handling code here:
        Grade=Twelfth_S.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_Twelfth_SActionPerformed

    private void Twelfth_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Twelfth_CActionPerformed
        // TODO add your handling code here:
        Grade=Twelfth_C.getText();
        NewJFrame m=new NewJFrame();
        m.Grade=Grade;
        m.setVisible(true);
        this.dispose();
        
        
}//GEN-LAST:event_Twelfth_CActionPerformed

    private void F_DepositedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_DepositedActionPerformed
        // TODO add your handling code here:
        feedepo m=new feedepo();
         m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_F_DepositedActionPerformed

    private void S_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_DelActionPerformed
        // TODO add your handling code here:
        Student_delete m=new Student_delete();
        m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_S_DelActionPerformed

    private void F_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_UpdateActionPerformed
        // TODO add your handling code here:
        Deposited m=new Deposited();
         m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_F_UpdateActionPerformed

    private void F_RemainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_RemainingActionPerformed
        // TODO add your handling code here:
        feeremain m =new feeremain();
         m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_F_RemainingActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login1 m=new login1();
         m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_logoutActionPerformed

    private void T_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_DelActionPerformed
        // TODO add your handling code here:
        teacher_delete m=new teacher_delete();
         m.setVisible(true);
        this.dispose();
}//GEN-LAST:event_T_DelActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
                new MainPage().setBackground(Color.red);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eighth;
    private javax.swing.JMenuItem Eleven_C;
    private javax.swing.JMenuItem Eleven_S;
    private javax.swing.JMenuItem F_Deposited;
    private javax.swing.JMenuItem F_Remaining;
    private javax.swing.JMenuItem F_Update;
    private javax.swing.JMenuItem Fifth;
    private javax.swing.JMenuItem First;
    private javax.swing.JMenuItem Fourth;
    private javax.swing.JMenuItem LKG;
    private javax.swing.JMenuItem Nineth;
    private javax.swing.JMenuItem S_Add;
    private javax.swing.JMenuItem S_Del;
    private javax.swing.JMenuItem S_Search;
    private javax.swing.JMenuItem S_Update;
    private javax.swing.JMenuItem Second;
    private javax.swing.JMenuItem Seventh;
    private javax.swing.JMenuItem Sixth;
    private javax.swing.JMenuItem T_Add;
    private javax.swing.JMenuItem T_Del;
    private javax.swing.JMenuItem T_Search;
    private javax.swing.JMenuItem T_Update;
    private javax.swing.JMenuItem Tenth;
    private javax.swing.JMenuItem Third;
    private javax.swing.JMenuItem Twelfth_C;
    private javax.swing.JMenuItem Twelfth_S;
    private javax.swing.JMenuItem UKG;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables

}
