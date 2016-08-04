package me.ramanvesh.core.model;

import org.lombok.Getter;

/**
 * Created by ram.kasam on 04/08/16.
 *
 * @author ram.kasam
 */
public class FilmScript implements Script {
  @Getter
  private String name;

  @Getter
  private Entity parent;

}
