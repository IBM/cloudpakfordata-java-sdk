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
 * The changePassword options.
 */
public class ChangePasswordOptions extends GenericModel {

  private String password;

  /**
   * Builder.
   */
  public static class Builder {
    private String password;

    private Builder(ChangePasswordOptions changePasswordOptions) {
      this.password = changePasswordOptions.password;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param password the password
     */
    public Builder(String password) {
      this.password = password;
    }

    /**
     * Builds a ChangePasswordOptions.
     *
     * @return the changePasswordOptions
     */
    public ChangePasswordOptions build() {
      return new ChangePasswordOptions(this);
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the ChangePasswordOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }

  private ChangePasswordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    password = builder.password;
  }

  /**
   * New builder.
   *
   * @return a ChangePasswordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the password.
   *
   * New Password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }
}

