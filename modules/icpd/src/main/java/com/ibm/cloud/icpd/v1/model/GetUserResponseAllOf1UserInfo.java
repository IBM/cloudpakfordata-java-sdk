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
 * GetUserResponseAllOf1UserInfo.
 */
public class GetUserResponseAllOf1UserInfo extends GenericModel {

  @SerializedName("approval_status")
  private String approvalStatus;
  private String authenticator;
  @SerializedName("created_timestamp")
  private String createdTimestamp;
  @SerializedName("current_account_status")
  private String currentAccountStatus;
  private String displayName;
  private String email;
  @SerializedName("first_failed_attempt_timestamp")
  private String firstFailedAttemptTimestamp;
  @SerializedName("last_modified_timestamp")
  private String lastModifiedTimestamp;
  private List<String> permissions;
  @SerializedName("recent_number_of_failed_attempts")
  private Double recentNumberOfFailedAttempts;
  @SerializedName("release_lock_at_timestamp")
  private String releaseLockAtTimestamp;
  private String role;
  private String uid;
  @SerializedName("user_roles")
  private List<String> userRoles;
  private String username;

  /**
   * Gets the approvalStatus.
   *
   * Approval status of user.
   *
   * @return the approvalStatus
   */
  public String getApprovalStatus() {
    return approvalStatus;
  }

  /**
   * Gets the authenticator.
   *
   * User authenticator.
   *
   * @return the authenticator
   */
  public String getAuthenticator() {
    return authenticator;
  }

  /**
   * Gets the createdTimestamp.
   *
   * Timestamp of creation.
   *
   * @return the createdTimestamp
   */
  public String getCreatedTimestamp() {
    return createdTimestamp;
  }

  /**
   * Gets the currentAccountStatus.
   *
   * User current account status.
   *
   * @return the currentAccountStatus
   */
  public String getCurrentAccountStatus() {
    return currentAccountStatus;
  }

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
   * Gets the firstFailedAttemptTimestamp.
   *
   * Timestamp of first failed attempt.
   *
   * @return the firstFailedAttemptTimestamp
   */
  public String getFirstFailedAttemptTimestamp() {
    return firstFailedAttemptTimestamp;
  }

  /**
   * Gets the lastModifiedTimestamp.
   *
   * Timestamp of last modification.
   *
   * @return the lastModifiedTimestamp
   */
  public String getLastModifiedTimestamp() {
    return lastModifiedTimestamp;
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
   * Gets the recentNumberOfFailedAttempts.
   *
   * Recent number of failed attempts.
   *
   * @return the recentNumberOfFailedAttempts
   */
  public Double getRecentNumberOfFailedAttempts() {
    return recentNumberOfFailedAttempts;
  }

  /**
   * Gets the releaseLockAtTimestamp.
   *
   * Release lock at timestamp.
   *
   * @return the releaseLockAtTimestamp
   */
  public String getReleaseLockAtTimestamp() {
    return releaseLockAtTimestamp;
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
   * Gets the userRoles.
   *
   * List of user roles.
   *
   * @return the userRoles
   */
  public List<String> getUserRoles() {
    return userRoles;
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

