package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {

    private JButton click;

    public MyMouseListener(JButton click){
        this.click=click;
    }


    public void mouseClicked(MouseEvent e) { //כל הלחיצה (הליחצה על העכבר ועזיבת האצבע מהעכבר)
        System.out.println("cliced");
    }

    public void mousePressed(MouseEvent e) { //הירידה, כשלוחצים על העכבר, לפני שעוזבים
        System.out.println("pressed");
        this.click.setBackground(Color.PINK);

    }

    public void mouseReleased(MouseEvent e) { // כאשר מרימים את האצבע מהעכבר
        System.out.println("released");
        this.click.setBackground(Color.CYAN);

    }

    public void mouseEntered(MouseEvent e) { //ריחוף
        System.out.println("entered");
        this.click.setForeground(Color.ORANGE); //צבע הטקסט

    }

    public void mouseExited(MouseEvent e) { //כאשר מפסיקים לרחף מעליו
        System.out.println("exited");
        this.click.setForeground(Color.YELLOW ); //צבע הטקסט

    }

}
