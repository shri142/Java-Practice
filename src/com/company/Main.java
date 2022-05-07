package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends Frame implements ActionListener{
    Label l1 = new Label("Username: ", Label.CENTER);
    TextField tf1 = new TextField(10);

    Label l2 = new Label("Password: ", Label.CENTER);
    TextField tf2 = new TextField(10);

    Button b1 = new Button("Login");

    Label l3 = new Label("Result: ", Label.CENTER );

    void Login(){
        setTitle("Login Form");
        setSize(450,500);
        setLayout(new FlowLayout());
        setBackground(Color.blue);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);

        b1.setBackground(Color.red);
        b1.setForeground(Color.green);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){
        String un = tf1.getText();
        l3.setText(un + " Successfully logged in!!!");
    }
}

public class Main{
    public static void main(String[] args) {
        Login L = new Login();
        L.Login();
    }
}