package io.github.fablabsmc.fablabs.client.api.hud.v1;

public interface HudRenderContext {
	int getLiteralXPosition();

	int getLiteralYPosition();

	boolean isElementEnabled(HudElementType element);
}
