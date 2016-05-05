package com.misys.tiplus2.customisation.pane;

import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails.WarningType;

public class IGTIssueEventPaneTeamA {

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
	public IGTIssueEventPaneTeamA() {
		
	}
	
	// methods
	public void onTestButtonTestLayoutButton() {
		
		extendEventPane.setAgentAmount("12345");
		extendEventPane.setAgentWithholdingAmount("12345");
	}

	public void validateAgentWithholdingAmount(
			ValidationDetails validationDetails) {
		validationDetails.addWarning(WarningType.Other, String.format("TeamA implementation of validateAgentWithholdingAmount -> getAgentWithholdingAmount()=%s",extendEventPane.getAgentWithholdingAmount()));

	}


	public void validateAgentAmount(ValidationDetails validationDetails) {
		
		validationDetails.addWarning(WarningType.Other, String.format("TeamA implementation of validateAgentAmount -> getAgentAmount()=%s",extendEventPane.getAgentAmount()));
	}

	
	

}
