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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetRoleResponseAllOf1RoleInfo.
 */
public class GetRoleResponseAllOf1RoleInfo extends GenericModel {

  private String ID;
  private String description;
  private List<String> permissions;
  @SerializedName("role_name")
  private String roleName;

  /**
   * Gets the ID.
   *
   * Role ID.
   *
   * @return the ID
   */
  public String getID() {
    return ID;
  }

  /**
   * Gets the description.
   *
   * Role description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the permissions.
   *
   * List of role permissions.
   *
   * @return the permissions
   */
  public List<String> getPermissions() {
    return permissions;
  }

  /**
   * Gets the roleName.
   *
   * Role name.
   *
   * @return the roleName
   */
  public String getRoleName() {
    return roleName;
  }
}

