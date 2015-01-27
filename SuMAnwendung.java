/**
* Die Klasse SuMAnwendung wurde automatisch erstellt:
*
* @author
* @version 24.5.2010
*/

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung { 
    private int width = 600, height = 600;
    private Player player;
    private Knopf bMenu, bBack;
    private double menuButtonWidth = 80, menuButtonHeight = 30;
    private Buntstift stift;
    private Fenster menuWindow;

    public SuMAnwendung() {
        super(600, 600, false);
        stift = new Buntstift();
        Room room = new Room(100, 100, 400, 400, new Buntstift());
        room.draw();
        
        bMenu = new Knopf(width - 80, 0, menuButtonWidth, menuButtonHeight, "Menü");
        bMenu.setzeBearbeiterGeklickt("menuButtonPressed");
        bMenu.setzeSchriftGroesse(20);
        
        player = new Player(10, 10, 10, 10, new Buntstift(), room);
        player.draw();
    }

    public void menuButtonPressed() {
        menuWindow = new Fenster(width, height, "Menü");
        
        bBack = new Knopf(menuWindow, width - 280, 500, 260, menuButtonHeight, "Zurück");
        bBack.setzeBearbeiterGeklickt("backButtonPressed");
        bBack.setzeSchriftGroesse(20);
        
        bBack = new Knopf(menuWindow, 20, 500, 260, menuButtonHeight, "Spiel beenden");
        bBack.setzeBearbeiterGeklickt("exitButtonPressed");
        bBack.setzeSchriftGroesse(20);
    }
    
    public void backButtonPressed() {
        menuWindow.gibFrei();
    }
    
    public void exitButtonPressed() {
        System.exit(0);
    }
    
    public void bearbeiteMausDruck(int x, int y) {
        player.move(x, y);
    }

    public int getScreenWidth() {
        return width;
    }
    
    public int getScreenHeight() {
        return height;
    }
}