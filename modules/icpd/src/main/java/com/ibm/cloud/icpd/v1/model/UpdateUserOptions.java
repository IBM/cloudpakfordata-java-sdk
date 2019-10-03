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
 * The updateUser options.
 */
public class UpdateUserOptions extends GenericModel {

  private String userName;
  private String approvalStatus;
  private String displayName;
  private String email;
  private List<String> userRoles;

  /**
   * Builder.
   */
  public static class Builder {
    private String userName;
    private String approvalStatus;
    private String displayName;
    private String email;
    private List<String> userRoles;

    private Builder(UpdateUserOptions updateUserOptions) {
      this.userName = updateUserOptions.userName;
      this.approvalStatus = updateUserOptions.approvalStatus;
      this.displayName = updateUserOptions.displayName;
      this.email = updateUserOptions.email;
      this.userRoles = updateUserOptions.userRoles;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param userName the userName
     */
    public Builder(String userName) {
      this.userName = userName;
    }

    /**
     * Builds a UpdateUserOptions.
     *
     * @return the updateUserOptions
     */
    public UpdateUserOptions build() {
      return new UpdateUserOptions(this);
    }

    /**
     * Adds an userRoles to userRoles.
     *
     * @param userRoles the new userRoles
     * @return the UpdateUserOptions builder
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
     * Set the userName.
     *
     * @param userName the userName
     * @return the UpdateUserOptions builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    /**
     * Set the approvalStatus.
     *
     * @param approvalStatus the approvalStatus
     * @return the UpdateUserOptions builder
     */
    public Builder approvalStatus(String approvalStatus) {
      this.approvalStatus = approvalStatus;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the UpdateUserOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the email.
     *
     * @param email the email
     * @return the UpdateUserOptions builder
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Set the userRoles.
     * Existing userRoles will be replaced.
     *
     * @param userRoles the userRoles
     * @return the UpdateUserOptions builder
     */
    public Builder userRoles(List<String> userRoles) {
      this.userRoles = userRoles;
      return this;
    }
  }

  private UpdateUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.userName,
      "userName cannot be empty");
    userName = builder.userName;
    approvalStatus = builder.approvalStatus;
    displayName = builder.displayName;
    email = builder.email;
    userRoles = builder.userRoles;
  }

  /**
   * New builder.
   *
   * @return a UpdateUserOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the userName.
   *
   * User name.
   *
   * @return the userName
   */
  public String userName() {
    return userName;
  }

  /**
   * Gets the approvalStatus.
   *
   * Approval status for the user, can be either 'pending' or 'approved'.
   *
   * @return the approvalStatus
   */
  public String approvalStatus() {
    return approvalStatus;
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

