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
 * <p>Classe Java de contaContabil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contaContabil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contaContabilRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaContabil", propOrder = {
    "descricao",
    "ativo"
})
public class ContaContabil
    extends ContaContabilRef
{

    @XmlElement(required = true)
    protected String descricao;
    protected boolean ativo;

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

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

}
