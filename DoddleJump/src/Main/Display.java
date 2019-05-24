package Main;
import javax.swing.*;


class Display {
    private JFrame main_frame;

    Display(String Text){
        main_frame = new JFrame(Text);
    }

    void setupFrame(int w, int h){
        main_frame.setSize(w, h);
        main_frame.setVisible(true);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void setPanel(JPanel panel){
        main_frame.add(panel);
    }

    void setIcon(String Path){
        main_frame.setIconImage(new ImageIcon(Path).getImage());
    }
}


