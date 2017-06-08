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
public class Signature implements Serializable{
    
    private List<Class> classes ; 
    private String id ; 
    private String name ; 

    public Signature( String id, String name) {
        this.classes = new ArrayList<Class>();
        this.id = id;
        this.name = name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
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
    
    
    
}
