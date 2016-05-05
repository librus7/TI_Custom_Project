package com.misys.tiplus2.customisation.extension;

import org.apache.commons.lang.StringUtils;

import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;

public class IGTIssueEventExtRouter extends EventExtension {

	private IGTIssueEventExtTeamA eventExtTeamA = new IGTIssueEventExtTeamA();
	private IGTIssueEventExtTeamB eventExtTeamB = new IGTIssueEventExtTeamB();

	
	public IGTIssueEventExtRouter() {
		// Team A - extension handler
		eventExtTeamA.setPane(this.getPane());
		eventExtTeamA.setWrapper(this.getWrapper());
		eventExtTeamA.setDriverWrapper(this.getDriverWrapper());

		// Team B - extension handler
		eventExtTeamB.setPane(this.getPane());
		eventExtTeamB.setWrapper(this.getWrapper());
		eventExtTeamB.setDriverWrapper(this.getDriverWrapper());
	}

	@Override
	public void dataCaptured() {
		// TODO Auto-generated method stub
		super.dataCaptured();

		eventExtTeamA.dataCaptured();
		eventExtTeamB.dataCaptured();
	}

	@Override
	public void updateMaster() {
		// TODO Auto-generated method stub
		super.updateMaster();

		eventExtTeamA.updateMaster();
		eventExtTeamB.updateMaster();
	}

	@Override
	public void updateMasterOnRelease() {
		// TODO Auto-generated method stub
		super.updateMasterOnRelease();

		eventExtTeamA.updateMasterOnRelease();
		eventExtTeamB.updateMasterOnRelease();
	}

	@Override
	public boolean onSaving() {
		// TODO Auto-generated method stub

		boolean retA = eventExtTeamA.onSaving();
		boolean retB = eventExtTeamB.onSaving();

		if ((!retA) || (!retB)) return false;
		
		return super.onSaving();
	}

	@Override
	public void onValidate(ValidationDetails validationDetails) {
		// TODO Auto-generated method stub
		super.onValidate(validationDetails);

		eventExtTeamA.onValidate(validationDetails);
		eventExtTeamB.onValidate(validationDetails);
	}

	@Override
	protected String getUserFieldCodeString(String fieldCode) {
		// TODO Auto-generated method stub

		String retA = eventExtTeamA.getUserFieldCodeString(fieldCode);
		String retB = eventExtTeamA.getUserFieldCodeString(fieldCode);

		if (!StringUtils.isEmpty(retA))
			return retA;
		else if (!StringUtils.isEmpty(retB))
			return retB;

		return super.getUserFieldCodeString(fieldCode);
	}

	@Override
	protected void initialiseUserFieldCodes() {
		// TODO Auto-generated method stub
		super.initialiseUserFieldCodes();
		
		eventExtTeamA.initialiseUserFieldCodes();
		eventExtTeamB.initialiseUserFieldCodes();
	}

	@Override
	protected boolean onPostInitialise() {
		// TODO Auto-generated method stub
		
		boolean retA = eventExtTeamA.onPostInitialise();
		boolean retB = eventExtTeamB.onPostInitialise();
		
		if ((!retA) || (!retB)) return false;
		
		return super.onPostInitialise();
	}

}
