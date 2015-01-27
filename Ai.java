import sum.ereignis.*;
import sum.werkzeuge.*;
/**
 * @author 
 * @version 
 */

public class Ai extends GameObject {
    private double speed = 3, destinationX, destinationY;
    private boolean moving = false;
    private Rechner rechner;
    private Uhr uhr;
    private Room room;
    
    public Ai(int x, int y, int sizeX, int sizeY, Buntstift stift, Room room) {
        super(x, y, sizeX, sizeY, stift);
        rechner = new Rechner();
        uhr = new Uhr();
        this.room = room;
    }

    public boolean draw() {
        getStift().hoch();
        getStift().bewegeBis(getX(), getY());
        getStift().runter();
        getStift().bewegeBis(getX() + getSizeX(), getY());
        getStift().bewegeBis(getX() + getSizeX(), getY() + getSizeY());
        getStift().bewegeBis(getX(), getY() + getSizeY());
        getStift().bewegeBis(getX(), getY());
        getStift().hoch();
        return true;
    }
    
    public boolean erase() {
        getStift().hoch();
        getStift().bewegeBis(getX(), getY());
        getStift().radiere();
        getStift().runter();
        getStift().bewegeBis(getX() + getSizeX(), getY());
        getStift().bewegeBis(getX() + getSizeX(), getY() + getSizeY());
        getStift().bewegeBis(getX(), getY() + getSizeY());
        getStift().bewegeBis(getX(), getY());
        getStift().normal();
        getStift().hoch();
        return true;
    }
    
    public void move(int x, int y) {
        if(room.inBorders(x, y, this))
            moving = true;
        else
            moving = false;

        /**    destinationX = x;
            destinationY = y;
        
            while(moving ) {
                xMove = rechner.ganzeZufallszahl(0,5)
                
                double xMove = x - getX(), yMove = y - getY();
                // double sum = Math.abs(xMove) + Math.abs(yMove);
                double sum = distance(x, y, getX(), getY());
                double toMoveX = (xMove / sum) * speed, toMoveY = (yMove / sum) * speed; 
                erase();
                setX((int) (getX() + toMoveX));
                setY((int) (getY() + toMoveY));
                draw();
                if(distance(getX(), getY(), destinationX, destinationY) < speed)
                    moving=false;
                uhr.warte(50);
        */
        } 
        
        
            /* public void move(int x, int y) {
            moving = true;
            while(moving ) {
            /*double xMove = Math.abs(getX() - x), yMove = Math.abs(getY() - y);
            double sum = Math.abs(getX() - x) + Math.abs(getY() - y);
            double toMoveX = (xMove / sum) * 1, toMoveY = (yMove / sum) * 1; 
            erase();
            getX() = x;
            getY() = y;
            draw();
            moving=false;
            } */
        
    }   
    
    public double findeRichtung(int x, int y, double abc)
    {
        abc=rechner.atan((y-getY())/(x-getX()));
        return abc;
    }
}

