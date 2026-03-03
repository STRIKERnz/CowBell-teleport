package com.strikernz.tpreplacer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("cowbell")
public interface TpreplacerConfig extends Config
{
	@ConfigSection(
		name = "All",
		description = "Global override applied to all teleports unless overridden per-teleport",
		position = 0
	)
	String allSection = "all";

	@ConfigSection(name = "Per Teleport",
		description = "Per-teleport overrides. Set to 'None (Use Global)' to fall back to the global setting",
		position = 1)
	String perSection = "per";

	@ConfigSection(
		name = "Custom",
		description = "Advanced: set custom animation, graphic and sound IDs per teleport type when 'Custom' is selected. " +
			"Format: animationId,graphicId,soundId (e.g. 714,111,200). Use -1 to skip a field. " +
			"IDs can be found using the Identificator and Visual Sound plugins.",
		position = 2,
		closedByDefault = true
	)
	String customSection = "custom";

	// ---- Global ----

	@ConfigItem(
		keyName = "overrideAnimationType",
		name = "Override all",
		description = "The global teleport animation applied to all teleports",
		position = 0,
		section = allSection
	)
	default TeleportAnimation teleportAnimation()
	{
		return TeleportAnimation.COWBELL;
	}

	@ConfigItem(
		keyName = "muteTeleportSound",
		name = "Mute Teleport Sound",
		description = "Suppress the default teleport sound when the plugin replaces the animation",
		position = 1,
		section = allSection
	)
	default boolean muteTeleportSound()
	{
		return true;
	}

	// ---- Per Teleport ----

	@ConfigItem(keyName = "per_overrideNormal",       name = "Normal and jewellery", description = "Per-teleport animation (None uses global setting)", position = 0, section = perSection)
	default TeleportAnimation perOverrideNormal()       { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideAncient",      name = "Ancient",              description = "Per-teleport animation (None uses global setting)", position = 1, section = perSection)
	default TeleportAnimation perOverrideAncient()      { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideArceuus",      name = "Arceuus",              description = "Per-teleport animation (None uses global setting)", position = 2, section = perSection)
	default TeleportAnimation perOverrideArceuus()      { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideLunar",        name = "Lunar",                description = "Per-teleport animation (None uses global setting)", position = 3, section = perSection)
	default TeleportAnimation perOverrideLunar()        { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideTabs",         name = "Tabs",                 description = "Per-teleport animation (None uses global setting)", position = 4, section = perSection)
	default TeleportAnimation perOverrideTabs()         { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideScrolls",      name = "Scrolls",              description = "Per-teleport animation (None uses global setting)", position = 5, section = perSection)
	default TeleportAnimation perOverrideScrolls()      { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideEctophial",    name = "Ectophial",            description = "Per-teleport animation (None uses global setting)", position = 6, section = perSection)
	default TeleportAnimation perOverrideEctophial()    { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideArdougne",     name = "Ardougne Cape",        description = "Per-teleport animation (None uses global setting)", position = 7, section = perSection)
	default TeleportAnimation perOverrideArdougne()     { return TeleportAnimation.NONE; }

	@ConfigItem(keyName = "per_overrideDesertAmulet", name = "Desert Amulet",        description = "Per-teleport animation (None uses global setting)", position = 8, section = perSection)
	default TeleportAnimation perOverrideDesertAmulet() { return TeleportAnimation.NONE; }

	// ---- Custom IDs (animId,gfxId,soundId) ----

	@ConfigItem(keyName = "custom_normal",       name = "Normal / Jewellery", description = "animId,gfxId,soundId — e.g. 714,111,200. Use -1 to skip.", position = 0, section = customSection)
	default String customNormal()       { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_ancient",      name = "Ancient",            description = "animId,gfxId,soundId — e.g. 1979,392,197. Use -1 to skip.", position = 1, section = customSection)
	default String customAncient()      { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_arceuus",      name = "Arceuus",            description = "animId,gfxId,soundId — e.g. 3865,1296,200. Use -1 to skip.", position = 2, section = customSection)
	default String customArceuus()      { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_lunar",        name = "Lunar",              description = "animId,gfxId,soundId — e.g. 1816,747,200. Use -1 to skip.", position = 3, section = customSection)
	default String customLunar()        { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_tabs",         name = "Tabs",               description = "animId,gfxId,soundId — e.g. 4071,678,965. Use -1 to skip.", position = 4, section = customSection)
	default String customTabs()         { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_scrolls",      name = "Scrolls",            description = "animId,gfxId,soundId — e.g. 3864,111,200. Use -1 to skip.", position = 5, section = customSection)
	default String customScrolls()      { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_ectophial",    name = "Ectophial",          description = "animId,gfxId,soundId — e.g. 878,1273,2401. Use -1 to skip.", position = 6, section = customSection)
	default String customEctophial()    { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_ardougne",     name = "Ardougne Cape",      description = "animId,gfxId,soundId — e.g. 3872,1237,200. Use -1 to skip.", position = 7, section = customSection)
	default String customArdougne()     { return "-1,-1,-1"; }

	@ConfigItem(keyName = "custom_desertAmulet", name = "Desert Amulet",      description = "animId,gfxId,soundId — e.g. 9606,284,200. Use -1 to skip.", position = 8, section = customSection)
	default String customDesertAmulet() { return "-1,-1,-1"; }
}
