package org.dxctraining.entites;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "iteam")
public class Iteam {

    @Id
    @GeneratedValue
    private int id;

    private String name;

   



    public Iteam() {

    }

    public Iteam(String name) {
        this.name = name;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }
    @Override
   	public boolean equals(Object arg) {
   		if(this==arg) {
   			return true;
   		}
   		
   	   if(arg==null || !(arg instanceof Iteam) ) {
   			return false;
   	   }
   		
   	Iteam that=(Iteam)arg;	
   		boolean isequal=this.id==that.id;
   		return isequal;
   	}
   	

   
}
