
package pe.com.cmc.eai.ws.facsys.adminproductws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="codArtiOld" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codArtiNew" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codArtiOld",
    "codArtiNew"
})
@XmlRootElement(name = "changeRequest")
public class ChangeRequest {

    @XmlElement(required = true)
    protected String codArtiOld;
    @XmlElement(required = true)
    protected String codArtiNew;

    /**
     * Obtiene el valor de la propiedad codArtiOld.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodArtiOld() {
        return codArtiOld;
    }

    /**
     * Define el valor de la propiedad codArtiOld.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodArtiOld(String value) {
        this.codArtiOld = value;
    }

    /**
     * Obtiene el valor de la propiedad codArtiNew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodArtiNew() {
        return codArtiNew;
    }

    /**
     * Define el valor de la propiedad codArtiNew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodArtiNew(String value) {
        this.codArtiNew = value;
    }

}
