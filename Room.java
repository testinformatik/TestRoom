import sum.ereignis.*;
/**
 * @author 
 * @version 
 */

public class Room extends GameObject {

    public Room(int posX, int posY, int sizeX, int sizeY, Buntstift stift) {
        super(posX, posY, sizeX, sizeY, stift);
    }

    public boolean draw() {
        getStift().hoch();
        getStift().bewegeBis(getX(), getY());
        getStift().runter();
        getStift().bewegeBis(getX() + getSizeX(), getY());
        getStift().bewegeBis(getX() + getSizeX(), getY() + getSizeY());
        getStift().bewegeBis(getX(), getY()+ getSizeY());
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
    
    public boolean inBorders(int x, int y, GameObject gameObject) {
        if(x > this.getX() && y > this.getY() && 
            x + gameObject.getSizeX() < this.getX() + this.getSizeX() &&
            y + gameObject.getSizeY() < this.getY() + this.getSizeY() )
            return true;
        return false;
    }
}
