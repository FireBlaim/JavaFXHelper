package fr.fireblaim.resourceloaderfx.loaders;

import fr.fireblaim.resourceloaderfx.ResourceLoaderFX;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class FontLoader {

    public static Font loadFont(String path, String fontName, float size, boolean isItalic) {
        Font.loadFont(FontLoader.class.getResourceAsStream(ResourceLoaderFX.getResourceLocation() + path), 12);
        return isItalic ? Font.font(fontName, FontPosture.ITALIC, size) : Font.font(fontName, size);
    }

}
