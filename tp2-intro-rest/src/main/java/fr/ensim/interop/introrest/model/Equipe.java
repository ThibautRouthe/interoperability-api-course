package fr.ensim.interop.introrest.model;

import static java.lang.Math.abs;

public class Equipe {
    private int id;
    private String name;
    private int nbJoueurs;

    private Equipe(int id, String name, int nbJoueurs){
        this.id=id;
        this.name=name;
        this.nbJoueurs=nbJoueurs;
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

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public static Equipe of(int id, String name, int nbJoueurs) {
        return new Equipe(id, name, nbJoueurs);
    }
}
