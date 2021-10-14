package com.online.repair.model.mobile;

import java.util.Date;

public class MobileAudioRepair extends MobileRepair {

	public MobileAudioRepair(String customerName, String contactDetails, Date transactionDate,
			Date estimatedDeliveryDate) {
		super(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
		this.repairType = "MOBILE_AUDIO_REPAIR";
	}
}
