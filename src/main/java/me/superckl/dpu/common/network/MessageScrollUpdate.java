package me.superckl.dpu.common.network;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.superckl.dpu.common.utlilty.LogHelper;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

@AllArgsConstructor
public class MessageScrollUpdate implements IMessage{

	@Getter
	@Setter
	private float scroll;

	public MessageScrollUpdate() {}

	@Override
	public void fromBytes(final ByteBuf buf) {
		LogHelper.info("Reading float");
		this.scroll = buf.readFloat();
	}

	@Override
	public void toBytes(final ByteBuf buf) {
		LogHelper.info("writing "+this.scroll);
		buf.writeFloat(this.scroll);
	}

}
