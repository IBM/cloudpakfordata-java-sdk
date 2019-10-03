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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetAllUsersResponse.
 */
public class GetAllUsersResponse extends GenericModel {

  @SerializedName("_messageCode_")
  private String messageCode;
  private String message;
  @SerializedName("UsersInfo")
  private List<GetAllUsersResponseAllOf1UsersInfoItems> usersInfo;

  /**
   * Gets the messageCode.
   *
   * message code.
   *
   * @return the messageCode
   */
  public String getMessageCode() {
    return messageCode;
  }

  /**
   * Gets the message.
   *
   * message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the usersInfo.
   *
   * @return the usersInfo
   */
  public List<GetAllUsersResponseAllOf1UsersInfoItems> getUsersInfo() {
    return usersInfo;
  }
}

