
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.05 at 09:00:32 PM EEST 
//


package com.misys.tiplus2.apps.ti.service.custom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentWithholdingPercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", namespace = "urn:custom.service.ti.apps.tiplus2.misys.com", propOrder = {
    "agentWithholdingPercentage"
})
@XmlSeeAlso({
    CcCustomerType.class
})
public class CustomerType {


/**
* Method is generated!
* JAXB bean is populated with data from specific TI pane.
* @param tiObj
*
*/
@SuppressWarnings("unchecked")
public void unbindType(com.misys.tiplus2.apps.ti.variants.varsw.pane.GWRExtraData tiObj) {
com.misys.tiplus2.enigma.lang.control.EnigmaTableControl<? extends com.misys.tiplus2.enigma.customisation.pane.EnigmaNameValueIF> a = (com.misys.tiplus2.enigma.lang.control.EnigmaTableControl<com.misys.tiplus2.apps.ti.tistatic.datatype.datatype.NameAndValue>) tiObj.getCtlExtraDataFields().getControl();
String name;
String value;
int rowCount = a.getRowCount();
for (int i = 0; i < rowCount; i++) {
	name = a.getValue(i, 0);
	value = a.getValue(i, 1);
	if (value == null) {
	continue;
}
		
    //tpl:UNBIND_SIMPLETYPE_NUMERICAL_CTL_TEMPLATE
	// Update bean element value with data from TI obj (not string type)
	{	
		if (name.equals("cAAA")) {
			java.lang.Integer bValue = java.lang.Integer.valueOf(value);
			setAgentWithholdingPercentage(bValue);
			continue;
		}
	}	

	
};
}
/**
* Method is generated!
* Specific TI pane is populated with data from JAXB bean.
* @param tiObj
* @param level
*
*/
@SuppressWarnings("unchecked")
public void bindType(com.misys.tiplus2.apps.ti.variants.varsw.pane.GWRExtraData tiObj, int level) {
com.misys.tiplus2.enigma.lang.control.EnigmaTableControl<com.misys.tiplus2.apps.ti.tistatic.datatype.datatype.NameAndValue> a = (com.misys.tiplus2.enigma.lang.control.EnigmaTableControl<com.misys.tiplus2.apps.ti.tistatic.datatype.datatype.NameAndValue>) tiObj.getCtlExtraDataFields().getControl();
		
    //tpl:BIND_SIMPLETYPE_CTL_TEMPLATE
	{
		// Bind simple type element into TI customisable object
		if(getAgentWithholdingPercentage() != null){
			a.addNewInstance();
			a.setValue(a.getRowCount() - 1, 0, "cAAA");
			a.setValue(a.getRowCount() - 1, 1, getAgentWithholdingPercentage().toString());
		}
	}

	
}
/**
* Method is generated!
* Copy data from a given object.
* @param obj
*
*/
public void copy(java.lang.Object obj) {

if (obj instanceof CustomerType) {
CustomerType fromObj = (CustomerType)obj;
// array
setAgentWithholdingPercentage(fromObj.getAgentWithholdingPercentage());}
}
 
    @XmlElement(name = "AgentWithholdingPercentage", namespace = "urn:custom.service.ti.apps.tiplus2.misys.com")
    protected Integer agentWithholdingPercentage;

    /**
     * Gets the value of the agentWithholdingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgentWithholdingPercentage() {
        return agentWithholdingPercentage;
    }

    /**
     * Sets the value of the agentWithholdingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgentWithholdingPercentage(Integer value) {
        this.agentWithholdingPercentage = value;
    }

}