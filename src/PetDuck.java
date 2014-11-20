
import java.awt.Image;
import javax.swing.*;

public class PetDuck {

    Player player;
    int DuckX = 1400, nFrameCounter = 0;
    ;
    boolean isRunning = false, isWalking = false, isLeft, isRight;
    Image CurrentDuckImage;
    Image WalkingL[] = new Image[2];
    Image WalkingR[] = new Image[2];
    Image FlyingL[] = new Image[4];
    Image FlyingR[] = new Image[4];
    Image SittingL, SittingR;

    //ImageIcon i1 = new ImageIcon("DuckWalking_L_f1.png");
    //ImageIcon i2 = new ImageIcon("DuckWalking_L_f2.png");
    //ImageIcon i3 = new ImageIcon("DuckWalking_R_f1.png");
    //ImageIcon i4 = new ImageIcon("DuckWalking_R_f2.png");
    public PetDuck() {

        for (int i = 0; i < 4; i++) {
        }

        //WalkingL[1] = i2.getImage();

        //WalkingR[0] = i3.getImage();
        //WalkingR[1] = i4.getImage();


    }

    int GetDuckX(int PlayerX, int DuckX) {
        if (DuckX > PlayerX) {
            isRight = true;
            isLeft = false;
            DuckX -= 5;

        }
        if (DuckX < PlayerX) {
            isLeft = true;
            isRight = false;
            DuckX += 5;
        }
        return DuckX;
    }

    public Image GetImage(int PlayerX, int DuckX) {

        if (isLeft) {
            CurrentDuckImage = WalkingL[nFrameCounter];
            nFrameCounter += 1;

            if (nFrameCounter == 2) {
                nFrameCounter = 0;
            }
        }

        if (isRight) {
            CurrentDuckImage = WalkingR[nFrameCounter];
            nFrameCounter += 1;

            if (nFrameCounter == 2) {
                nFrameCounter = 0;
            }

        }
        nFrameCounter = 0;
        return CurrentDuckImage;
    }
}
