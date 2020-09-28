package io.github.fablabsmc.fablabs.client.api.hud.v1;

import java.util.function.Supplier;

import net.minecraft.util.Identifier;

public interface HudManager {
	boolean isElementVisible(HudElementType element);

	ElementRegistry getElementRegistry();

	interface ElementRegistry {
		HudElementType register(Identifier id, Supplier<HudElement> elementFactory);

		/* @Nullable */
		HudElementType get(Identifier id);
	}
}
