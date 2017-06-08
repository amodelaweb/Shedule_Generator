/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.Serializable;

/**
 *
 * @author SANTI
 */
public class Class implements Serializable{
    private String cod ;
    private Signature signature ; 
    private Time shedule ; 

    public Class(String cod, Signature signature, Time shedule) {
        this.cod = cod;
        this.signature = signature;
        this.shedule = shedule;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    public Time getShedule() {
        return shedule;
    }

    public void setShedule(Time shedule) {
        this.shedule = shedule;
    }
    
    
    
    
}
