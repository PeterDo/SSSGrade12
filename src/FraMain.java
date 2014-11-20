
import java.awt.event.*;
import javax.swing.*;

public class FraMain extends JFrame {
    
    Player p;
    PanGame panGame = new PanGame();
    PanMainMenu panMainMenu = new PanMainMenu();
    PanInGameMenu panInGameMenu = new PanInGameMenu();
    boolean hasDrawnPanGame, hasDrawnPanMainMenu, hasDrawnPanInGameMenu;

    //Name of Frame, Dementions of the frame and other verables about the frame
    public FraMain() {
          //panGame.setFocusable(true);
        if (hasDrawnPanMainMenu == false) {
            add(panMainMenu);
            hasDrawnPanMainMenu = true;
        }


        // mouse listener for the escape button on the game pannel
        panGame.btnEsc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (hasDrawnPanInGameMenu == false) {
                    add(panInGameMenu);
                    hasDrawnPanInGameMenu = true;
                }

                panGame.setVisible(false);
                panInGameMenu.setVisible(true);
            }
        });
        panInGameMenu.btnResume.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                panInGameMenu.setVisible(false);
                panGame.setVisible(true);
            }
        });

        panInGameMenu.btnGameMenu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                panInGameMenu.setVisible(false);
                panMainMenu.setVisible(true);
            }
        });

        // when the play button is pressed it will call the switchlistener class
        panMainMenu.btnPlay.addActionListener(switchListen);

    }

    class SwitchListen implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (hasDrawnPanGame == false) {
                add(panGame);
                hasDrawnPanGame = true;
            }
            panMainMenu.setVisible(false);
            panGame.setVisible(true);
        }
    }
    ActionListener switchListen = new SwitchListen();
}
