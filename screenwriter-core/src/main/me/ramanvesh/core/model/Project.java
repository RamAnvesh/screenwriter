package me.ramanvesh.core.model;

import java.util.Collection;

/**
 * Created by ram.kasam on 04/08/16.
 *
 * @author ram.kasam
 */
public interface Project extends Entity{

  String getName();

  ProjectMetadata getProjectInfo();

  Permissions getProjectPermissions();

  Collection<Entity> getEntities();
}
