package Model;

import java.util.*;

/**
 * 
 */
public class Alfabeto implements IValidable {

    /**
     * Default constructor
     */
    public Alfabeto() {
    }


    private int id;
    private String nombre;
    private ArrayList<String> simbolos;

    /**
     * @param s 
     * @return
     */
    public boolean validar(String s) {
        // TODO implement here
        boolean result = false;
        if (simbolos.contains(s)){
            return result;
        }
        return result;
    }

    /**
     * @param obj 
     * @return
     */
    public abstract boolean validar(Object obj);

}