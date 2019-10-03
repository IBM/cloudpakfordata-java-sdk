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
 * The getRelatedAsset options.
 */
public class GetRelatedAssetOptions extends GenericModel {

  private String assetType;
  private String assetName;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetType;
    private String assetName;

    private Builder(GetRelatedAssetOptions getRelatedAssetOptions) {
      this.assetType = getRelatedAssetOptions.assetType;
      this.assetName = getRelatedAssetOptions.assetName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetType the assetType
     * @param assetName the assetName
     */
    public Builder(String assetType, String assetName) {
      this.assetType = assetType;
      this.assetName = assetName;
    }

    /**
     * Builds a GetRelatedAssetOptions.
     *
     * @return the getRelatedAssetOptions
     */
    public GetRelatedAssetOptions build() {
      return new GetRelatedAssetOptions(this);
    }

    /**
     * Set the assetType.
     *
     * @param assetType the assetType
     * @return the GetRelatedAssetOptions builder
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the GetRelatedAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }
  }

  private GetRelatedAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetType,
      "assetType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetName,
      "assetName cannot be null");
    assetType = builder.assetType;
    assetName = builder.assetName;
  }

  /**
   * New builder.
   *
   * @return a GetRelatedAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetType.
   *
   * Functional area name Ex- category.
   *
   * @return the assetType
   */
  public String assetType() {
    return assetType;
  }

  /**
   * Gets the assetName.
   *
   * Asset name.
   *
   * @return the assetName
   */
  public String assetName() {
    return assetName;
  }
}

