/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1sanchezvega_luismiguel202306proyectofinal_tiposempleadostienda;

import java.util.HashMap;
import java.util.Objects;
/**
 *
 * @author alumnom
 */
public class Almacen {
    // ATRIBUTOS
    private Gerente gerenteAlmacen;
    private char letraIdentificativa;

    // GETTERS Y SETTERS
    public Gerente getGerenteAlmacen() {
        return gerenteAlmacen;
    }

    public void setGerenteAlmacen(Gerente gerenteAlmacen) {
        this.gerenteAlmacen = gerenteAlmacen;
    }
    
    public char getLetraIdentificativa() {
        return letraIdentificativa;
    }

    public void setLetraIdentificativa(char letraIdentificativa) {
        this.letraIdentificativa = letraIdentificativa;
    }

    // CONSTRUCTOR COMPLETO
    public Almacen(Gerente gerenteAlmacen, char letraIdentificativa) {
        this.gerenteAlmacen = gerenteAlmacen;
        this.letraIdentificativa = letraIdentificativa;
    }
    
    // CONSTRUCTOR VACIO
    public Almacen(){
        gerenteAlmacen = new Gerente();
        letraIdentificativa = ' ';
    }
    
    // CONSTRUCTOR DE COPIA
    public Almacen(Almacen a){
        a.setGerenteAlmacen(gerenteAlmacen);
        a.setLetraIdentificativa(letraIdentificativa);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(gerenteAlmacen, letraIdentificativa);
        return hash;
    }

    // EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Almacen other = (Almacen) obj;
        if (this.letraIdentificativa != other.letraIdentificativa) {
            return false;
        }
        return Objects.equals(this.gerenteAlmacen, other.gerenteAlmacen);
    }
    

    // TOSTRING
    @Override
    public String toString() {
        return "Almacen " + letraIdentificativa;
    }
}
