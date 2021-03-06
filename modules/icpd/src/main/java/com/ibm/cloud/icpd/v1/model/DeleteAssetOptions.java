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
 * The deleteAsset options.
 */
public class DeleteAssetOptions extends GenericModel {

  private String assetProperty;
  private String assetType;
  private String assetValue;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetProperty;
    private String assetType;
    private String assetValue;

    private Builder(DeleteAssetOptions deleteAssetOptions) {
      this.assetProperty = deleteAssetOptions.assetProperty;
      this.assetType = deleteAssetOptions.assetType;
      this.assetValue = deleteAssetOptions.assetValue;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteAssetOptions.
     *
     * @return the deleteAssetOptions
     */
    public DeleteAssetOptions build() {
      return new DeleteAssetOptions(this);
    }

    /**
     * Set the assetProperty.
     *
     * @param assetProperty the assetProperty
     * @return the DeleteAssetOptions builder
     */
    public Builder assetProperty(String assetProperty) {
      this.assetProperty = assetProperty;
      return this;
    }

    /**
     * Set the assetType.
     *
     * @param assetType the assetType
     * @return the DeleteAssetOptions builder
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    /**
     * Set the assetValue.
     *
     * @param assetValue the assetValue
     * @return the DeleteAssetOptions builder
     */
    public Builder assetValue(String assetValue) {
      this.assetValue = assetValue;
      return this;
    }
  }

  private DeleteAssetOptions(Builder builder) {
    assetProperty = builder.assetProperty;
    assetType = builder.assetType;
    assetValue = builder.assetValue;
  }

  /**
   * New builder.
   *
   * @return a DeleteAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetProperty.
   *
   * Property name to search by, can search for all assets with a given name to delete. Ex- name.
   *
   * @return the assetProperty
   */
  public String assetProperty() {
    return assetProperty;
  }

  /**
   * Gets the assetType.
   *
   * Functional area name. Ex- term.
   *
   * @return the assetType
   */
  public String assetType() {
    return assetType;
  }

  /**
   * Gets the assetValue.
   *
   * Property value to search by. Ex- TermOne.
   *
   * @return the assetValue
   */
  public String assetValue() {
    return assetValue;
  }
}

