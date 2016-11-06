package mod.commands;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

public class CommandMCrafterzzMod extends CommandBase {

	public CommandMCrafterzzMod() {

	}

	@Override
	public String getCommandName() {
		return "mcrafterzzmod";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "mcrafterzzmod";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;
			Style red = new Style().setColor(TextFormatting.DARK_RED);
			Style green = new Style().setColor(TextFormatting.DARK_GREEN);
			Style blue = new Style().setColor(TextFormatting.DARK_BLUE);
			Style aqua = new Style().setColor(TextFormatting.DARK_AQUA);
			Style purple = new Style().setColor(TextFormatting.DARK_PURPLE);
			Style yellow = new Style().setColor(TextFormatting.YELLOW);
			player.addChatComponentMessage(new TextComponentTranslation("commands.mm.name").setStyle(red));
			player.addChatComponentMessage(new TextComponentTranslation("commands.mm.modid").setStyle(green));
			player.addChatComponentMessage(new TextComponentTranslation("commands.mm.version").setStyle(blue));
			player.addChatComponentMessage(new TextComponentTranslation("commands.mm.minecraftversion").setStyle(aqua));
			player.addChatComponentMessage(new TextComponentTranslation("commands.mm.creator").setStyle(purple));
			player.addChatComponentMessage(new TextComponentTranslation("commands.mm.updatepage").setStyle(yellow));
		}
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos pos) {
		return null;
	}

}
