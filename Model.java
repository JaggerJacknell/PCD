/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenêtregraphique;

/**
 *
 * @author Amiri
 */
public class Model {
    
    private int valeur ; // valeur du compteur

 //Initialiser la valeur du compteur.
 //@param v la valeur initiale du compteur 
 public Model(int v) { 
 this.valeur=v;
}

 // Augmenter d’une unit´e le compteur 
 public void incrementer() {
this.valeur++; 
}

 // Obtenir la valeur du compteur.
 //return la valeur du compteur. 
 public int getValeur() { 
return this.valeur ; 
}

 // Remettre a zero le compteur ∗/
 public void raz () { 
this.valeur = 0; 
	}
    
}
