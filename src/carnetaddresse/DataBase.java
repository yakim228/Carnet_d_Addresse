/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetaddresse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DataBase {
   private File fichier;
   public DataBase(String nom){
       fichier= new File(nom);
   }
    public File ajouter(Personne personne){
        List<Personne> liste = lire(fichier);
        liste.add(personne);
        return ecrire(liste,fichier);
    }
    public File supprimer(int i){
        List<Personne> liste = lire(fichier);
        liste.remove(i);
        return ecrire(liste,fichier);
    }
    public File update(int i,Personne personne){
        List<Personne> liste = lire(fichier);
        liste.remove(i);
        liste.add(personne);
        return ecrire(liste, fichier);
    }
    List<Personne> lire(File file1){
        List<Personne> liste = new ArrayList();
        try{
            FileInputStream fis = new FileInputStream(file1);
            ObjectInputStream oos = new ObjectInputStream(fis);
            do{
                Object o = (List) oos.readObject();
                if (o==null) break;
                liste =(List) o;
            }while(true);
            oos.close();
        }catch(Exception e){
            e.getMessage();
        }
        return liste;
    }
    File ecrire(List<Personne> liste ,File file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(liste);
            
        }catch(IOException e){
            e.getMessage();
        }
        return file;
    }
    public void select(){
        for(Personne p:lire(fichier)){
            System.out.println(p);
        }
    }
    public List<Personne> all(){
        return lire(fichier);
    }
}
