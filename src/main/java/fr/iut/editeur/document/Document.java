package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String debut = texte.substring(0, start);
        String fin = texte.substring(end);
        setTexte(debut + remplacement + fin);
    }

    public void majuscules(int start, int end) {
        String debut = texte.substring(0, start);
        String fin = texte.substring(end);
        String maj = texte.substring(start, end).toUpperCase();
        setTexte(debut + maj + fin);
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }
}
