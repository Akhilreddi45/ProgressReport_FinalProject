package com.online.repair.model.tv;

import java.util.Date;

public class TVSpeakerRepair extends TVRepair {

	public TVSpeakerRepair(String customerName, String contactDetails, Date transactionDate,
			Date estimatedDeliveryDate) {
		super(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
		this.repairType = "TV_SPEAKER_REPAIR";

	}

}
