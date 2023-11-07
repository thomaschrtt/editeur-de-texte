package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        if (Integer.parseInt(parameters[1]) > Integer.parseInt(parameters[2])) {
            System.err.println("Le début doit être inférieur à la fin");
            return;
        }
        if (Integer.parseInt(parameters[1]) < 0 || Integer.parseInt(parameters[2]) > this.document.getTexte().length()) {
            System.err.println("Les indices doivent être compris entre 0 et " + this.document.getTexte().length());
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        String texte = (parameters.length > 3) ? parameters[3] : "";
        this.document.remplacer(start, end, texte);
        super.executer();
    }

}
