//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.09.18 às 12:24:25 PM BRT 
//


package br.com.viagem.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamentoHotelConfig.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="formaPagamentoHotelConfig"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FATURADO"/&gt;
 *     &lt;enumeration value="CARTAO"/&gt;
 *     &lt;enumeration value="DIRETO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "formaPagamentoHotelConfig", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum FormaPagamentoHotelConfig {

    FATURADO,
    CARTAO,
    DIRETO;

    public String value() {
        return name();
    }

    public static FormaPagamentoHotelConfig fromValue(String v) {
        return valueOf(v);
    }

}
