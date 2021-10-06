/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemroggramanmahir;

/**
 *
 * @author HP
 */
public class validasiTandaKurung<T> {
    public T[] data;
    public int top = 0;
    
    // construktor
    public validasiTandaKurung(int n) {
        data = (T[]) new Object[n];
    }
    
    // method  empety
    public boolean isEmpety() {
        return top == 0;
    }
    
    // method full
    public boolean isFull() {
        return top == data.length;
    }
    
    // method push (menambahkan data)
    public void push(T value) {
        if ( !isFull() ) {
            data[top] = value;
            top++;
        } else {
            System.out.println("Stack Penuh!");
        }
    }
    
    // method pop (mengeluarkan data)
    public T pop() {
        if ( !isEmpety() ) {
            top--;
            T r = data[top];
            return r;
        } else {
            top--;
            return null;
        }
    }
    
    // method peek
    public T peek() {
        if ( !isEmpety() ) {
            return data[top-1];
        } else {
            return null;
        }
    }
}
