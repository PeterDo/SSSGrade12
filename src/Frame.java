import javax.swing.JFrame;

public class Frame extends JFrame {

    //Name of Frame, Dementions of the frame and other verables about the frame

    public Frame() {
        add(new Board());
        setTitle("SexySideScroller Beta V 3.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 350);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
