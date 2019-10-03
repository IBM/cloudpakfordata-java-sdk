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
 * The deleteAssetBundle options.
 */
public class DeleteAssetBundleOptions extends GenericModel {

  private String assetID;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetID;

    private Builder(DeleteAssetBundleOptions deleteAssetBundleOptions) {
      this.assetID = deleteAssetBundleOptions.assetID;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetID the assetID
     */
    public Builder(String assetID) {
      this.assetID = assetID;
    }

    /**
     * Builds a DeleteAssetBundleOptions.
     *
     * @return the deleteAssetBundleOptions
     */
    public DeleteAssetBundleOptions build() {
      return new DeleteAssetBundleOptions(this);
    }

    /**
     * Set the assetID.
     *
     * @param assetID the assetID
     * @return the DeleteAssetBundleOptions builder
     */
    public Builder assetID(String assetID) {
      this.assetID = assetID;
      return this;
    }
  }

  private DeleteAssetBundleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assetID,
      "assetID cannot be empty");
    assetID = builder.assetID;
  }

  /**
   * New builder.
   *
   * @return a DeleteAssetBundleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetID.
   *
   * Asset Bundle ID.
   *
   * @return the assetID
   */
  public String assetID() {
    return assetID;
  }
}

