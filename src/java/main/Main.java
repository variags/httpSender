package main;

import GUI.Frame;
import http.HttpSender;

/**
 * Created by m.simonov on 18.03.2016.
 */
public class Main {



    public static void main(String[] args) throws Exception {
        HttpSender httpSender = new HttpSender();
        Frame app = new Frame(httpSender);
        app.setVisible(true);


    }

}
