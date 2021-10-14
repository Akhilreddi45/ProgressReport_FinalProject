package com.online.repair.model.mobile;

import java.util.Date;

public class MobileScreenReplacement extends MobileRepair {

	public MobileScreenReplacement(String customerName, String contactDetails, Date transactionDate,
			Date estimatedDeliveryDate) {
		super(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
		this.repairType = "MOBILE_SCREEN_REPAIR";
	}
}
