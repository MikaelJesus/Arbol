/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbol;

/**
 *
 * @author Alumnos
 */
public class Arbol <T> extends Nodo{
    private Nodo<T> raiz;

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }
    public Arbol()
    {
        raiz = null;
    }
    
    public Arbol(Nodo nodo1, Nodo nodo2)
    {
        raiz = super.agrearNodo(nodo1, nodo2);
    }
    /*public void RecorrerPreorden(Nodo<T> nodo){
        if(nodo!=null){
            System.out.print(nodo.getDato());
            RecorrerPreorden(nodo.getIzquierda());
            RecorrerPreorden(nodo.getDerecha());
        }
    }
    public void RecorrerInorden(Nodo<T> nodo){
        if(nodo!=null){
            RecorrerInorden(nodo.getIzquierda());
            System.out.print(nodo.getDato());
            RecorrerInorden(nodo.getDerecha());
        }
    }
    public void RecorrerPosorden(Nodo<T> nodo){
        if(nodo!=null){
            RecorrerPosorden(nodo.getIzquierda());
            RecorrerPosorden(nodo.getDerecha());
            System.out.print(nodo.getDato());
        }
    }*/
    public void insertarNode(Nodo nodo)
    {
        this.raiz.frecuencia = nodo.frecuencia;
        this.raiz.c = nodo.c;
        this.raiz.izquierda = nodo.izquierda;
        this.raiz.derecha = nodo.derecha;
    }
}
