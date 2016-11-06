package mod.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mod.Main;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGui extends GuiConfig {

	public ConfigGui(GuiScreen parent) {
		super(parent,
				getConfigElements(),
				"mm", false, false, "MCrafterzz Mod Config");
	}

	private static List<IConfigElement> getConfigElements() {
		return Config.config.getCategoryNames().stream()
				.map(categoryName -> new ConfigElement(Config.config.getCategory(categoryName)))
				.collect(Collectors.toList());
	}

}
