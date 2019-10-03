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
 * The getAsset options.
 */
public class GetAssetOptions extends GenericModel {

  private String assetType;
  private String assetProperty;
  private String assetValue;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetType;
    private String assetProperty;
    private String assetValue;

    private Builder(GetAssetOptions getAssetOptions) {
      this.assetType = getAssetOptions.assetType;
      this.assetProperty = getAssetOptions.assetProperty;
      this.assetValue = getAssetOptions.assetValue;
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
     * @param assetProperty the assetProperty
     * @param assetValue the assetValue
     */
    public Builder(String assetType, String assetProperty, String assetValue) {
      this.assetType = assetType;
      this.assetProperty = assetProperty;
      this.assetValue = assetValue;
    }

    /**
     * Builds a GetAssetOptions.
     *
     * @return the getAssetOptions
     */
    public GetAssetOptions build() {
      return new GetAssetOptions(this);
    }

    /**
     * Set the assetType.
     *
     * @param assetType the assetType
     * @return the GetAssetOptions builder
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    /**
     * Set the assetProperty.
     *
     * @param assetProperty the assetProperty
     * @return the GetAssetOptions builder
     */
    public Builder assetProperty(String assetProperty) {
      this.assetProperty = assetProperty;
      return this;
    }

    /**
     * Set the assetValue.
     *
     * @param assetValue the assetValue
     * @return the GetAssetOptions builder
     */
    public Builder assetValue(String assetValue) {
      this.assetValue = assetValue;
      return this;
    }
  }

  private GetAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetType,
      "assetType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetProperty,
      "assetProperty cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetValue,
      "assetValue cannot be null");
    assetType = builder.assetType;
    assetProperty = builder.assetProperty;
    assetValue = builder.assetValue;
  }

  /**
   * New builder.
   *
   * @return a GetAssetOptions builder
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
   * Gets the assetProperty.
   *
   * Property name to search by, as an example we might want to search for all assets with a given name. Ex- name.
   *
   * @return the assetProperty
   */
  public String assetProperty() {
    return assetProperty;
  }

  /**
   * Gets the assetValue.
   *
   * What property value are we searching by? Ex- Logical Area.
   *
   * @return the assetValue
   */
  public String assetValue() {
    return assetValue;
  }
}

