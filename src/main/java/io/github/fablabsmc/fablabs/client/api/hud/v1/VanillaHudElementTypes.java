package io.github.fablabsmc.fablabs.client.api.hud.v1;

import net.minecraft.util.Identifier;

/**
 * An enumeration of all vanilla hud element types.
 */
public final class VanillaHudElementTypes {
	public static final HudElementType SUBTITLES = of("subtitles");

	private static HudElementType of(String id) {
		return HudManagerAccess.getElementRegistry().get(new Identifier(id));
	}

	private VanillaHudElementTypes() {
	}
}
