package ma.education.tp1.introduction;
import ma.education.tp1.introduction.Salle;

public class Test {

    public static void main(String[] args) {
        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle informatique");
        Salle o3 = new Salle("Salle du cours", 2);

        System.out.println(o1.id + " " + o1.nom);
        System.out.println(o2.id + " " + o2.nom);
        System.out.println(o3.id + " " + o3.nom);
    }
}