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

import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createAsset options.
 */
public class CreateAssetOptions extends GenericModel {

  private String assetFamily;
  private String assetName;
  private String assetType;
  private Map<String, String> customProperties;
  private Boolean isCustom;
  private String parentAssetName;
  private String parentAssetType;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetFamily;
    private String assetName;
    private String assetType;
    private Map<String, String> customProperties;
    private Boolean isCustom;
    private String parentAssetName;
    private String parentAssetType;

    private Builder(CreateAssetOptions createAssetOptions) {
      this.assetFamily = createAssetOptions.assetFamily;
      this.assetName = createAssetOptions.assetName;
      this.assetType = createAssetOptions.assetType;
      this.customProperties = createAssetOptions.customProperties;
      this.isCustom = createAssetOptions.isCustom;
      this.parentAssetName = createAssetOptions.parentAssetName;
      this.parentAssetType = createAssetOptions.parentAssetType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAssetOptions.
     *
     * @return the createAssetOptions
     */
    public CreateAssetOptions build() {
      return new CreateAssetOptions(this);
    }

    /**
     * Set the assetFamily.
     *
     * @param assetFamily the assetFamily
     * @return the CreateAssetOptions builder
     */
    public Builder assetFamily(String assetFamily) {
      this.assetFamily = assetFamily;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the CreateAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the assetType.
     *
     * @param assetType the assetType
     * @return the CreateAssetOptions builder
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    /**
     * Set the customProperties.
     *
     * @param customProperties the customProperties
     * @return the CreateAssetOptions builder
     */
    public Builder customProperties(Map<String, String> customProperties) {
      this.customProperties = customProperties;
      return this;
    }

    /**
     * Set the isCustom.
     *
     * @param isCustom the isCustom
     * @return the CreateAssetOptions builder
     */
    public Builder isCustom(Boolean isCustom) {
      this.isCustom = isCustom;
      return this;
    }

    /**
     * Set the parentAssetName.
     *
     * @param parentAssetName the parentAssetName
     * @return the CreateAssetOptions builder
     */
    public Builder parentAssetName(String parentAssetName) {
      this.parentAssetName = parentAssetName;
      return this;
    }

    /**
     * Set the parentAssetType.
     *
     * @param parentAssetType the parentAssetType
     * @return the CreateAssetOptions builder
     */
    public Builder parentAssetType(String parentAssetType) {
      this.parentAssetType = parentAssetType;
      return this;
    }
  }

  private CreateAssetOptions(Builder builder) {
    assetFamily = builder.assetFamily;
    assetName = builder.assetName;
    assetType = builder.assetType;
    customProperties = builder.customProperties;
    isCustom = builder.isCustom;
    parentAssetName = builder.parentAssetName;
    parentAssetType = builder.parentAssetType;
  }

  /**
   * New builder.
   *
   * @return a CreateAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetFamily.
   *
   * Custom Application Name.
   *
   * @return the assetFamily
   */
  public String assetFamily() {
    return assetFamily;
  }

  /**
   * Gets the assetName.
   *
   * Functional area name.
   *
   * @return the assetName
   */
  public String assetName() {
    return assetName;
  }

  /**
   * Gets the assetType.
   *
   * Asset type. Non custom asset supported types are term, category, information_governance_policy,
   * information_governance_rule, collection, label and data_class.
   *
   * @return the assetType
   */
  public String assetType() {
    return assetType;
  }

  /**
   * Gets the customProperties.
   *
   * JSON payload of attributes, values.
   *
   * @return the customProperties
   */
  public Map<String, String> customProperties() {
    return customProperties;
  }

  /**
   * Gets the isCustom.
   *
   * Is this a custom asset type? If yes, asset family name is required as well.
   *
   * @return the isCustom
   */
  public Boolean isCustom() {
    return isCustom;
  }

  /**
   * Gets the parentAssetName.
   *
   * If top level asset type this will be NA, if not it will be the parent asset name.
   *
   * @return the parentAssetName
   */
  public String parentAssetName() {
    return parentAssetName;
  }

  /**
   * Gets the parentAssetType.
   *
   * If top level asset type this will be NA, if not it will be the parent asset type.
   *
   * @return the parentAssetType
   */
  public String parentAssetType() {
    return parentAssetType;
  }
}

