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
 * The getAllRoles options.
 */
public class GetAllRolesOptions extends GenericModel {

  private String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String accept;

    private Builder(GetAllRolesOptions getAllRolesOptions) {
      this.accept = getAllRolesOptions.accept;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetAllRolesOptions.
     *
     * @return the getAllRolesOptions
     */
    public GetAllRolesOptions build() {
      return new GetAllRolesOptions(this);
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetAllRolesOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  private GetAllRolesOptions(Builder builder) {
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a GetAllRolesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

