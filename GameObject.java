import sum.ereignis.*;
/**
 * @author 
 * @version 
 */

public abstract class GameObject {
    private int posX, posY;
    private int sizeX, sizeY;
    private Buntstift stift;
    
    public GameObject(int posX, int posY, int sizeX, int sizeY, Buntstift stift) {
        this.posX = posX;
        this.posY = posY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.stift = stift;
    }
    
    public int getX() {
        return posX;
    }     
    
    public void setX(int x) {
        posX = x;
    }     
   
    public int getY() {
        return posY;
    }   
    
    public void setY(int y) {
        posY = y;
    }   
    
     public int getSizeX() {
        return sizeX;
    }     
    
    public void setSizeX(int x) {
        sizeX = x;
    }   
   
    public int getSizeY() {
        return sizeY;
    }     
    
    public void setSizeY(int y) {
        sizeY = y;
    }   
    
    public Buntstift getStift() {
        return stift;
    }    
   
    abstract boolean draw();
    abstract boolean erase();
    
    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.abs(x2-x1) + Math.abs(y2-y1));
    }    
    
}
