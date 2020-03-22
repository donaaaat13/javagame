import GUI.MenuSystem;

import javax.swing.*;

public class AlkeszTheGame {

    // a program belepesi pontja
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                startMenuSystem();
            }
        });
    }

    private static void startMenuSystem() {
        MenuSystem openMenu = new MenuSystem();
        openMenu.setResizable(false);
        openMenu.setVisible(true);
        openMenu.setTitle("AlkeszTheGame");
        openMenu.setSize(700,800);

    }
}
