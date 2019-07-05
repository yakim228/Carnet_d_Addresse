/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetaddresse;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Personne implements Serializable,Comparable<Personne>{
    private String nom;
    private String prenom;
    private String genre;
    private int age;
    private String numBureau;
    private String numOffice;
    private String email;
    private static int id=0;
    public Personne(){
        
    }
    public Personne(String nom, String prenom,String genre,int age, String numBureau, String numOffice, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre=genre;
        this.age=age;
        this.numBureau = numBureau;
        this.numOffice = numOffice;
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public String getNom() {
        return nom;
    }
    public static int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumBureau() {
        return numBureau;
    }

    public void setNumBureau(String numBureau) {
        this.numBureau = numBureau;
    }

    public String getNumOffice() {
        return numOffice;
    }

    public void setNumOffice(String numOffice) {
        this.numOffice = numOffice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
   public Object[] toObject(){
       return new Object[]{nom,prenom,genre,age,numBureau,numOffice,email};
   }

    @Override
    public int compareTo(Personne o) {
       return getEmail().compareTo(o.getEmail());
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", age=" + age + ", numBureau=" + numBureau + ", numOffice=" + numOffice + ", email=" + email + '}';
    }

   
    

   
   
}