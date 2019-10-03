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
 * The getTypeInfo options.
 */
public class GetTypeInfoOptions extends GenericModel {

  private String typeName;
  private Boolean showEditProperties;
  private Boolean showViewProperties;
  private Boolean showCreateProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String typeName;
    private Boolean showEditProperties;
    private Boolean showViewProperties;
    private Boolean showCreateProperties;

    private Builder(GetTypeInfoOptions getTypeInfoOptions) {
      this.typeName = getTypeInfoOptions.typeName;
      this.showEditProperties = getTypeInfoOptions.showEditProperties;
      this.showViewProperties = getTypeInfoOptions.showViewProperties;
      this.showCreateProperties = getTypeInfoOptions.showCreateProperties;
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
     * Builds a GetTypeInfoOptions.
     *
     * @return the getTypeInfoOptions
     */
    public GetTypeInfoOptions build() {
      return new GetTypeInfoOptions(this);
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the GetTypeInfoOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the showEditProperties.
     *
     * @param showEditProperties the showEditProperties
     * @return the GetTypeInfoOptions builder
     */
    public Builder showEditProperties(Boolean showEditProperties) {
      this.showEditProperties = showEditProperties;
      return this;
    }

    /**
     * Set the showViewProperties.
     *
     * @param showViewProperties the showViewProperties
     * @return the GetTypeInfoOptions builder
     */
    public Builder showViewProperties(Boolean showViewProperties) {
      this.showViewProperties = showViewProperties;
      return this;
    }

    /**
     * Set the showCreateProperties.
     *
     * @param showCreateProperties the showCreateProperties
     * @return the GetTypeInfoOptions builder
     */
    public Builder showCreateProperties(Boolean showCreateProperties) {
      this.showCreateProperties = showCreateProperties;
      return this;
    }
  }

  private GetTypeInfoOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.typeName,
      "typeName cannot be empty");
    typeName = builder.typeName;
    showEditProperties = builder.showEditProperties;
    showViewProperties = builder.showViewProperties;
    showCreateProperties = builder.showCreateProperties;
  }

  /**
   * New builder.
   *
   * @return a GetTypeInfoOptions builder
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

  /**
   * Gets the showEditProperties.
   *
   * List the properties that can be edited.
   *
   * @return the showEditProperties
   */
  public Boolean showEditProperties() {
    return showEditProperties;
  }

  /**
   * Gets the showViewProperties.
   *
   * List the properties that can be viewed.
   *
   * @return the showViewProperties
   */
  public Boolean showViewProperties() {
    return showViewProperties;
  }

  /**
   * Gets the showCreateProperties.
   *
   * List the properties that can be defined when the asset is created.
   *
   * @return the showCreateProperties
   */
  public Boolean showCreateProperties() {
    return showCreateProperties;
  }
}

