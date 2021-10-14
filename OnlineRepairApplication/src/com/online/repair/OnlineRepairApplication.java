package com.online.repair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.online.repair.model.Device;
import com.online.repair.service.DeviceRepairFactory;

public class OnlineRepairApplication {

	public static void main(String[] args) {

		List<Device> devices = getDevicesForRepair();

		for (Device device : devices) {
			System.out.println(device);
		}

	}

	private static List<Device> getDevicesForRepair() {

		List<Device> devices = new ArrayList<>();

		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair("MOBILE", "MOBILE_SCREEN_REPAIR", "Test1", "TX",
				new Date(), new Date()));
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair("MOBILE", "MOBILE_AUDIO_REPAIR", "Test1", "TX",
				new Date(), new Date()));
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair("MOBILE", "MOBILE_CAMERA_REPAIR", "Test1", "TX",
				new Date(), new Date()));

		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair("TV", "TV_SPEAKER_REPAIR", "Test1", "TX", new Date(),
				new Date()));
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair("TV", "TV_DISPLAY_REPAIR", "Test1", "TX", new Date(),
				new Date()));
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair("TV", "TV_MOTHERBOARD_REPAIR", "Test1", "TX",
				new Date(), new Date()));

		return devices;
	}

}
