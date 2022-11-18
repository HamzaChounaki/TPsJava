package ma.education.tp1.introduction;

public class Salle {

    long id;
    String nom;

    public Salle(){};

    public Salle(String nom){
        this.nom=nom;
    }

    public Salle(String nom, long id){
        this(nom);
        this.id=id;
    }
}
