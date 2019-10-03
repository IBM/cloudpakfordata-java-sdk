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
 * The getAuthorizationToken options.
 */
public class GetAuthorizationTokenOptions extends GenericModel {

  private String password;
  private String username;

  /**
   * Builder.
   */
  public static class Builder {
    private String password;
    private String username;

    private Builder(GetAuthorizationTokenOptions getAuthorizationTokenOptions) {
      this.password = getAuthorizationTokenOptions.password;
      this.username = getAuthorizationTokenOptions.username;
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
     * @param username the username
     */
    public Builder(String password, String username) {
      this.password = password;
      this.username = username;
    }

    /**
     * Builds a GetAuthorizationTokenOptions.
     *
     * @return the getAuthorizationTokenOptions
     */
    public GetAuthorizationTokenOptions build() {
      return new GetAuthorizationTokenOptions(this);
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the GetAuthorizationTokenOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the GetAuthorizationTokenOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }
  }

  private GetAuthorizationTokenOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    password = builder.password;
    username = builder.username;
  }

  /**
   * New builder.
   *
   * @return a GetAuthorizationTokenOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the username.
   *
   * @return the username
   */
  public String username() {
    return username;
  }
}

