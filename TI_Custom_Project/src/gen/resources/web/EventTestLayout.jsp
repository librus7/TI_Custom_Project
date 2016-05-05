





<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.misys.com/ti/customTags" prefix="ticustom"%>
<f:verbatim>
        <tr>
            <td valign='top' align='left' class='T1'  >
</f:verbatim><x:outputText styleClass='TIlabel' value="Agent Amount" />
    <f:verbatim></td>
            <td valign='top' align='left' class='T2'  >
</f:verbatim>
    <ticustom:tiInputText component='#{pane.ctlAgentAmount}'
        styleClass='TIedit'
        valueChangeListener='#{backingBean.addChangeEvent}'
        rendered='#{pane.ctlAgentAmount.controlVisibility}'
        readonly='#{pane.ctlAgentAmount.controlDisabled }'
        style='#{pane.ctlAgentAmount.controlDisabled == true ? "color: gray;" : ""}'
        value='#{pane.ctlAgentAmount.value}'
        id='ctlAgentAmount'
        autoSubmit="#{pane.ctlAgentAmount.autoSubmit}"
        maxlength='13'
        />



<f:verbatim>
</td>

            <td valign='top' align='left' class='T3'/>
            <td valign='top' align='left' class='T4'/>
        </tr>
        <tr>
            <td valign='top' align='left' class='T1'  >
</f:verbatim><x:outputText styleClass='TIlabel' value="Agent Withholding" />
    <f:verbatim></td>
            <td valign='top' align='left' class='T2'  >
</f:verbatim>
    <ticustom:tiInputText component='#{pane.ctlAgentWithholdingAmount}'
        styleClass='TIedit'
        valueChangeListener='#{backingBean.addChangeEvent}'
        rendered='#{pane.ctlAgentWithholdingAmount.controlVisibility}'
        readonly='#{pane.ctlAgentWithholdingAmount.controlDisabled }'
        style='#{pane.ctlAgentWithholdingAmount.controlDisabled == true ? "color: gray;" : ""}'
        value='#{pane.ctlAgentWithholdingAmount.value}'
        id='ctlAgentWithholdingAmount'
        autoSubmit="#{pane.ctlAgentWithholdingAmount.autoSubmit}"
        maxlength='13'
        />



<f:verbatim>
</td>

            <td valign='top' align='left' class='T3'/>
            <td valign='top' align='left' class='T4'/>
        </tr>
        <tr>
            <td valign='top' align='left' class='T1'/>
            <td valign='top' align='center' class='T2'  >
</f:verbatim>
<ticustom:tiCommandButton
        styleClass="button" type="submit"
        component="#{pane.btnTestButtonTestLayout}"
        rendered="#{pane.btnTestButtonTestLayout.controlVisibility}"
        disabled="#{pane.btnTestButtonTestLayout.controlDisabled}"
        actionListener="#{backingBean.processChangeEvent}"
        action="#{pane.fireTestButtonTestLayoutButtonAction}"
        value="Test"
        id="btnTestButtonTestLayout" />



<f:verbatim>
</td>

            <td valign='top' align='left' class='T3'/>
            <td valign='top' align='left' class='T4'/>
        </tr>
</f:verbatim>
