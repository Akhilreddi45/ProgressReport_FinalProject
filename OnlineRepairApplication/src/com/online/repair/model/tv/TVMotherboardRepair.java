package com.online.repair.model.tv;

import java.util.Date;

public class TVMotherboardRepair extends TVRepair {

	public TVMotherboardRepair(String customerName, String contactDetails, Date transactionDate,
			Date estimatedDeliveryDate) {
		super(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
		this.repairType = "TV_MOTHERBOARD_REPAIR";

	}

}
