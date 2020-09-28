package io.github.fablabsmc.fablabs.impl.hud.client.namemelol;

import io.github.fablabsmc.fablabs.client.api.hud.v1.HudElementType;
import io.github.fablabsmc.fablabs.client.api.hud.v1.HudManager;
import io.github.fablabsmc.fablabs.client.api.hud.v1.HudManagerAccess;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class HudManagerImpl implements HudManager {
	public static void registerRenderer() {
		assertEnabled();
		HudManagerAccess.registerHudManager(new HudManagerImpl());
		// TODO: Don't if needed
	}

	public static void assertEnabled() {
		// TODO: Fail if we are not the active hud manager
	}

	@Override
	public boolean isElementVisible(HudElementType element) {
		return false;
	}

	@Override
	public ElementRegistry getElementRegistry() {
		return null;
	}
}
