/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.strona.wirtualny_swiat.game.mechanics.plants;

import java.awt.Image;
import java.awt.Point;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import pl.strona.wirtualny_swiat.game.mechanics.Organism;
import pl.strona.wirtualny_swiat.game.mechanics.Plant;
import pl.strona.wirtualny_swiat.game.mechanics.World;

/**
 *
 * @author SaySaeqo
 */
public class SowThistle extends Plant{
  
  public SowThistle(World world, Point position){
    super(world, 0, position);
  }
  
  @Override
  public Image getImage() throws IOException{
    try{
      URL url = getClass().getResource("/sowthistle.png");
      if(url == null)
        throw new IOException();
      return ImageIO.read(url);
    }
    catch (IOException e){
      throw e;
    }
  }

  @Override
  public Organism makeChild() {
    return new SowThistle(getWorld(), getPosition());
  }
  
  @Override
  public Point action(String string){
    super.action(string);
    super.action(string);
    return super.action(string);
  }
  
}
