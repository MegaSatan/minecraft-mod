package mod.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import scala.Int;

public class CommandTpDimension extends CommandBase {

	public CommandTpDimension() {

	}

	@Override
	public int getRequiredPermissionLevel() {
		return 2;
	}

	@Override
	public String getCommandName() {
		return "tpdimension";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "commands.tpdimension.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		EntityPlayerMP player = (EntityPlayerMP) sender.getCommandSenderEntity();
		Entity entity = sender.getCommandSenderEntity();
		int i = 0;
		if (args.length < 1) {
			throw new WrongUsageException("commands.tpdimension.usage", new Object[0]);
		}
		if (args.length < i + 1) {
			throw new WrongUsageException("commands.tpdimension.usage", new Object[0]);
		}
		if (entity.worldObj != null) {
			if (args.length > 1) {
				int j = parseInt(args[1]);
				player.mcServer.getPlayerList().transferPlayerToDimension(player, j,
						new Teleporter(player.mcServer.worldServerForDimension(j)));
				notifyCommandListener(sender, this, "commands.tpdimension.success",
						new Object[] { Integer.valueOf(i) });
			} else {
				int j = parseInt(args[0]);
				player.mcServer.getPlayerList().transferPlayerToDimension(player, j,
						new Teleporter(player.mcServer.worldServerForDimension(j)));
				notifyCommandListener(sender, this, "commands.tpdimension.success",
						new Object[] { Integer.valueOf(i) });
			}
		}
	}

}
