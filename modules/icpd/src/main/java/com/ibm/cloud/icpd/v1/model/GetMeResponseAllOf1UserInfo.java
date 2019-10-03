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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetMeResponseAllOf1UserInfo.
 */
public class GetMeResponseAllOf1UserInfo extends GenericModel {

  private String displayName;
  private String email;
  private List<String> permissions;
  private String role;
  private String uid;
  private String username;

  /**
   * Gets the displayName.
   *
   * User display name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the email.
   *
   * User email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the permissions.
   *
   * List of user permissions.
   *
   * @return the permissions
   */
  public List<String> getPermissions() {
    return permissions;
  }

  /**
   * Gets the role.
   *
   * User role.
   *
   * @return the role
   */
  public String getRole() {
    return role;
  }

  /**
   * Gets the uid.
   *
   * User ID.
   *
   * @return the uid
   */
  public String getUid() {
    return uid;
  }

  /**
   * Gets the username.
   *
   * User Name.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

