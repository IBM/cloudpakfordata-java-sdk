/*
 * (C) Copyright IBM Corp. 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.icpd.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createRole options.
 */
public class CreateRoleOptions extends GenericModel {

  private String description;
  private List<String> permissions;
  private String roleName;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private List<String> permissions;
    private String roleName;

    private Builder(CreateRoleOptions createRoleOptions) {
      this.description = createRoleOptions.description;
      this.permissions = createRoleOptions.permissions;
      this.roleName = createRoleOptions.roleName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateRoleOptions.
     *
     * @return the createRoleOptions
     */
    public CreateRoleOptions build() {
      return new CreateRoleOptions(this);
    }

    /**
     * Adds an permissions to permissions.
     *
     * @param permissions the new permissions
     * @return the CreateRoleOptions builder
     */
    public Builder addPermissions(String permissions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(permissions,
        "permissions cannot be null");
      if (this.permissions == null) {
        this.permissions = new ArrayList<String>();
      }
      this.permissions.add(permissions);
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateRoleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the permissions.
     * Existing permissions will be replaced.
     *
     * @param permissions the permissions
     * @return the CreateRoleOptions builder
     */
    public Builder permissions(List<String> permissions) {
      this.permissions = permissions;
      return this;
    }

    /**
     * Set the roleName.
     *
     * @param roleName the roleName
     * @return the CreateRoleOptions builder
     */
    public Builder roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }
  }

  private CreateRoleOptions(Builder builder) {
    description = builder.description;
    permissions = builder.permissions;
    roleName = builder.roleName;
  }

  /**
   * New builder.
   *
   * @return a CreateRoleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * Role description e.g. Administrator role.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the permissions.
   *
   * List of permissions e.g. administrator.
   *
   * @return the permissions
   */
  public List<String> permissions() {
    return permissions;
  }

  /**
   * Gets the roleName.
   *
   * Role name e.g. admin.
   *
   * @return the roleName
   */
  public String roleName() {
    return roleName;
  }
}

