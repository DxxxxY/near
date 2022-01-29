package studio.dreamys.module.render;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import studio.dreamys.module.Category;
import studio.dreamys.module.Module;
import studio.dreamys.near;

import java.io.IOException;

public class ClickGUI extends Module {

    public ClickGUI() {
        super("ClickGUI", Category.HUD);
        setKey(Keyboard.KEY_RSHIFT);
    }

    @Override
    public void onEnable() throws IOException {
        Minecraft.getMinecraft().displayGuiScreen(near.clickGUI);
        setToggled(false);
    }
}
