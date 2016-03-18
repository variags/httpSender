package GUI;

import http.HttpSender;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by m.simonov on 17.03.2016.
 */
public class Frame extends JFrame implements ActionListener {

    private JTextField textField;
    private JLabel lblNewLabel;
    String name;


    private HttpSender httpSender;



    public Frame(HttpSender httpSender ) throws IOException {
        this.httpSender = httpSender;
        String resp = httpSender.getResp("");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JButton btnOk = new JButton("send");
        btnOk.addActionListener(this);

        btnOk.setBounds(335, 11, 89, 23);
        getContentPane().add(btnOk);

        textField = new JTextField();
        textField.setBounds(10, 12, 315, 20);
        getContentPane().add(textField);
        textField.setColumns(10);

        lblNewLabel = new JLabel("resp:" );
        lblNewLabel.setBounds(10, 146, 315, 14);
        getContentPane().add(lblNewLabel);


        resp = httpSender.getResp("");
    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        name = textField.getText();
        lblNewLabel.setText(String.valueOf(name));
    }
}

