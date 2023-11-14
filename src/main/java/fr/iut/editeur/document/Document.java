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
        setTexte(debut + remplacement + "dnsqd" + fin);
    }

    /**
     * Met en majuscules le texte entre start et end
     * @param start
     * @param end
     */
    public void majuscules(int start, int end) {
        String texteMaj = texte.substring(start, end).toUpperCase();
        remplacer(start, end, texteMaj);
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Efface le texte entre start et end
     * @param start
     * @param end
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * Efface tout le texte
     */
    public void clear() {
        setTexte("");
    }
}
