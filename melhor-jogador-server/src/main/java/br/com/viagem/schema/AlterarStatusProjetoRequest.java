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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarStatusProjetoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusProjetoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="projetoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projetoRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusProjetoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "ativo",
    "projetoRef"
})
public class AlterarStatusProjetoRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected ProjetoRef projetoRef;

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade projetoRef.
     * 
     * @return
     *     possible object is
     *     {@link ProjetoRef }
     *     
     */
    public ProjetoRef getProjetoRef() {
        return projetoRef;
    }

    /**
     * Define o valor da propriedade projetoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjetoRef }
     *     
     */
    public void setProjetoRef(ProjetoRef value) {
        this.projetoRef = value;
    }

}
