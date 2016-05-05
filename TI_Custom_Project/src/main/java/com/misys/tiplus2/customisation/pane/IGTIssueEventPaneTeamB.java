package com.misys.tiplus2.customisation.pane;

import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails.WarningType;

public class IGTIssueEventPaneTeamB {

	// fields
	private EventPane extendEventPane;

	// getters / setters
	public EventPane getExtendEventPane() {
		return extendEventPane;
	}

	public void setExtendEventPane(EventPane extendEventPane) {
		this.extendEventPane = extendEventPane;
	}

	// ctor
	public IGTIssueEventPaneTeamB() {
		
	}
	
	// methods
	public void onTestButtonTestLayoutButton() {
		
		extendEventPane.setAgentAmount(extendEventPane.getAgentAmount() +  "54321");
		extendEventPane.setAgentWithholdingAmount( extendEventPane.getAgentWithholdingAmount() +  "54321");
	}

	public void validateAgentWithholdingAmount(
			ValidationDetails validationDetails) {
		validationDetails.addWarning(WarningType.Other, String.format("TeamB implementation of validateAgentWithholdingAmount -> getAgentWithholdingAmount()=%s",extendEventPane.getAgentWithholdingAmount()));

	}


	public void validateAgentAmount(ValidationDetails validationDetails) {
		
		validationDetails.addWarning(WarningType.Other, String.format("TeamB implementation of validateAgentAmount -> getAgentAmount()=%s",extendEventPane.getAgentAmount()));
	}

	
	

}
