package io.github.fablabsmc.fablabs.client.api.hud.v1;

import java.util.Collections;
import java.util.Set;

import io.github.fablabsmc.fablabs.client.api.hud.v1.util.Cuboid;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

/**
 * Represents a unique element on the in game hud.
 *
 * The hud element abstraction is designed to allow developers to not need to worry about positioning an element on the in game hud.
 */
public interface HudElement {
	/**
	 * @return the type literal which represents this instance of the hud element.
	 */
	HudElementType getType();

	/**
	 * Gets a set of cuboids which represent the size of the element.
	 *
	 * @param client the minecraft client
	 * @param delta the delta
	 * @return a set of cuboids to represent the size of the element
	 */
	Set<Cuboid> getElementShapes(MinecraftClient client, float delta);

	/**
	 * Checks whether this element wishes to be rendered.
	 * Note the return value of this method does not guarantee the element will be rendered.
	 * Rather this method lets the {@link HudManager hud manager} know whether the element wishes to be rendered.
	 * Whether the element is actually rendered is up to the implementation of the {@link HudManager hud manager}.
	 * If the element does not wish to be rendered, the hud manager will not render the element.
	 *
	 * @param client the client
	 * @return whether the element wishes to be rendered
	 */
	boolean requestsRender(MinecraftClient client);

	/**
	 * Renders this hud element.
	 * When this method is called, the hud element may be rendered.
	 *
	 * <p>Information such as the location on screen the element should be rendered at is present on the {@code context}.
	 *
	 * @param client the minecraft client the hud element is being rendered with
	 * @param context the render context, used to obtain more information about how and where the element should be rendered.
	 * @param matrices the matrices
	 * @param delta the delta
	 */
	void render(MinecraftClient client, HudRenderContext context, MatrixStack matrices, float delta);

	/**
	 * A simple hud element which has the shape of a single cuboid.
	 */
	interface Simple extends HudElement {
		// Not meant to be overridden
		@Override
		@Deprecated(/* forRemoval = false */)
		default Set<Cuboid> getElementShapes(MinecraftClient client, float delta) {
			return Collections.singleton(this.getShape(client, delta));
		}

		/**
		 * Gets a cuboid which represents size of this element.
		 *
		 * @param client the client
		 * @param delta the delta
		 * @return a cuboid representing the size of this element
		 */
		Cuboid getShape(MinecraftClient client, float delta);
	}
}
