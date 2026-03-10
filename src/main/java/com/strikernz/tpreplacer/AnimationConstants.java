package com.strikernz.tpreplacer;

import java.util.HashSet;
import java.util.Set;

/**
 * Animation, graphic, and sound-effect IDs for all supported teleport types.
 */
public final class AnimationConstants
{
	public static final int COWBELL_TELEPORT = 13811;
	public static final int COWBELL_TELEPORT_GRAPHIC = 3603;
	public static final int COWBELL_ARRIVAL_SOUND = 11286;

	public static final int STANDARD_AND_JEWELLERY_TELEPORT = 714;
	public static final int STANDARD_TELEPORT_GRAPHIC = 111;
	public static final int STANDARD_TELEPORT_SOUND = 200;

	public static final int ANCIENT_TELEPORT = 1979;
	public static final int ANCIENT_TELEPORT_GRAPHIC = 392;
	public static final int ANCIENT_TELEPORT_SOUND = 197;

	public static final int ARCEUUS_TELEPORT = 3865;
	public static final int ARCEUUS_TELEPORT_GRAPHIC = 1296;
	public static final int ARCEUUS_TELEPORT_SOUND = 200;

	public static final int LUNAR_TELEPORT = 1816;
	public static final int LUNAR_TELEPORT_GRAPHIC = 747;
	public static final int LUNAR_TELEPORT_SOUND = 200;

	public static final int TAB_TELEPORT = 4071;
	public static final int TAB_TELEPORT_GRAPHIC = 678;
	public static final int TAB_TELEPORT_SOUND = 965;

	public static final int TELEPORT_SCROLLS = 3864;
	public static final int TELEPORT_SCROLLS_GRAPHIC = 111;
	public static final int TELEPORT_SCROLLS_SOUND = 200;

	public static final int ECTOPHIAL_TELEPORT = 878;
	public static final int ECTOPHIAL_TELEPORT_GRAPHIC = 1273;
	public static final int ECTOPHIAL_TELEPORT_SOUND = 2401;

	public static final int ARDOUGNE_TELEPORT = 3872;
	public static final int ARDOUGNE_TELEPORT_GRAPHIC = 1237;
	public static final int ARDOUGNE_TELEPORT_SOUND = 200;

	public static final int DESERT_AMULET_TELEPORT = 9606;
	public static final int DESERT_AMULET_TELEPORT_GRAPHIC = 284;
	public static final int DESERT_AMULET_TELEPORT_SOUND = 200;

	public static final int GIANTSOUL_AMULET_TELEPORT = 12016;
	public static final int GIANTSOUL_AMULET_TELEPORT_GRAPHIC = 3226;
	public static final int GIANTSOUL_AMULET_TELEPORT_SOUND = 10193;

	/**
	 * All known teleport animation IDs. This set is built from constants in this
	 * class rather than referencing {@link TeleportAnimation} to avoid a circular
	 * static-initialisation dependency that would cause a NullPointerException.
	 */
	private static final Set<Integer> TELEPORT_ANIMATION_IDS = new HashSet<>();

	static
	{
		TELEPORT_ANIMATION_IDS.add(COWBELL_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(STANDARD_AND_JEWELLERY_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(ANCIENT_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(ARCEUUS_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(LUNAR_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(TAB_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(TELEPORT_SCROLLS);
		TELEPORT_ANIMATION_IDS.add(ECTOPHIAL_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(ARDOUGNE_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(DESERT_AMULET_TELEPORT);
		TELEPORT_ANIMATION_IDS.add(GIANTSOUL_AMULET_TELEPORT);
	}

	private AnimationConstants() {}

	public static boolean isTeleportAnimation(int animationId)
	{
		return TELEPORT_ANIMATION_IDS.contains(animationId);
	}
}
