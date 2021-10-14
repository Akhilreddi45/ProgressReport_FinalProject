package com.online.repair.model.mobile;

import java.util.Date;

public class MobileCameraRepair extends MobileRepair {

	public MobileCameraRepair(String customerName, String contactDetails, Date transactionDate,
			Date estimatedDeliveryDate) {
		super(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
		this.repairType = "MOBILE_CAMERA_REPAIR";
	}
}
