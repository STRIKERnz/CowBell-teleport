package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("cowbell")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "enabled",
		name = "Enable Cowbell Teleport",
		description = "Replace teleport animations with cowbell amulet animation"
	)
	default boolean enabled()
	{
		return true;
	}

	@ConfigItem(
		keyName = "cowbellAnimationId",
		name = "Cowbell Animation ID",
		description = "Animation ID to use for cowbell teleport replacement"
	)
	default int cowbellAnimationId()
	{
		return AnimationConstants.COWBELL_TELEPORT;
	}

	@ConfigItem(
		keyName = "showTeleportGraphic",
		name = "Show teleport graphic (milk)",
		description = "Show the teleport graphic (like the milk splash) when replacing the animation"
	)
	default boolean showTeleportGraphic()
	{
		return true;
	}

	@ConfigItem(
		keyName = "cowbellGraphicId",
		name = "Cowbell Graphic ID",
		description = "Spot animation / graphic ID to show when replacing teleport (milk splash)"
	)
	default int cowbellGraphicId()
	{
		// Use the actual in-game splash ID discovered: 3603
		return 3603;
	}

	// Group toggles so users can pick which teleport types to override
	@ConfigItem(
		keyName = "overrideNormal",
		name = "Override Normal Teleports",
		description = "Replace normal spellbook teleport animations (home, varrock, lumbridge, etc.)"

	)
	default boolean overrideModern()
	{
		return true;
	}

	@ConfigItem(
		keyName = "overrideAncient",
		name = "Override Ancient Spellbook Teleports",
		description = "Replace ancient spellbook teleport animations"
	)
	default boolean overrideAncient()
	{
		return true;
	}

	@ConfigItem(
		keyName = "overrideArceuus",
		name = "Override Arceuus Teleports",
		description = "Replace Arceuus spellbook teleport animations"
	)
	default boolean overrideArceuus()
	{
		return true;
	}

	@ConfigItem(
		keyName = "overrideLunar",
		name = "Override Lunar Teleports",
		description = "Replace Lunar spellbook teleport animations"
	)
	default boolean overrideLunar()
	{
		return true;
	}

	@ConfigItem(
		keyName = "overrideJewellery",
		name = "Override Jewellery Teleports",
		description = "Replace ring/amulet/jewellery teleport animations"
	)
	default boolean overrideJewellery()
	{
		return true;
	}

	@ConfigItem(
		keyName = "overrideTabs",
		name = "Override Teleport Tabs",
		description = "Replace teleport tab animations"
	)
	default boolean overrideTabs()
	{
		return true;
	}

	@ConfigItem(
		keyName = "muteTeleportSound",
		name = "Mute Teleport Sound",
		description = "Suppress the teleport sound when the plugin replaces the animation"
	)
	default boolean muteTeleportSound()
	{
		return true;
	}
}
