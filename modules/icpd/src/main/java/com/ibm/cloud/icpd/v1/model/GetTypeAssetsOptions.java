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
 * The getTypeAssets options.
 */
public class GetTypeAssetsOptions extends GenericModel {

  private String typeName;

  /**
   * Builder.
   */
  public static class Builder {
    private String typeName;

    private Builder(GetTypeAssetsOptions getTypeAssetsOptions) {
      this.typeName = getTypeAssetsOptions.typeName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param typeName the typeName
     */
    public Builder(String typeName) {
      this.typeName = typeName;
    }

    /**
     * Builds a GetTypeAssetsOptions.
     *
     * @return the getTypeAssetsOptions
     */
    public GetTypeAssetsOptions build() {
      return new GetTypeAssetsOptions(this);
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the GetTypeAssetsOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }
  }

  private GetTypeAssetsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.typeName,
      "typeName cannot be empty");
    typeName = builder.typeName;
  }

  /**
   * New builder.
   *
   * @return a GetTypeAssetsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the typeName.
   *
   * Asset type.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }
}

