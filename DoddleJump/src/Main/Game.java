package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class Game extends JPanel implements ActionListener, declarations {

    private Timer timer;
    private static int FPS;

    Game(){
        timer = new Timer(FPS, this);
        setFocusTraversalKeysEnabled(false);
        setFocusTraversalKeysEnabled(false);
        timer.start();
    }

    public void paint(Graphics graphics){
        graphics.fillRect(0,0, size[0], size[1]);
        graphics.setColor(Color.BLACK);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        repaint();
    }

    public void listen_key(JComponent panel, int keyCode, String id, ActionListener listener){
        InputMap inputMap = panel.getInputMap(WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = panel.getActionMap();
        inputMap.put(KeyStroke.getKeyStroke(keyCode, 0, false), id);
        actionMap.put(id, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.actionPerformed(e);
            }
        });
    }
}
