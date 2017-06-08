/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTI
 */
public class Person implements Serializable{
    private String id ; 
    private String name ; 
    private List<Signature> signatures ; 

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        this.signatures = new ArrayList<Signature>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Signature> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<Signature> signatures) {
        this.signatures = signatures;
    }
    
    
    
}
