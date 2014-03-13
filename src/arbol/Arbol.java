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
public class Arbol <T>{
    private Nodo<T> raiz;

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }
    public void Recorrer(){
        PilaArreglo <T> pila=new PilaArreglo<>();
        Nodo <T> aux;
        while(raiz!=null){
            
        }
    }
    public void RecorrerPreorden(Nodo<T> nodo){
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
    }
}
