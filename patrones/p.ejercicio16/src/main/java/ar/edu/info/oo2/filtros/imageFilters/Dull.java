package ar.edu.info.oo2.filtros.imageFilters;

import ar.edu.info.oo2.filtros.IFoto;

import java.awt.image.BufferedImage;

public class Dull extends FilterDecorator {

  public BufferedImage filter(BufferedImage image) {
    return image;
  }


}
