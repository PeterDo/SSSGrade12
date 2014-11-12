import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author impec8113
 */
public class PanMainMenu extends JPanel {

    public JButton btnPlay = new JButton("");
    Image Menu;

    public PanMainMenu() {
        setLayout(null);
        //setBackground(Color.green);
        ImageIcon menu = new ImageIcon("Menu.png");
        Menu = menu.getImage();
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setOpaque(false);
        //position and size of a button
        btnPlay.setBounds(400, 230, 150, 60);
        // add the button
        add(btnPlay);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Menu, 0, (- 10), this);
    }
}
