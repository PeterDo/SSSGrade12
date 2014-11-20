//
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author impec8113
 */
public class PanInGameMenu extends JPanel {

    JButton btnResume = new JButton("");
    JButton btnGameMenu = new JButton("");
    Image inGameMenu;

    PanInGameMenu() {
        //setFocusable(true);
        setLayout(null);
        //setBackground(Color.blue);
        ImageIcon menu = new ImageIcon("InGameMenu.png");
        inGameMenu = menu.getImage();
        //position and size of a button
        btnResume.setBounds(400, 250, 200, 50);
        btnResume.setBorderPainted(false);
        btnResume.setContentAreaFilled(false);
        btnResume.setOpaque(false);

        btnGameMenu.setBounds(15, 20, 100, 40);
        btnGameMenu.setBorderPainted(false);
        btnGameMenu.setContentAreaFilled(false);
        btnGameMenu.setOpaque(false);
        // add the button
        add(btnResume);
        add(btnGameMenu);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(inGameMenu, 0, (- 10), this);
    }
}
