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
 * The createUser options.
 */
public class CreateUserOptions extends GenericModel {

  private String displayName;
  private String email;
  private String userName;
  private List<String> userRoles;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String email;
    private String userName;
    private List<String> userRoles;

    private Builder(CreateUserOptions createUserOptions) {
      this.displayName = createUserOptions.displayName;
      this.email = createUserOptions.email;
      this.userName = createUserOptions.userName;
      this.userRoles = createUserOptions.userRoles;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateUserOptions.
     *
     * @return the createUserOptions
     */
    public CreateUserOptions build() {
      return new CreateUserOptions(this);
    }

    /**
     * Adds an userRoles to userRoles.
     *
     * @param userRoles the new userRoles
     * @return the CreateUserOptions builder
     */
    public Builder addUserRoles(String userRoles) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(userRoles,
        "userRoles cannot be null");
      if (this.userRoles == null) {
        this.userRoles = new ArrayList<String>();
      }
      this.userRoles.add(userRoles);
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateUserOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the email.
     *
     * @param email the email
     * @return the CreateUserOptions builder
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Set the userName.
     *
     * @param userName the userName
     * @return the CreateUserOptions builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    /**
     * Set the userRoles.
     * Existing userRoles will be replaced.
     *
     * @param userRoles the userRoles
     * @return the CreateUserOptions builder
     */
    public Builder userRoles(List<String> userRoles) {
      this.userRoles = userRoles;
      return this;
    }
  }

  private CreateUserOptions(Builder builder) {
    displayName = builder.displayName;
    email = builder.email;
    userName = builder.userName;
    userRoles = builder.userRoles;
  }

  /**
   * New builder.
   *
   * @return a CreateUserOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * Display Name for the user e.g. Admin.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the email.
   *
   * Email for the user e.g. admin@user.net.
   *
   * @return the email
   */
  public String email() {
    return email;
  }

  /**
   * Gets the userName.
   *
   * User name e.g. admin.
   *
   * @return the userName
   */
  public String userName() {
    return userName;
  }

  /**
   * Gets the userRoles.
   *
   * List of user roles.
   *
   * @return the userRoles
   */
  public List<String> userRoles() {
    return userRoles;
  }
}

