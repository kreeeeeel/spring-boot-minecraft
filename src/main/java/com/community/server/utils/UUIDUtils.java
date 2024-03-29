package com.community.server.utils;

import java.util.UUID;

public final class UUIDUtils {
	private UUIDUtils() {}

	public static String unsign(UUID uuid) {
		return uuid.toString().replace("-", "");
	}

	public static UUID toUUID(String uuid) {
		switch (uuid.length()) {
			case 36:
				return UUID.fromString(uuid);

			case 32:
				return UUID.fromString(uuid.substring(0, 8) + "-" + uuid.substring(8, 12) + "-" + uuid.substring(12, 16) + "-" + uuid.substring(16, 20) + "-" + uuid.substring(20, 32));

			default:
				throw new IllegalArgumentException("Invalid UUID: " + uuid);
		}
	}
}
