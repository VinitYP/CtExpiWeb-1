package College_Mini_Project;


import College_Insert.Insert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class College implements ActionListener {
    JFrame jFrametaluka, jFramesita, jFramedharamp, jFramehingna, jFramepardi, jFrameitwari, jFramecrpf
            , jFramefirst ,jFrameinsert,jFrameinsert2;
    JTextField jTextFieldrpgmin, jTextFieldrpgmax, jTextFieldrhmin, jTextFieldrhmax, jTextFieldrfmin, jTextFieldrfmax;
    JLabel jLabelrentpg, jLabelrenthouse, jLabelrentflat, jLabelmax, jLabelmin, jLabelmess,jLabelinsert,jLabelget;
    JButton jButtonSitabuldi, jButtonDharamp, jButtoncrpf, jButtonhingna, jButtonpardi, jButtonitwari,jButtoninsert,jButtongetdata;

    Connection con;
    Statement stmt;
    ResultSet r1, r2, r3, r4, r5, r6;


    public College()
    {
        //region font
        Font font1 = new Font("Caliri", Font.BOLD, 18);
        Font font2 = new Font("Calibri", Font.BOLD, 16);
        //endregion

        //region frame-first-frame

        jFramefirst = new JFrame();

        jFramefirst.setBounds(50, 40, 800, 500);
        jFramefirst.setTitle("first ");
        jFramefirst.setVisible(true);
        jFramefirst.setLayout(null);
        jFramefirst.getContentPane().setBackground(Color.orange);
        jFramefirst.setFont(font1);

        //endregion

        //region frame-Insert

        jFrameinsert = new JFrame();
        jFrameinsert.setBounds(50, 40, 500, 500);
        jFrameinsert.setTitle("insert ");
        //jFrameinsert.setVisible(true);
        jFrameinsert.setLayout(null);
        jFrameinsert.getContentPane().setBackground(Color.orange);
        jFrameinsert.setFont(font1);


        //endregion

        //region frame-Insert2

        jFrameinsert2 = new JFrame();
        jFrameinsert2.setBounds(50, 40, 500, 500);
        jFrameinsert2.setTitle("first ");
        //jFrameinsert2.setVisible(true);
        jFrameinsert2.setLayout(null);
        jFrameinsert2.getContentPane().setBackground(Color.orange);
        jFrameinsert2.setFont(font1);

        //endregion

        //region frame
        jFrametaluka = new JFrame();
        jFrametaluka.setBounds(50, 40, 500, 500);
        jFrametaluka.setTitle("taluka");
        jFrametaluka.setLayout(null);
        jFrametaluka.getContentPane().setBackground(Color.orange);
        jFrametaluka.setFont(font1);
        //endregion

        //region frame-sita
        jFramesita = new JFrame();
        jFramesita.setBounds(50, 40, 500, 500);
        jFramesita.setTitle("Welcome to Sitabuldi DataBase");
        jFramesita.setLayout(null);
        jFramesita.getContentPane().setBackground(Color.cyan);
        jFramesita.setFont(font1);

        //endregion

        //region frame-Dharampeth

        jFramedharamp = new JFrame();
        jFramedharamp.setBounds(50, 40, 500, 500);
        jFramedharamp.setTitle("Welcome to Dharampeth DataBase");
        jFramedharamp.setLayout(null);
        jFramedharamp.getContentPane().setBackground(Color.cyan);
        jFramedharamp.setFont(font1);

        //endregion

        //region frame-Hingna

        jFramehingna = new JFrame();
        jFramehingna.setBounds(50, 40, 500, 500);
        jFramehingna.setTitle("Welcome to Hingana DataBase");
        jFramehingna.setLayout(null);
        jFramehingna.getContentPane().setBackground(Color.cyan);
        jFramehingna.setFont(font1);

        //endregion

        //region frame-Pardi

        jFramepardi = new JFrame();
        jFramepardi.setBounds(50, 40, 500, 500);
        jFramepardi.setTitle("Welcome to Pardi DataBase");
        jFramepardi.setLayout(null);
        jFramepardi.getContentPane().setBackground(Color.cyan);
        jFramepardi.setFont(font1);

        //endregion

        //region frame-itwari

        jFrameitwari = new JFrame();
        jFrameitwari.setBounds(50, 40, 500, 500);
        jFrameitwari.setTitle("Welcome to Itwari DataBase");
        jFrameitwari.setLayout(null);
        jFrameitwari.getContentPane().setBackground(Color.cyan);
        jFrameitwari.setFont(font1);

        //endregion

        //region frame-CRPF

        jFramecrpf = new JFrame();
        jFramecrpf.setBounds(50, 40, 500, 500);
        jFramecrpf.setTitle("Welcome to CRPF DataBase");
        jFramecrpf.setLayout(null);
        jFramecrpf.getContentPane().setBackground(Color.cyan);
        jFramecrpf.setFont(font1);

        //endregion

        //region Textfield


        jTextFieldrfmin = new JTextField();
        jTextFieldrfmin.setBounds(150, 100, 70, 30);

        jTextFieldrfmax = new JTextField();
        jTextFieldrfmax.setBounds(300, 100, 70, 30);


        jTextFieldrpgmin = new JTextField();
        jTextFieldrpgmin.setBounds(150, 180, 70, 30);

        jTextFieldrpgmax = new JTextField();
        jTextFieldrpgmax.setBounds(300, 180, 70, 30);


        jTextFieldrhmin = new JTextField();
        jTextFieldrhmin.setBounds(150, 260, 70, 30);

        jTextFieldrhmax = new JTextField();
        jTextFieldrhmax.setBounds(300, 260, 70, 30);


        //endregion

        //region label

        jLabelrentflat = new JLabel();
        jLabelrentflat.setBounds(30, 100, 70, 30);
        jLabelrentflat.setText("RentFlat");
        jLabelrentflat.setFont(font2);

        jLabelrentpg = new JLabel();
        jLabelrentpg.setBounds(30, 180, 70, 30);
        jLabelrentpg.setText("Rent Pg");
        jLabelrentpg.setFont(font2);

        jLabelrenthouse = new JLabel();
        jLabelrenthouse.setBounds(30, 260, 70, 30);
        jLabelrenthouse.setText("Rent House");
        jLabelrenthouse.setFont(font2);

        jLabelmess = new JLabel();
        jLabelmess.setBounds(30, 230, 70, 30);
        jLabelmess.setText("Mess");
        jLabelmess.setFont(font2);

        jLabelmin = new JLabel();
        jLabelmin.setBounds(180, 50, 50, 30);
        jLabelmin.setText("Min");
        jLabelmin.setFont(font2);

        jLabelmax = new JLabel();
        jLabelmax.setBounds(300, 50, 50, 30);
        jLabelmax.setText("Max");
        jLabelmax.setFont(font2);

        jLabelinsert = new JLabel();
        jLabelinsert.setBounds(100, 70, 300, 30);
        jLabelinsert.setText("Insert Data Please Press me ->");
        jLabelinsert.setFont(font2);

        jLabelget = new JLabel();
        jLabelget.setBounds(100 ,120, 300, 30);
        jLabelget.setText("Getting Min-Max Amount Press me ->");
        jLabelget.setFont(font2);




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
        jButtoninsert.setBounds(400, 70, 100, 30);
        jButtoninsert.setFont(font2);

        jButtongetdata = new JButton();
        jButtongetdata.setText("get");
        jButtongetdata.setBounds(400, 120, 100, 30);
        jButtongetdata.setFont(font2);

        //endregion

        //region adding Components




        jFrametaluka.add(jButtonSitabuldi);
        jFrametaluka.add(jButtonpardi);
        jFrametaluka.add(jButtonitwari);
        jFrametaluka.add(jButtoncrpf);
        jFrametaluka.add(jButtonhingna);
        jFrametaluka.add(jButtonDharamp);

        jFramefirst.add(jButtoninsert);
        jFramefirst.add(jButtongetdata);
        jFramefirst.add(jLabelinsert);
        jFramefirst.add(jLabelget);
        //endregion

        //region Action


        jButtoninsert.addActionListener(this);
        jButtongetdata.addActionListener(this);
        jButtonSitabuldi.addActionListener(this);
        jButtonDharamp.addActionListener(this);
        jButtonhingna.addActionListener(this);
        jButtonitwari.addActionListener(this);
        jButtoncrpf.addActionListener(this);
        jButtonpardi.addActionListener(this);
        //endregion


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtongetdata)
        {
            jFrametaluka.setVisible(true);
            jFramefirst.setVisible(false);
        }
        if (e.getSource() == jButtoninsert)
        {
            new Insert();
            jFramefirst.setVisible(false);

            if (e.getSource() == jButtonSitabuldi)
            {
                jFrameinsert2.setVisible(true);
                jFrameinsert2.add(jButtonSitabuldi);
            }


        }

        if (e.getSource() == jButtoncrpf)
        {
            jFramecrpf.setVisible(true);
            jFrametaluka.setVisible(false);
            jFramecrpf.add(jLabelrentflat);
            jFramecrpf.add(jLabelrenthouse);
            jFramecrpf.add(jLabelrentpg);
            jFramecrpf.add(jLabelmax);
            jFramecrpf.add(jLabelmin);
            jFramecrpf.add(jTextFieldrfmin);
            jFramecrpf.add(jTextFieldrfmax);
            jFramecrpf.add(jTextFieldrpgmin);
            jFramecrpf.add(jTextFieldrpgmax);
            jFramecrpf.add(jTextFieldrhmin);
            jFramecrpf.add(jTextFieldrhmax);
            String s = "crpf";

            connection();
            renthousemin(s);


        } else if (e.getSource() == jButtonDharamp) {
            jFramedharamp.setVisible(true);
            jFrametaluka.setVisible(false);
            jFramedharamp.add(jLabelrentflat);
            jFramedharamp.add(jLabelrenthouse);
            jFramedharamp.add(jLabelrentpg);
            jFramedharamp.add(jLabelmax);
            jFramedharamp.add(jLabelmin);
            jFramedharamp.add(jTextFieldrfmin);
            jFramedharamp.add(jTextFieldrfmax);
            jFramedharamp.add(jTextFieldrpgmin);
            jFramedharamp.add(jTextFieldrpgmax);
            jFramedharamp.add(jTextFieldrhmin);
            jFramedharamp.add(jTextFieldrhmax);
            String s = "dharampeth";
            connection();
            renthousemin(s);

        } else if (e.getSource() == jButtonhingna) {
            jFramehingna.setVisible(true);
            jFrametaluka.setVisible(false);
            jFramehingna.add(jTextFieldrfmax);
            jFramehingna.add(jTextFieldrfmin);
            jFramehingna.add(jTextFieldrhmin);
            jFramehingna.add(jTextFieldrhmax);
            jFramehingna.add(jTextFieldrpgmax);
            jFramehingna.add(jTextFieldrpgmin);
            jFramehingna.add(jLabelmax);
            jFramehingna.add(jLabelmin);
            jFramehingna.add(jLabelrentflat);
            jFramehingna.add(jLabelrenthouse);
            jFramehingna.add(jLabelrentpg);
            String s = "hingna";
            connection();
            renthousemin(s);

        } else if (e.getSource() == jButtonSitabuldi) {
            jFramesita.setVisible(true);
            jFrametaluka.setVisible(false);
            jFramesita.add(jLabelmax);
            jFramesita.add(jLabelmin);
            jFramesita.add(jLabelrentflat);
            jFramesita.add(jLabelrenthouse);
            jFramesita.add(jLabelrentpg);
            jFramesita.add(jTextFieldrfmin);
            jFramesita.add(jTextFieldrfmax);
            jFramesita.add(jTextFieldrpgmin);
            jFramesita.add(jTextFieldrpgmax);
            jFramesita.add(jTextFieldrhmin);
            jFramesita.add(jTextFieldrhmax);
            String s = "sitabuldi";
            connection();
            renthousemin(s);


        } else if (e.getSource() == jButtonitwari) {
            jFrameitwari.setVisible(true);
            jFrametaluka.setVisible(false);
            jFrameitwari.add(jLabelrentflat);
            jFrameitwari.add(jLabelrenthouse);
            jFrameitwari.add(jLabelrentpg);
            jFrameitwari.add(jLabelmax);
            jFrameitwari.add(jLabelmin);
            jFrameitwari.add(jTextFieldrfmin);
            jFrameitwari.add(jTextFieldrfmax);
            jFrameitwari.add(jTextFieldrpgmin);
            jFrameitwari.add(jTextFieldrpgmax);
            jFrameitwari.add(jTextFieldrhmin);
            jFrameitwari.add(jTextFieldrhmax);
            String s = "itwari";
            connection();
            renthousemin(s);


        } else if (e.getSource() == jButtonpardi) {
            jFramepardi.setVisible(true);
            jFrametaluka.setVisible(false);
            jFramepardi.add(jLabelrentflat);
            jFramepardi.add(jLabelrenthouse);
            jFramepardi.add(jLabelrentpg);
            jFramepardi.add(jLabelmax);
            jFramepardi.add(jLabelmin);
            jFramepardi.add(jTextFieldrfmin);
            jFramepardi.add(jTextFieldrfmax);
            jFramepardi.add(jTextFieldrpgmin);
            jFramepardi.add(jTextFieldrpgmax);
            jFramepardi.add(jTextFieldrhmin);
            jFramepardi.add(jTextFieldrhmax);
            String s = "pardi";
            connection();
            renthousemin(s);

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



    /*
    //region insert

    public void insert(String v)
    {
        try
        {
            int rentpgmin,rentpgmax,renthousemin,renthousemax,rentflatmin,rentflatmax,messmin,messmax;
            String x;
            x=v;

            rentpgmin = Integer.parseInt(jTextFieldrpgmin.getText());
            rentpgmax = Integer.parseInt(jTextFieldrpgmax.getText());
            renthousemin = Integer.parseInt(jTextFieldrhmin.getText());
            renthousemax = Integer.parseInt(jTextFieldrhmax.getText());
            rentflatmin = Integer.parseInt(jTextFieldrfmin.getText());
            rentflatmax = Integer.parseInt(jTextFieldrhmax.getText());


            String insqry = "insert into "+x+"() values(" + rentpgmin + ",'" + rentpgmax + "','" + renthousemin + "'," + renthousemax + " ," +rentflatmin+ "," +rentflatmax+")";

            //System.out.println(insqry);

            int n = stmt.executeUpdate(insqry);
            if (n > 0) {
                JOptionPane.showMessageDialog(jFrameinsert, "Data Inserted Success");
                //getData();
            } else {
                JOptionPane.showMessageDialog(jFrameinsert, "Data Insertion Error");
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    //endregion



     */


    //region getdata for sitabuldi


    public void renthousemin(String s) {
        try {

            String x ;

            x = s;
            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);


            r1 = stmt.executeQuery("SELECT MIN(renthouse) FROM "+x);
            r1.next();
            renthousemax(s);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void renthousemax(String s1)
    {
        try {

            String X;
            X = s1;
            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);


            r2 = stmt.executeQuery("SELECT MAX(renthouse) FROM "+s1);
            r2.next();
            rentpgmin(X);

        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void rentpgmin(String s2)
    {
        try {

            String X2;
            X2 =s2;
            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);


            r3 = stmt.executeQuery("SELECT MIN(rentpg) FROM "+s2);
            r3.next();
            rentpgmmax(X2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void rentpgmmax(String s3)
    {
        try {

            String x3;
            x3 = s3;
            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);


            r4 = stmt.executeQuery("SELECT MAX(rentpg) FROM "+s3);
            r4.next();
            rentflatmin(x3);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void rentflatmin(String s4)
    {
        try {

            String x4;
            x4 = s4;
            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);


            r5 = stmt.executeQuery("SELECT MIN(rentflat) FROM "+s4);
            r5.next();
            rentflatmax(x4);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void rentflatmax(String s5)
    {
        try {

            String x5;
            x5=s5;
            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);


            r6 = stmt.executeQuery("SELECT MAX(rentflat) FROM "+s5);
            r6.next();
            showData();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //endregion


    //region showdata

    public void showData() {
        try
        {

            jTextFieldrhmin.setText(r1.getString(1));
            jTextFieldrhmax.setText(r2.getString(1));
            jTextFieldrpgmin.setText(r3.getString(1));
            jTextFieldrpgmax.setText(r4.getString(1));
            jTextFieldrfmin.setText(r5.getString(1));
            jTextFieldrfmax.setText(r6.getString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //endregion

}





