package com.misys.tiplus2.customisation.pane;

import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;

public class IGTIssueEventPaneRouter extends EventPane {

	private IGTIssueEventPaneTeamA extendPaneTeamA;
	private IGTIssueEventPaneTeamB extendPaneTeamB;
	
	private static final long serialVersionUID = 1L;
	
	public IGTIssueEventPaneRouter() {
		// TODO Auto-generated constructor stub
		extendPaneTeamA = new IGTIssueEventPaneTeamA();
		extendPaneTeamA.setExtendEventPane(this);
		
		extendPaneTeamB = new IGTIssueEventPaneTeamB();
		extendPaneTeamB.setExtendEventPane(this);
		
	}
	

	@Override
	public void onTestButtonTestLayoutButton() {
		extendPaneTeamA.onTestButtonTestLayoutButton();
		extendPaneTeamB.onTestButtonTestLayoutButton();
		
	}

	@Override
	public void validateAgentWithholdingAmount(
			ValidationDetails validationDetails) {
		//super.validateAgentWithholdingAmount(validationDetails);
		
		extendPaneTeamA.validateAgentWithholdingAmount(validationDetails);
		extendPaneTeamB.validateAgentWithholdingAmount(validationDetails);
	}

	@Override
	public void validateAgentAmount(ValidationDetails validationDetails) {
		//super.validateAgentAmount(validationDetails);
		
		extendPaneTeamA.validateAgentAmount(validationDetails);
		extendPaneTeamB.validateAgentAmount(validationDetails);
	}

	
	

}
