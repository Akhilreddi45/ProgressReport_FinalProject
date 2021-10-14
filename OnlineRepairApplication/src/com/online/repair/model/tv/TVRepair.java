package com.online.repair.model.tv;

import java.util.Date;

import com.online.repair.model.Device;

public abstract class TVRepair extends Device {

	public TVRepair(String customerName, String contactDetails, Date transactionDate, Date estimatedDeliveryDate) {
		this.device = "TV";
		this.customerName = customerName;
		this.contactDetails = contactDetails;
		this.transactionDate = transactionDate;
		this.estimatedDeliveryDate = estimatedDeliveryDate;

	}

}
