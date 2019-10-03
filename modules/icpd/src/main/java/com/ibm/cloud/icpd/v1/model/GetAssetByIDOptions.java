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
 * The getAssetByID options.
 */
public class GetAssetByIDOptions extends GenericModel {

  private String assetId;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetId;

    private Builder(GetAssetByIDOptions getAssetByIDOptions) {
      this.assetId = getAssetByIDOptions.assetId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetId the assetId
     */
    public Builder(String assetId) {
      this.assetId = assetId;
    }

    /**
     * Builds a GetAssetByIDOptions.
     *
     * @return the getAssetByIDOptions
     */
    public GetAssetByIDOptions build() {
      return new GetAssetByIDOptions(this);
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the GetAssetByIDOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }
  }

  private GetAssetByIDOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assetId,
      "assetId cannot be empty");
    assetId = builder.assetId;
  }

  /**
   * New builder.
   *
   * @return a GetAssetByIDOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetId.
   *
   * Asset ID.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }
}

