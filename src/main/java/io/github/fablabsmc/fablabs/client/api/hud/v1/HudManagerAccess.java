package io.github.fablabsmc.fablabs.client.api.hud.v1;

import java.util.Objects;

import io.github.fablabsmc.fablabs.impl.hud.client.HudManagerInternals;

/**
 * Provides access to the hud api. // TODO Better javadoc lmao
 */
public final class HudManagerAccess {
	public static HudManager getInstance() {
		return HudManagerInternals.getManager();
	}

	public static HudManager.ElementRegistry getElementRegistry() {
		return getInstance().getElementRegistry();
	}

	public static void registerHudManager(HudManager hudManager) {
		Objects.requireNonNull(hudManager, "Hud manager cannot be null");
		HudManagerInternals.register(hudManager);
	}
}
