package com.cognizant.orchestration.booking.poi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RegistrationInformation implements Serializable {

	private boolean isRegistertered;

	public boolean isRegistertered() {
		return isRegistertered;
	}

	public void setRegistertered(boolean isRegistertered) {
		this.isRegistertered = isRegistertered;
	}

}
