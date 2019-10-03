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
 * The getMe options.
 */
public class GetMeOptions extends GenericModel {

  private String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String accept;

    private Builder(GetMeOptions getMeOptions) {
      this.accept = getMeOptions.accept;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetMeOptions.
     *
     * @return the getMeOptions
     */
    public GetMeOptions build() {
      return new GetMeOptions(this);
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetMeOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  private GetMeOptions(Builder builder) {
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a GetMeOptions builder
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

