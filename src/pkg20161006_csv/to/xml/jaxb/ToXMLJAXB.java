/**
 * File: ToXMLJAXB.java
 * Created 06-oct-2016 at 14:56:52
 */
package pkg20161006_csv.to.xml.jaxb;

import generated.Personas;
import generated.Personas.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miquel Ginés Borràs
 * @mail ginesborrasm@gmail.com
 */
public class ToXMLJAXB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        List csvLine;
        CSVParser csvP = new CSVParser();
        XMLTreatment xmlT = new XMLTreatment();
        String s, path = "csv.csv";
        File f = new File(path);
        Personas ppl = new Personas();
        Persona p;
        try {
            br = new BufferedReader(new FileReader(f));
            while ((s = br.readLine()) != null) {
                p = new Persona();
                csvLine = csvP.loadCSVToArrayList(s);
                // XML Treatment
                xmlT.setPersonaValues(p, csvLine);
                xmlT.addPersonaToPersonas(p, ppl);
            }
            f = new File("prueba.xml");
            xmlT.objectToXml(ppl, f);
        } catch (Exception ex) {
            Logger.getLogger(ToXMLJAXB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ToXMLJAXB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
