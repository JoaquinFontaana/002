package ar.edu.info.oo2.filtros;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import ar.edu.info.oo2.filtros.imageFilters.*;

public class PNGFilterLauncher{
  private static IFoto filteredImagen;
  private static File inputFile;
  private static File outputFile;
  private static Map<String, FilterDecorator> filters = new HashMap<>();
  private static ArrayList<FilterDecorator> activeFilterDecorators = new ArrayList<>();

  public static void main(String args[]) {
    filteredImagen = new Foto();
    // Initialize the list of filers
    PNGFilterLauncher.initializeFilters();

    // Process the arguments
    if (args.length < 2) {
      System.out.println("Usage: java Main input-file output-file [--filter]");
      return;
    }
    PNGFilterLauncher.processArgs(args);

    // Read the image file
    BufferedImage image;
    try {
      image = ImageIO.read(inputFile);
    } catch(IOException exception) {
      System.err.println("Unable to read file: " + inputFile + "\n" + exception);
      return;
    }

    //aplicar filtros  a la imagen
    activeFilterDecorators.forEach(filterDecorator -> {
            filterDecorator.setComponent(filteredImagen);
            filteredImagen = filterDecorator;
    });

    image = filteredImagen.displayImage(image);

    // Write the image file
    try {
      ImageIO.write(image, "png", outputFile);
    } catch(IOException exception) {
      System.err.println("Unable to write file: " + outputFile + "\n" + exception);
      return;
    }
  }

  static void processArgs(String args[]) {
    // Get the input and output file values
    inputFile = new File(args[0]);
    outputFile = new File(args[1]);

    for (int i = 2; i < args.length; i++) {
      FilterDecorator filterDecorator = filters.get(args[i]);
      if (filterDecorator == null) {
        System.out.println("No filter matches '" + args[i] + "'");
      } else {
        activeFilterDecorators.add(filterDecorator);
      }
    }
  }

  static void initializeFilters() {
    filters.put("--rainbow", new Rainbow());
    filters.put("--artifacter", new Artifacter());
    filters.put("--rgb-shifter", new RGBShifter());
    filters.put("--repeater", new Repeater());
    filters.put("--rgb-shift-repeater", new RGBShiftRepeater());
    filters.put("--none", new Dull());
  }
}
