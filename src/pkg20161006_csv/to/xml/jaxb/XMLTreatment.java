/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20161006_csv.to.xml.jaxb;

import generated.Personas;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Miquel Ginés Borràs
 * @mail ginesborrasm@gmail.com
 */
public class XMLTreatment {

    public XMLTreatment() {

    }

    public void objectToXml(Personas ppl, File f) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Personas.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(ppl, f);

            // Print por consola
            jaxbMarshaller.marshal(ppl, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void setPersonaValues(Personas.Persona p, List v) throws DatatypeConfigurationException, ParseException {
        String format = "dd/MM/yyyy";
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new SimpleDateFormat(format).parse((String) v.get(3)));
        XMLGregorianCalendar fech_nac = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

        p.setNombre((String) v.get(0));
        p.setApellidos((String) v.get(1));
        p.setDni((String) v.get(2));
        p.setFechaNac(fech_nac);
        p.setTelefono(Integer.parseInt((String) v.get(4)));
    }

    public void addPersonaToPersonas(Personas.Persona p, Personas ppl) {
        ppl.getPersona().add(p);
    }
}
