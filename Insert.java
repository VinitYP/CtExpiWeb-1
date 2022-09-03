package College_Insert;

import College_Mini_Project.College;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert implements ActionListener {

    JComboBox cb1, cb2;
    Container cc;
    JTextArea jTextArea;
    JFrame jFrameinsert, jFrameinsert2;
    JTextField jTextFieldrpg, jTextFieldrh,  jTextFieldrf, jTextFieldmess,jTextFieldlocation;
    JLabel jLabelrentpg, jLabelrenthouse, jLabelrentflat, jLabelmess,jLabellocation,jLabelfirst,jLabelinfo;
    JButton jButtonSitabuldi, jButtonDharamp, jButtoncrpf, jButtonhingna, jButtonpardi,
            jButtonfirst,jButtonitwari, jButtoninsert, jButtongetdata, jButtonsubmit;
    Connection con;
    Statement stmt;
    ResultSet r1, r2, r3, r4, r5, r6;



    public Insert()
    {
        //region font
        Font font1 = new Font("Caliri", Font.BOLD, 18);
        Font font2 = new Font("Calibri", Font.BOLD, 16);

        //endregion

        //region Textfield


        jTextFieldrpg = new JTextField();
        jTextFieldrpg.setBounds(150, 120, 70, 30);

        jTextFieldrh = new JTextField();
        jTextFieldrh.setBounds(150, 200, 70, 30);

        jTextFieldrf = new JTextField();
        jTextFieldrf.setBounds(150, 280, 70, 30);

        jTextFieldmess = new JTextField();
        jTextFieldmess.setBounds(150, 360, 70, 30);

        jTextFieldlocation = new JTextField();
        jTextFieldlocation.setBounds(230, 10, 200, 30);





        //endregion

        //region label

        jLabelrentflat = new JLabel();
        jLabelrentflat.setBounds(30, 120, 70, 30);
        jLabelrentflat.setText("RentFlat");
        jLabelrentflat.setFont(font2);

        jLabelrentpg = new JLabel();
        jLabelrentpg.setBounds(30, 200, 70, 30);
        jLabelrentpg.setText("Rent Pg");
        jLabelrentpg.setFont(font2);

        jLabelrenthouse = new JLabel();
        jLabelrenthouse.setBounds(30, 280, 100, 30);
        jLabelrenthouse.setText("Rent House");
        jLabelrenthouse.setFont(font2);

        jLabelmess = new JLabel();
        jLabelmess.setBounds(30, 360, 70, 30);
        jLabelmess.setText("Mess");
        jLabelmess.setFont(font2);

        jLabelinfo = new JLabel();
        jLabelinfo.setBounds(30, 440, 300, 30);
        jLabelinfo.setText("Click for sumbit Information-------->");
        jLabelinfo.setFont(font2);


/*
        jLabellocation = new JLabel();
        jLabellocation.setBounds(30, 10, 200, 30);
        jLabellocation.setText("Type location Name");
        jLabellocation.setText("Sitabuldi,itwari");
        jLabellocation.setText("crpf,dharampeth");
        jLabellocation.setText("pardi,hingna");
        jLabellocation.setFont(font2);
*/
        jTextArea = new JTextArea();
        jTextArea.setBounds(10,10,200,75);
        jTextArea.setText("Enter location name  ------->"+"\n" +

        "* ( Sitabuldi,itwari"+"\n"+
        "    crpf,dharampeth"+"\n"+
        "    pardi,hingna ). Anyone!"   );
        jTextArea.setFont(font2);
        jTextArea.setForeground(Color.BLUE);
        jTextArea.setBackground(Color.orange);

        jLabelfirst = new JLabel();
        jLabelfirst.setBounds(30, 520, 300, 30);
        jLabelfirst.setText("Click me for Redirect to first Page------>");
        jLabelfirst.setFont(font2);
        jLabelfirst.setForeground(Color.RED);



        //endregion

        //region Button

        jButtonSitabuldi = new JButton();
        jButtonSitabuldi.setText("Sitabuldi");
        jButtonSitabuldi.setBounds(100, 70, 100, 30);
        jButtonSitabuldi.setFont(font2);

        jButtonhingna = new JButton();
        jButtonhingna.setText("Hingna");
        jButtonhingna.setBounds(100, 150, 100, 30);
        jButtonhingna.setFont(font2);

        jButtoncrpf = new JButton();
        jButtoncrpf.setText("CRPF");
        jButtoncrpf.setBounds(100, 230, 100, 30);
        jButtoncrpf.setFont(font2);

        jButtonDharamp = new JButton();
        jButtonDharamp.setText("Dharampeth");
        jButtonDharamp.setBounds(250, 70, 100, 30);
        jButtonDharamp.setFont(font2);

        jButtonpardi = new JButton();
        jButtonpardi.setText("Pardi");
        jButtonpardi.setBounds(250, 150, 100, 30);
        jButtonpardi.setFont(font2);

        jButtonitwari = new JButton();
        jButtonitwari.setText("Itwari");
        jButtonitwari.setBounds(250, 230, 100, 30);
        jButtonitwari.setFont(font2);

        jButtoninsert = new JButton();
        jButtoninsert.setText("Insert");
        jButtoninsert.setBounds(100, 100, 100, 30);
        jButtoninsert.setFont(font2);

        jButtongetdata = new JButton();
        jButtongetdata.setText("get");
        jButtongetdata.setBounds(250, 100, 100, 30);
        jButtongetdata.setFont(font2);

        jButtonsubmit = new JButton();
        jButtonsubmit.setText("Submit");
        jButtonsubmit.setBounds(300, 440, 100, 30);
        jButtonsubmit.setFont(font2);

        jButtonfirst = new JButton();
        jButtonfirst.setText("Click");
        jButtonfirst.setBounds(300, 520, 100, 30);
        jButtonfirst.setFont(font2);


        //endregion

        //region frame-Insert

        jFrameinsert = new JFrame();
        jFrameinsert.setBounds(50, 40, 600, 600);
        jFrameinsert.setTitle("insert ");
        //jFrameinsert.setVisible(true);
        jFrameinsert.setLayout(null);
        jFrameinsert.getContentPane().setBackground(Color.orange);
        jFrameinsert.setFont(font1);


        //endregion

        //region frame-Insert2

        jFrameinsert2 = new JFrame();
        jFrameinsert2.setBounds(50, 40, 600, 600);
        jFrameinsert2.setTitle("first ");
        jFrameinsert2.setVisible(true);
        jFrameinsert2.setLayout(null);
        jFrameinsert2.getContentPane().setBackground(Color.orange);
        jFrameinsert2.setFont(font1);

        //endregion

        //region Addding-Component

        jFrameinsert2.add(jLabelrentflat);
        jFrameinsert2.add(jLabelrenthouse);
        jFrameinsert2.add(jLabelmess);
        jFrameinsert2.add(jTextFieldmess);
        jFrameinsert2.add(jLabelrentpg);
        jFrameinsert2.add(jTextFieldrf);
        jFrameinsert2.add(jTextFieldrpg);
        jFrameinsert2.add(jTextFieldrh);
        jFrameinsert2.add(jTextFieldmess);
        jFrameinsert2.add(jButtonsubmit);
        jFrameinsert2.add(jTextFieldlocation);
        //jFrameinsert2.add(jLabellocation);
        jFrameinsert2.add(jTextArea);
        jFrameinsert2.add(jButtonfirst);
        jFrameinsert2.add(jLabelfirst);
        jFrameinsert2.add(jLabelinfo);
        jFrameinsert.add(jButtonSitabuldi);
        jFrameinsert.add(jButtonDharamp);



        //endregion

        //jFrameinsert.add();

        //region Action


        jButtoninsert.addActionListener(this);
        jButtongetdata.addActionListener(this);
        jButtonSitabuldi.addActionListener(this);
        jButtonDharamp.addActionListener(this);
        jButtonhingna.addActionListener(this);
        jButtonitwari.addActionListener(this);
        jButtoncrpf.addActionListener(this);
        jButtonpardi.addActionListener(this);
        jButtonsubmit.addActionListener(this);
        jButtonfirst.addActionListener(this);
        //endregion

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtonSitabuldi)
        {
            jFrameinsert2.setVisible(true);
            jFrameinsert.setVisible(false);
        }
        else if (e.getSource()==jButtonsubmit)
        {

            String s = jTextFieldlocation.getText();
            insertquery(s);
        }
        else if (e.getSource()==jButtonfirst)
        {
            jFrameinsert2.setVisible(false);
            new College();
        }
    }

    //region connection
    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ctxpiveb",
                    "root", "");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //endregion

    //region insert
    public void insertquery(String s) {
        try {
            connection();
            String x ;
            x = s;
            int rentpg, rentflat, renthouse, mess;

            rentpg = Integer.parseInt(jTextFieldrpg.getText());
            rentflat = Integer.parseInt(jTextFieldrf.getText());
            renthouse = Integer.parseInt(jTextFieldrh.getText());
            mess = Integer.parseInt(jTextFieldmess.getText());



            String insqry = "insert into "+x+"(renthouse,rentpg,rentflat,mess) values(" + rentpg + "," + rentflat + "," + renthouse + "," + mess +  ")";

            //System.out.println(insqry);

            int n = stmt.executeUpdate(insqry);
            if (n > 0)
            {
               JOptionPane.showMessageDialog(jFrameinsert2, "Data Inserted Success");

            } else {
               JOptionPane.showMessageDialog(jFrameinsert2, "Data Insertion Error");
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        }
    //endregion

    }


