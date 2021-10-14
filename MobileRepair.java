package com.online.repair.model.mobile;

import java.util.Date;

import com.online.repair.model.Device;

public abstract class MobileRepair extends Device {

	public MobileRepair(String customerName, String contactDetails, Date transactionDate, Date estimatedDeliveryDate) {
		this.device = "MOBILE";
		this.customerName = customerName;
		this.contactDetails = contactDetails;
		this.transactionDate = transactionDate;
		this.estimatedDeliveryDate = estimatedDeliveryDate;

	}

}
