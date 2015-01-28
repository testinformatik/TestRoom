
/**
 * Beschreiben Sie hier die Klasse Grid.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Grid {
    private GameObject[][] memory;

    /**
     * Konstruktor für Objekte der Klasse Grid
     */
    public Grid(int x, int y) {
        memory = new GameObject[x][y];
    }
    
    /**
     * Gibt das Objekt an der Stelle x y wieder. Wenn keins vorhanden ist, wird null wiedergegeben.
     */
    public GameObject getObject(int x, int y) {
        return memory[x][y];
    }    
    
    /**
     * Platziert das Objekt object an die Stelle x y und gibt true wieder, aber nur falls sie frei ist. Wenn nicht, wird false wiedergegeben.
     */
    public boolean setObject(GameObject object, int x, int y) {
        if(memory[x][y] == null) {
            memory[x][y] = object;
            return true;
        }    
        return false;
    }   
}
