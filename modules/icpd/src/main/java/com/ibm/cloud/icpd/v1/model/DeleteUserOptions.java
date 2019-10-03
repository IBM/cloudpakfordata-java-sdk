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
 * The deleteUser options.
 */
public class DeleteUserOptions extends GenericModel {

  private String userName;
  private String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String userName;
    private String accept;

    private Builder(DeleteUserOptions deleteUserOptions) {
      this.userName = deleteUserOptions.userName;
      this.accept = deleteUserOptions.accept;
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
     * Builds a DeleteUserOptions.
     *
     * @return the deleteUserOptions
     */
    public DeleteUserOptions build() {
      return new DeleteUserOptions(this);
    }

    /**
     * Set the userName.
     *
     * @param userName the userName
     * @return the DeleteUserOptions builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the DeleteUserOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  private DeleteUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.userName,
      "userName cannot be empty");
    userName = builder.userName;
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a DeleteUserOptions builder
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
   * Gets the accept.
   *
   * The type of the response:  or *_/_*.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }
}

