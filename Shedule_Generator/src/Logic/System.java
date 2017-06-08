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
public class System implements Serializable{
    private String name ; 
    private List<Person> persons ; 

    public System(String name) {
        this.name = name;
        this.persons = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
    
    
}
