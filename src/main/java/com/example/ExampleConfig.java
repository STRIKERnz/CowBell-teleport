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
