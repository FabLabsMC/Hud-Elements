package io.github.fablabsmc.fablabs.impl.hud.client;

import io.github.fablabsmc.fablabs.client.api.hud.v1.HudManager;

public final class HudManagerInternals {
	private static HudManager hudManager = null;

	public static HudManager getManager() {
		return hudManager;
	}

	public static void register(HudManager hudManager) {
		if (HudManagerInternals.hudManager != null) {
			throw new RuntimeException(String.format("Hud manager was already registered! Tried to register %s but %s is the currently bound hud manager", hudManager, HudManagerInternals.hudManager));
		}

		HudManagerInternals.hudManager = hudManager;
	}

	private HudManagerInternals() {
	}
}
