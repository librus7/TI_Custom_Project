
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.05 at 09:00:32 PM EEST 
//


package com.misys.tiplus2.apps.ti.service.custom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ELCitxEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ELCitxEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:custom.service.ti.apps.tiplus2.misys.com}Event">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELCitxEvent", namespace = "urn:custom.service.ti.apps.tiplus2.misys.com")
public class ELCitxEventType
    extends EventType
{


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
}
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
};
}
/**
* Method is generated!
* Copy data from a given object.
* @param obj
*
*/
public void copy(java.lang.Object obj) {

}
 

}