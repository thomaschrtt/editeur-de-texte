package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {

        private Document document;

        @Override
        protected void setUp() throws Exception {
            super.setUp();
            document = new Document();
        }

        public void testAjouter() {
            document.ajouter("Hello");
            assertEquals("Hello", document.getTexte());
        }

        public void testRemplacer() {
            document.ajouter("Hello");
            document.remplacer(0, 5, "Bonjour");
            assertEquals("Bonjour", document.getTexte());
        }

        public void testMajuscules() {
            document.ajouter("Hello");
            document.majuscules(0, 5);
            assertEquals("HELLO", document.getTexte());
        }

        public void testEffacer() {
            document.ajouter("Hello");
            document.effacer(0, 5);
            assertEquals("", document.getTexte());
        }

        public void testClear() {
            document.ajouter("Hello");
            document.clear();
            assertEquals("", document.getTexte());
        }
}
