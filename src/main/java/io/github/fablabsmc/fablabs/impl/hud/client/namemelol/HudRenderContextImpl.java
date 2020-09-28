package io.github.fablabsmc.fablabs.impl.hud.client.namemelol;

import io.github.fablabsmc.fablabs.client.api.hud.v1.HudElementType;
import io.github.fablabsmc.fablabs.client.api.hud.v1.HudRenderContext;

public final class HudRenderContextImpl implements HudRenderContext {
	@Override
	public int getLiteralXPosition() {
		return 0;
	}

	@Override
	public int getLiteralYPosition() {
		return 0;
	}

	@Override
	public boolean isElementEnabled(HudElementType element) {
		return false;
	}
}
