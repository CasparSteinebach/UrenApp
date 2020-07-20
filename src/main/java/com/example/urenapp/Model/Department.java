package com.example.urenapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //this is the auto increment
            long id; //primary key
            String naam;
            int aantalMedewerkers;
            double salaris;
            
			public long getId() {
				return id;
			}
			public void setId(long id) {
				this.id = id;
			}
			public String getNaam() {
				return naam;
			}
			public void setNaam(String naam) {
				this.naam = naam;
			}
			public int getAantalMedewerkers() {
				return aantalMedewerkers;
			}
			public void setAantalMedewerkers(int aantalMedewerkers) {
				this.aantalMedewerkers = aantalMedewerkers;
			} 
            public void setSalaris(double salaris) {
            	this.salaris = salaris;             	
            }
            public double getSalaris() {
            	return salaris; 
            }

}