//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.09.18 às 12:24:25 PM BRT 
//


package br.com.viagem.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contaContabilRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contaContabilRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="regionalRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="aereo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="hotel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="carro" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="seguro" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="outro" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="traslado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaContabilRef", propOrder = {
    "codigo",
    "regionalRef",
    "aereo",
    "hotel",
    "carro",
    "seguro",
    "outro",
    "traslado"
})
@XmlSeeAlso({
    ContaContabil.class
})
public class ContaContabilRef {

    @XmlElement(required = true)
    protected String codigo;
    protected RegionalRef regionalRef;
    protected Boolean aereo;
    protected Boolean hotel;
    protected Boolean carro;
    protected Boolean seguro;
    protected Boolean outro;
    protected Boolean traslado;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade regionalRef.
     * 
     * @return
     *     possible object is
     *     {@link RegionalRef }
     *     
     */
    public RegionalRef getRegionalRef() {
        return regionalRef;
    }

    /**
     * Define o valor da propriedade regionalRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRef }
     *     
     */
    public void setRegionalRef(RegionalRef value) {
        this.regionalRef = value;
    }

    /**
     * Obtém o valor da propriedade aereo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAereo() {
        return aereo;
    }

    /**
     * Define o valor da propriedade aereo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAereo(Boolean value) {
        this.aereo = value;
    }

    /**
     * Obtém o valor da propriedade hotel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotel() {
        return hotel;
    }

    /**
     * Define o valor da propriedade hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotel(Boolean value) {
        this.hotel = value;
    }

    /**
     * Obtém o valor da propriedade carro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarro() {
        return carro;
    }

    /**
     * Define o valor da propriedade carro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarro(Boolean value) {
        this.carro = value;
    }

    /**
     * Obtém o valor da propriedade seguro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeguro() {
        return seguro;
    }

    /**
     * Define o valor da propriedade seguro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeguro(Boolean value) {
        this.seguro = value;
    }

    /**
     * Obtém o valor da propriedade outro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutro() {
        return outro;
    }

    /**
     * Define o valor da propriedade outro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutro(Boolean value) {
        this.outro = value;
    }

    /**
     * Obtém o valor da propriedade traslado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraslado() {
        return traslado;
    }

    /**
     * Define o valor da propriedade traslado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraslado(Boolean value) {
        this.traslado = value;
    }

}
