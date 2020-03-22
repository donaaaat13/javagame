package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class MenuSystem extends JFrame {

    public SingleOrMulti menu;
    public PlayerName playername;
    public enum Window {
        SINGLEORMULTI, PLAYERNAME, SCOREBOARD, STARTSERVER, JOINGAME, GAMEITSELF;
    }
    public String currentWindow = String.valueOf(Window.SINGLEORMULTI);

    HashMap <Window, String> windowname = new HashMap<Window, String>();


    public MenuSystem() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
               drawWindow();
            }
        });

        windowname.put(Window.SINGLEORMULTI, "SingleOrMulti");
        windowname.put(Window.PLAYERNAME, "PlayerName");
    }

    public void drawWindow() {

        switch (DataField.currentpanel) {

            case "SingleOrMulti":
                menu = new SingleOrMulti();
                add(menu);
                pack();
                break;
            case "PlayerName":
                remove(menu);
                playername = new PlayerName();
                add(playername);
                pack();
                break;
        }
    }
}
