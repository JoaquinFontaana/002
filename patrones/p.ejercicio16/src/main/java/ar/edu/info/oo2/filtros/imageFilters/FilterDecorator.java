package ar.edu.info.oo2.filtros.imageFilters;

import ar.edu.info.oo2.filtros.IFoto;

import java.awt.image.BufferedImage;

public abstract class FilterDecorator implements IFoto {
  private IFoto component;

  public FilterDecorator() {

  }

  @Override
  public BufferedImage displayImage(BufferedImage image) {
    image = component.displayImage(image);
    return this.filter(image);
  }

  public void setComponent(IFoto component){
    this.component = component;
  }

  abstract public BufferedImage filter(BufferedImage image);

}
