package com.online.repair.service;

import java.util.Date;

import com.online.repair.model.Device;
import com.online.repair.model.mobile.MobileAudioRepair;
import com.online.repair.model.mobile.MobileCameraRepair;
import com.online.repair.model.mobile.MobileScreenReplacement;
import com.online.repair.model.tv.TVDisplayRepair;
import com.online.repair.model.tv.TVMotherboardRepair;
import com.online.repair.model.tv.TVSpeakerRepair;

public class DeviceRepairFactory {

	public static Device getDeviceInstanceForRepair(String deviceName, String repairType, String customerName, String contactDetails,
			Date transactionDate, Date estimatedDeliveryDate) {
		Device device = null;

		if (deviceName.equalsIgnoreCase("MOBILE")) {
			switch (repairType) {
			case "MOBILE_SCREEN_REPAIR":
				device = new MobileScreenReplacement(customerName, contactDetails, transactionDate,
						estimatedDeliveryDate);
				break;
			case "MOBILE_AUDIO_REPAIR":
				device = new MobileAudioRepair(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
				break;
			case "MOBILE_CAMERA_REPAIR":
				device = new MobileCameraRepair(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
				break;
			}

		} else if (deviceName.equalsIgnoreCase("TV")) {
			switch (repairType) {
			case "TV_DISPLAY_REPAIR":
				device = new TVDisplayRepair(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
				break;
			case "TV_SPEAKER_REPAIR":
				device = new TVSpeakerRepair(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
				break;
			case "TV_MOTHERBOARD_REPAIR":
				device = new TVMotherboardRepair(customerName, contactDetails, transactionDate, estimatedDeliveryDate);
				break;
			}
		}

		return device;
	}
}
