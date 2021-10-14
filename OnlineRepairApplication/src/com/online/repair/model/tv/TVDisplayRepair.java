package com.online.repair.model.tv;

import java.util.Date;

public class TVDisplayRepair extends TVRepair {

	public TVDisplayRepair(String customerName, String contactDetails, Date transactionDate,
			Date estimatedDeliveryDate) {
		super(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
		this.repairType = "TV_DISPLAY_REPAIR";

	}

}
