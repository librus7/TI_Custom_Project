package com.misys.tiplus2.customisation.extension;

import com.misys.tiplus2.apps.ti.kernel.extpm.entity.ExtEventWrapper;
import com.misys.tiplus2.apps.ti.kernel.extpm.pane.ExtEventExtensionDriverPWrapper;
import com.misys.tiplus2.customisation.pane.EventPane;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails.WarningType;

public class IGTIssueEventExtTeamA {

	// fields ------------------------------------------------------------
	private EventPane pane;
	private ExtEventWrapper wrapper;
	private ExtEventExtensionDriverPWrapper driverWrapper;
	
	// getters / setters --------------------------------------------------
	public EventPane getPane() {
		return pane;
	}

	public void setPane(EventPane pane) {
		this.pane = pane;
	}

	public ExtEventWrapper getWrapper() {
		return wrapper;
	}

	public void setWrapper(ExtEventWrapper wrapper) {
		this.wrapper = wrapper;
	}
	
	public ExtEventExtensionDriverPWrapper getDriverWrapper() {
		return driverWrapper;
	}

	public void setDriverWrapper(ExtEventExtensionDriverPWrapper driverWrapper) {
		this.driverWrapper = driverWrapper;
	}

	// methods ----------------------------------------------------------------
	
	public void dataCaptured() {
		// TODO Auto-generated method stub

	}


	public void updateMaster() {
		// TODO Auto-generated method stub

	}


	public void updateMasterOnRelease() {
		// TODO Auto-generated method stub

	}


	public boolean onSaving() {
		// TODO Auto-generated method stub
		
		return true;
	}


	public void onValidate(ValidationDetails validationDetails) {
		// TODO Auto-generated method stub
		
		String agentAmountWr = this.getWrapper().getAgentAmount();
		String agentWithholdingAmountWr = this.getWrapper().getAgentWithholdingAmount();
		
		String agentAmountPn = this.getPane().getAgentAmount();
		String agentWithholdingAmountPn = this.getPane().getAgentWithholdingAmount();
		
		validationDetails.addWarning(WarningType.Other, String.format("TEAM_A: agentAmountWr=%s , agentWithholdingAmountWr=%s", agentAmountWr, agentWithholdingAmountWr));
		validationDetails.addWarning(WarningType.Other, String.format("TEAM_A: agentAmountPn=%s , agentWithholdingAmountPn=%s", agentAmountPn, agentWithholdingAmountPn));
		
	}

	public String getUserFieldCodeString(String fieldCode) {
		// TODO Auto-generated method stub
		
		return "";
	}

	
	public void initialiseUserFieldCodes() {
		// TODO Auto-generated method stub
		
	}

	public boolean onPostInitialise() {
		// TODO Auto-generated method stub
		
		return true;
	}
	
}
