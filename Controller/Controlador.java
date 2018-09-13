package Controller;

import java.util.*;

/**
 * 
 */
public class Controlador implements IValidable {

    /**
     * Default constructor
     */
    public Controlador() {
    }

    /**
     * 
     */
    private Alfabeto alfabetoActual;


    /**
     * 
     */
    private Algoritmo elAlgoritmo;

    /**
     * 
     */
    private Escritor elEscritor;

    /**
     * 
     */
    private IEscritor elEscritor;


    /**
     * @return
     */
    public Collection cargarAlfabetos() {
        // TODO implement here
        return null;
    }

    /**
     * @param elDTO 
     * @return
     */
    public void procesarPeticion(DTOAlgoritmos elDTO) {
        // TODO implement here
        return null;
    }

    /**
     * @param elDTO 
     * @return
     */
    private void predefinirAlfabeto(DTOAlgoritmos elDTO) {
        // TODO implement here
        return null;
    }

    /**
     * @param elDTO 
     * @return
     */
    private boolean validar(DTOAlgoritmos elDTO) {
        // TODO implement here
        return false;
    }

    /**
     * @param elDTO 
     * @return
     */
    private void activarAlgoritmos(DTOAlgoritmos elDTO) {
        // TODO implement here
        return null;
    }

    /**
     * @param DTO 
     * @return
     */
    private void escribir(DTOAlgoritmos DTO) {
        // TODO implement here
        return null;
    }

    /**
     * @param obj 
     * @return
     */
    public abstract boolean validar(Object obj);

}