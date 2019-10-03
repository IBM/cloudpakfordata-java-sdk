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
 * The getAssetBundle options.
 */
public class GetAssetBundleOptions extends GenericModel {

  private String assetID;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetID;

    private Builder(GetAssetBundleOptions getAssetBundleOptions) {
      this.assetID = getAssetBundleOptions.assetID;
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
     * Builds a GetAssetBundleOptions.
     *
     * @return the getAssetBundleOptions
     */
    public GetAssetBundleOptions build() {
      return new GetAssetBundleOptions(this);
    }

    /**
     * Set the assetID.
     *
     * @param assetID the assetID
     * @return the GetAssetBundleOptions builder
     */
    public Builder assetID(String assetID) {
      this.assetID = assetID;
      return this;
    }
  }

  private GetAssetBundleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assetID,
      "assetID cannot be empty");
    assetID = builder.assetID;
  }

  /**
   * New builder.
   *
   * @return a GetAssetBundleOptions builder
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

