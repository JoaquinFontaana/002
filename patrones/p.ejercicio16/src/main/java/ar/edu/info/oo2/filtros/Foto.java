package ar.edu.info.oo2.filtros;

import java.awt.image.BufferedImage;

public class Foto implements IFoto {
    @Override
    public BufferedImage displayImage(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        newImage.getGraphics().drawImage(image, 0, 0, null);
        return newImage;
    }

}
