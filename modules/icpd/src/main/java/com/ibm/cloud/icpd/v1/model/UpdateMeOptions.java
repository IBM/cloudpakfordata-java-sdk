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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateMe options.
 */
public class UpdateMeOptions extends GenericModel {

  private String displayName;
  private String email;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String email;

    private Builder(UpdateMeOptions updateMeOptions) {
      this.displayName = updateMeOptions.displayName;
      this.email = updateMeOptions.email;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateMeOptions.
     *
     * @return the updateMeOptions
     */
    public UpdateMeOptions build() {
      return new UpdateMeOptions(this);
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the UpdateMeOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the email.
     *
     * @param email the email
     * @return the UpdateMeOptions builder
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }
  }

  private UpdateMeOptions(Builder builder) {
    displayName = builder.displayName;
    email = builder.email;
  }

  /**
   * New builder.
   *
   * @return a UpdateMeOptions builder
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
}

