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
    private Knopf bMenu;
    private double menuButtonWidth = 100, menuButtonHeight = 30;
    private Buntstift stift;
    private Grid grid;

    public SuMAnwendung() {
        super(600, 600);     
        
        grid = new Grid(20, 20);
        stift = new Buntstift();
        Room room = new Room(100, 100, 400, 400, new Buntstift());
        room.draw();
        
        bMenu = new Knopf(width - 100, 0, menuButtonWidth, menuButtonHeight, "menu");
        bMenu.setzeBearbeiterGeklickt("menuButtonPressed");
        bMenu.setzeSchriftGroesse(20);
        
        player = new Player(10, 10, 10, 10, new Buntstift(), room);
        player.draw();
    }

    public void menuButtonPressed() {
        stift.hoch();
        stift.bewegeBis(100,100);
        stift.runter();
        Etikett hatEtikett1 = new Etikett(10, 10, 50, 25, "Test");
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
