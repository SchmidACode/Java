package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends Frame {
    public MainWindow() throws HeadlessException {
        Label lblLastName = new Label("Last Name: ");
        Label lblFirstName = new Label("First Name: ");
        Label lblBirthDate = new Label("Birth Date: ");

        TextField tfLastName = new TextField();
        TextField tfFirstName = new TextField();
        TextField tfBirthDate = new TextField();

        Button btnSave = new Button("Save");
        Button btnReset = new Button("Reset");

        this.setLayout(null);

        lblLastName.setBounds(30, 50, 100, 30);
        lblFirstName.setBounds(30, 100, 100, 30);
        lblBirthDate.setBounds(30, 150, 100, 30);

        tfLastName.setBounds(150, 50, 150, 30);
        tfFirstName.setBounds(150, 100, 150, 30);
        tfBirthDate.setBounds(150, 150, 150, 30);

        btnSave.setBounds(50, 200, 60, 30);
        btnReset.setBounds(150, 200, 60, 30);

        this.add(lblLastName);
        this.add(lblFirstName);
        this.add(lblBirthDate);
        this.add(tfLastName);
        this.add(tfFirstName);
        this.add(tfBirthDate);
        this.add(btnSave);
        this.add(btnReset);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save: " + tfLastName.getText() + " " + tfFirstName.getText() + " " + tfBirthDate.getText());
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfLastName.setText("");
                tfFirstName.setText("");
                tfBirthDate.setText("");
            }
        });

        this.setSize(400, 300);
        this.setVisible(true);
        this.setTitle("AWT Window");
    }
}
