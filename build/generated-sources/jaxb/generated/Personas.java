package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persona" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fecha_nac" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "persona"
})
@XmlRootElement(name = "personas")
public class Personas {

    protected List<Personas.Persona> persona;

    /**
     * Gets the value of the persona property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persona property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersona().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Personas.Persona }
     * 
     * 
     */
    public List<Personas.Persona> getPersona() {
        if (persona == null) {
            persona = new ArrayList<Personas.Persona>();
        }
        return this.persona;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fecha_nac" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "apellidos",
        "dni",
        "fechaNac",
        "telefono"
    })
    public static class Persona {

        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String apellidos;
        @XmlElement(required = true)
        protected String dni;
        @XmlElement(name = "fecha_nac", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaNac;
        protected int telefono;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad apellidos.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellidos() {
            return apellidos;
        }

        /**
         * Define el valor de la propiedad apellidos.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellidos(String value) {
            this.apellidos = value;
        }

        /**
         * Obtiene el valor de la propiedad dni.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDni() {
            return dni;
        }

        /**
         * Define el valor de la propiedad dni.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDni(String value) {
            this.dni = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaNac.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaNac() {
            return fechaNac;
        }

        /**
         * Define el valor de la propiedad fechaNac.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaNac(XMLGregorianCalendar value) {
            this.fechaNac = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         */
        public int getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         */
        public void setTelefono(int value) {
            this.telefono = value;
        }

    }

}
