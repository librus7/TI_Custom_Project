





<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.misys.com/ti/customTags" prefix="ticustom"%>
<f:verbatim>
        <tr>
            <td valign='top' align='left' class='T1'  >
</f:verbatim><x:outputText styleClass='TIlabel' value="Agent Withholding %" />
    <f:verbatim></td>
            <td valign='top' align='left' class='T2'  >
</f:verbatim>
    <ticustom:tiInputText component='#{pane.ctlAgentWithholdingPercentage}'
        styleClass='TIedit'
        valueChangeListener='#{backingBean.addChangeEvent}'
        rendered='#{pane.ctlAgentWithholdingPercentage.controlVisibility}'
        readonly='#{pane.ctlAgentWithholdingPercentage.controlDisabled }'
        style='#{pane.ctlAgentWithholdingPercentage.controlDisabled == true ? "color: gray;" : ""}'
        value='#{pane.ctlAgentWithholdingPercentage.value}'
        id='ctlAgentWithholdingPercentage'
        autoSubmit="#{pane.ctlAgentWithholdingPercentage.autoSubmit}"
        />



<f:verbatim>
</td>

            <td valign='top' align='left' class='T3'/>
            <td valign='top' align='left' class='T4'/>
        </tr>
</f:verbatim>
