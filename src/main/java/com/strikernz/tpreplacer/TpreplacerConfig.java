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
		description = "Global override settings applied when per-teleport is set to Default",
		position = 0
	)
	String allSection = "all";

	// Single collapsible section for all per-teleport overrides so they can be collapsed together
	@ConfigSection(name = "Per Teleport",
		description = "Per-teleport override settings. Set to 'Default' to use the global setting",
		position = 1)
	String perSection = "per";

	@ConfigItem(
		keyName = "overrideAnimationType",
		name = "Override all",
		description = "Select which teleport animation to use when overriding teleports",
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

	// Per-teleport configuration. DEFAULT means use the global setting above. All are in the single perSection
	@ConfigItem(
		keyName = "per_overrideNormal",
		name = "Normal and jewellery",
		description = "Per-teleport animation for normal teleports (Default uses global setting)",
		position = 0,
		section = perSection
	)
	default TeleportAnimation perOverrideNormal() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideAncient",
		name = "Ancient",
		description = "Per-teleport animation for ancient teleports (Default uses global setting)",
		position = 1,
		section = perSection
	)
	default TeleportAnimation perOverrideAncient() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideArceuus",
		name = "Arceuus",
		description = "Per-teleport animation for arceuus teleports (Default uses global setting)",
		position = 2,
		section = perSection
	)
	default TeleportAnimation perOverrideArceuus() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideLunar",
		name = "Lunar",
		description = "Per-teleport animation for lunar teleports (Default uses global setting)",
		position = 3,
		section = perSection
	)
	default TeleportAnimation perOverrideLunar() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideTabs",
		name = "Tabs",
		description = "Per-teleport animation for teleport tabs (Default uses global setting)",
		position = 4,
		section = perSection
	)
	default TeleportAnimation perOverrideTabs() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideScrolls",
		name = "Scrolls",
		description = "Per-teleport animation for teleport scrolls (Default uses global setting)",
		position = 5,
		section = perSection
	)
	default TeleportAnimation perOverrideScrolls() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideEctophial",
		name = "Ectophial",
		description = "Per-teleport animation for ectophial teleports (Default uses global setting)",
		position = 6,
		section = perSection
	)
	default TeleportAnimation perOverrideEctophial() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideArdougne",
		name = "Ardougne Cape",
		description = "Per-teleport animation for ardougne teleports (Default uses global setting)",
		position = 7,
		section = perSection
	)
	default TeleportAnimation perOverrideArdougne() { return TeleportAnimation.DEFAULT; }

	@ConfigItem(
		keyName = "per_overrideDesertAmulet",
		name = "Desert Amulet",
		description = "Per-teleport animation for desert amulet teleports (Default uses global setting)",
		position = 8,
		section = perSection
	)
	default TeleportAnimation perOverrideDesertAmulet() { return TeleportAnimation.DEFAULT; }
}
