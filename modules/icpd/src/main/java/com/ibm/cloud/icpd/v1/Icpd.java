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
package com.ibm.cloud.icpd.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.icpd.v1.model.AssetBundlesGetSuccessResponse;
import com.ibm.cloud.icpd.v1.model.AssetDetailsSuccessResponse;
import com.ibm.cloud.icpd.v1.model.ChangePasswordOptions;
import com.ibm.cloud.icpd.v1.model.CreateAssetBundleOptions;
import com.ibm.cloud.icpd.v1.model.CreateAssetOptions;
import com.ibm.cloud.icpd.v1.model.CreateRelatedAssetOptions;
import com.ibm.cloud.icpd.v1.model.CreateRoleOptions;
import com.ibm.cloud.icpd.v1.model.CreateUserOptions;
import com.ibm.cloud.icpd.v1.model.CreateUserSuccessResponse;
import com.ibm.cloud.icpd.v1.model.DeleteAssetBundleOptions;
import com.ibm.cloud.icpd.v1.model.DeleteAssetOptions;
import com.ibm.cloud.icpd.v1.model.DeleteRelatedAssetOptions;
import com.ibm.cloud.icpd.v1.model.DeleteRoleOptions;
import com.ibm.cloud.icpd.v1.model.DeleteUserOptions;
import com.ibm.cloud.icpd.v1.model.GetAllAssetBundlesOptions;
import com.ibm.cloud.icpd.v1.model.GetAllPermissionsOptions;
import com.ibm.cloud.icpd.v1.model.GetAllRolesOptions;
import com.ibm.cloud.icpd.v1.model.GetAllRolesResponse;
import com.ibm.cloud.icpd.v1.model.GetAllUsersOptions;
import com.ibm.cloud.icpd.v1.model.GetAllUsersResponse;
import com.ibm.cloud.icpd.v1.model.GetAssetBundleOptions;
import com.ibm.cloud.icpd.v1.model.GetAssetByIDOptions;
import com.ibm.cloud.icpd.v1.model.GetAssetOptions;
import com.ibm.cloud.icpd.v1.model.GetAuthorizationTokenOptions;
import com.ibm.cloud.icpd.v1.model.GetMeOptions;
import com.ibm.cloud.icpd.v1.model.GetMeResponse;
import com.ibm.cloud.icpd.v1.model.GetMonitorOptions;
import com.ibm.cloud.icpd.v1.model.GetPermissionsResponse;
import com.ibm.cloud.icpd.v1.model.GetRelatedAssetOptions;
import com.ibm.cloud.icpd.v1.model.GetRoleOptions;
import com.ibm.cloud.icpd.v1.model.GetRoleResponse;
import com.ibm.cloud.icpd.v1.model.GetTypeAssetsOptions;
import com.ibm.cloud.icpd.v1.model.GetTypeInfoOptions;
import com.ibm.cloud.icpd.v1.model.GetTypesOptions;
import com.ibm.cloud.icpd.v1.model.GetUserOptions;
import com.ibm.cloud.icpd.v1.model.GetUserResponse;
import com.ibm.cloud.icpd.v1.model.LoginResponse;
import com.ibm.cloud.icpd.v1.model.RelatedAssetsFindSuccessResponse;
import com.ibm.cloud.icpd.v1.model.SuccessResponse;
import com.ibm.cloud.icpd.v1.model.TypesSuccessResponse;
import com.ibm.cloud.icpd.v1.model.UpdateAssetBundleOptions;
import com.ibm.cloud.icpd.v1.model.UpdateMeOptions;
import com.ibm.cloud.icpd.v1.model.UpdateRoleOptions;
import com.ibm.cloud.icpd.v1.model.UpdateUserOptions;
import com.ibm.cloud.mysdk.common.SdkCommon;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * Swagger for the IBM Cloud Private for Data offerings - with Data Governance and Analytics API's
 *
 * @version v1
 */
public class Icpd extends BaseService {

  private static final String SERVICE_NAME = "icpd";
  private static final String SERVICE_URL = "https://i493-master-1.fyre.ibm.com:31843/icp4d-api/";


  /**
   * Constructs a new `Icpd` client with the specified Authenticator.
   *
   * @param authenticator the Authenticator instance to be configured for this service
   */
  public Icpd(Authenticator authenticator) {
    super(SERVICE_NAME, authenticator);
    if ((getServiceUrl() == null) || getServiceUrl().isEmpty()) {
      setServiceUrl(SERVICE_URL);
    }
  }

  /**
   * Get authorization token.
   *
   * Provide icp4d login credentials to receive authorization bearer token.
   *
   * @param getAuthorizationTokenOptions the {@link GetAuthorizationTokenOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link LoginResponse}
   */
  public ServiceCall<LoginResponse> getAuthorizationToken(GetAuthorizationTokenOptions getAuthorizationTokenOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAuthorizationTokenOptions,
      "getAuthorizationTokenOptions cannot be null");
    String[] pathSegments = { "v1/authorize" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAuthorizationToken");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("password", getAuthorizationTokenOptions.password());
    contentJson.addProperty("username", getAuthorizationTokenOptions.username());
    builder.bodyJson(contentJson);
    ResponseConverter<LoginResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoginResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all users.
   *
   * Get all users from the cluster.
   *
   * @param getAllUsersOptions the {@link GetAllUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link GetAllUsersResponse}
   */
  public ServiceCall<GetAllUsersResponse> getAllUsers(GetAllUsersOptions getAllUsersOptions) {
    String[] pathSegments = { "v1/users" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAllUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getAllUsersOptions != null) {
    if (getAllUsersOptions.accept() != null) {
      builder.header("Accept", getAllUsersOptions.accept());
    }
    }
    ResponseConverter<GetAllUsersResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetAllUsersResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all users.
   *
   * Get all users from the cluster.
   *
   * @return a {@link ServiceCall} with a response type of {@link GetAllUsersResponse}
   */
  public ServiceCall<GetAllUsersResponse> getAllUsers() {
    return getAllUsers(null);
  }

  /**
   * Create user.
   *
   * Create a new user for the cluster.
   *
   * @param createUserOptions the {@link CreateUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link CreateUserSuccessResponse}
   */
  public ServiceCall<CreateUserSuccessResponse> createUser(CreateUserOptions createUserOptions) {
    String[] pathSegments = { "v1/users" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "createUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createUserOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (createUserOptions.displayName() != null) {
      contentJson.addProperty("displayName", createUserOptions.displayName());
    }
    if (createUserOptions.email() != null) {
      contentJson.addProperty("email", createUserOptions.email());
    }
    if (createUserOptions.userName() != null) {
      contentJson.addProperty("user_name", createUserOptions.userName());
    }
    if (createUserOptions.userRoles() != null) {
      contentJson.add("user_roles", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createUserOptions.userRoles()));
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<CreateUserSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateUserSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create user.
   *
   * Create a new user for the cluster.
   *
   * @return a {@link ServiceCall} with a response type of {@link CreateUserSuccessResponse}
   */
  public ServiceCall<CreateUserSuccessResponse> createUser() {
    return createUser(null);
  }

  /**
   * Get user information.
   *
   * Get existing user information.
   *
   * @param getUserOptions the {@link GetUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link GetUserResponse}
   */
  public ServiceCall<GetUserResponse> getUser(GetUserOptions getUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getUserOptions,
      "getUserOptions cannot be null");
    String[] pathSegments = { "v1/users" };
    String[] pathParameters = { getUserOptions.userName() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getUserOptions.accept() != null) {
      builder.header("Accept", getUserOptions.accept());
    }
    ResponseConverter<GetUserResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetUserResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update user details.
   *
   * Update an existing user information.
   *
   * @param updateUserOptions the {@link UpdateUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateUser(UpdateUserOptions updateUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateUserOptions,
      "updateUserOptions cannot be null");
    String[] pathSegments = { "v1/users" };
    String[] pathParameters = { updateUserOptions.userName() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "updateUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateUserOptions.approvalStatus() != null) {
      contentJson.addProperty("approval_status", updateUserOptions.approvalStatus());
    }
    if (updateUserOptions.displayName() != null) {
      contentJson.addProperty("displayName", updateUserOptions.displayName());
    }
    if (updateUserOptions.email() != null) {
      contentJson.addProperty("email", updateUserOptions.email());
    }
    if (updateUserOptions.userRoles() != null) {
      contentJson.add("user_roles", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateUserOptions.userRoles()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete user.
   *
   * Delete user from the cluster.
   *
   * @param deleteUserOptions the {@link DeleteUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteUser(DeleteUserOptions deleteUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteUserOptions,
      "deleteUserOptions cannot be null");
    String[] pathSegments = { "v1/users" };
    String[] pathParameters = { deleteUserOptions.userName() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "deleteUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteUserOptions.accept() != null) {
      builder.header("Accept", deleteUserOptions.accept());
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all roles.
   *
   * Get all roles from the cluster.
   *
   * @param getAllRolesOptions the {@link GetAllRolesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link GetAllRolesResponse}
   */
  public ServiceCall<GetAllRolesResponse> getAllRoles(GetAllRolesOptions getAllRolesOptions) {
    String[] pathSegments = { "v1/roles" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAllRoles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getAllRolesOptions != null) {
    if (getAllRolesOptions.accept() != null) {
      builder.header("Accept", getAllRolesOptions.accept());
    }
    }
    ResponseConverter<GetAllRolesResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetAllRolesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all roles.
   *
   * Get all roles from the cluster.
   *
   * @return a {@link ServiceCall} with a response type of {@link GetAllRolesResponse}
   */
  public ServiceCall<GetAllRolesResponse> getAllRoles() {
    return getAllRoles(null);
  }

  /**
   * Create new role.
   *
   * Create a new role for the cluster.
   *
   * @param createRoleOptions the {@link CreateRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createRole(CreateRoleOptions createRoleOptions) {
    String[] pathSegments = { "v1/roles" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "createRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createRoleOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (createRoleOptions.description() != null) {
      contentJson.addProperty("description", createRoleOptions.description());
    }
    if (createRoleOptions.permissions() != null) {
      contentJson.add("permissions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createRoleOptions.permissions()));
    }
    if (createRoleOptions.roleName() != null) {
      contentJson.addProperty("role_name", createRoleOptions.roleName());
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create new role.
   *
   * Create a new role for the cluster.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createRole() {
    return createRole(null);
  }

  /**
   * List all permissions.
   *
   * Get all defined permissions.
   *
   * @param getAllPermissionsOptions the {@link GetAllPermissionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link GetPermissionsResponse}
   */
  public ServiceCall<GetPermissionsResponse> getAllPermissions(GetAllPermissionsOptions getAllPermissionsOptions) {
    String[] pathSegments = { "v1/roles/permissions" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAllPermissions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getAllPermissionsOptions != null) {
    if (getAllPermissionsOptions.accept() != null) {
      builder.header("Accept", getAllPermissionsOptions.accept());
    }
    }
    ResponseConverter<GetPermissionsResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetPermissionsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all permissions.
   *
   * Get all defined permissions.
   *
   * @return a {@link ServiceCall} with a response type of {@link GetPermissionsResponse}
   */
  public ServiceCall<GetPermissionsResponse> getAllPermissions() {
    return getAllPermissions(null);
  }

  /**
   * Get role information.
   *
   * Get existing role information.
   *
   * @param getRoleOptions the {@link GetRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link GetRoleResponse}
   */
  public ServiceCall<GetRoleResponse> getRole(GetRoleOptions getRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRoleOptions,
      "getRoleOptions cannot be null");
    String[] pathSegments = { "v1/roles" };
    String[] pathParameters = { getRoleOptions.roleName() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getRoleOptions.accept() != null) {
      builder.header("Accept", getRoleOptions.accept());
    }
    ResponseConverter<GetRoleResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetRoleResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update role.
   *
   * Update an existing role.
   *
   * @param updateRoleOptions the {@link UpdateRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateRole(UpdateRoleOptions updateRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateRoleOptions,
      "updateRoleOptions cannot be null");
    String[] pathSegments = { "v1/roles" };
    String[] pathParameters = { updateRoleOptions.roleName() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "updateRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateRoleOptions.description() != null) {
      contentJson.addProperty("description", updateRoleOptions.description());
    }
    if (updateRoleOptions.permissions() != null) {
      contentJson.add("permissions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRoleOptions.permissions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete role.
   *
   * Delete role from the cluster.
   *
   * @param deleteRoleOptions the {@link DeleteRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteRole(DeleteRoleOptions deleteRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteRoleOptions,
      "deleteRoleOptions cannot be null");
    String[] pathSegments = { "v1/roles" };
    String[] pathParameters = { deleteRoleOptions.roleName() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "deleteRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteRoleOptions.accept() != null) {
      builder.header("Accept", deleteRoleOptions.accept());
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change my password.
   *
   * Change password for the logged in user.
   *
   * @param changePasswordOptions the {@link ChangePasswordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> changePassword(ChangePasswordOptions changePasswordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(changePasswordOptions,
      "changePasswordOptions cannot be null");
    String[] pathSegments = { "v1/changepassword" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "changePassword");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("password", changePasswordOptions.password());
    builder.body(multipartBuilder.build());
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get my account information.
   *
   * Get logged in user information.
   *
   * @param getMeOptions the {@link GetMeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link GetMeResponse}
   */
  public ServiceCall<GetMeResponse> getMe(GetMeOptions getMeOptions) {
    String[] pathSegments = { "v1/me" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getMe");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getMeOptions != null) {
    if (getMeOptions.accept() != null) {
      builder.header("Accept", getMeOptions.accept());
    }
    }
    ResponseConverter<GetMeResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMeResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get my account information.
   *
   * Get logged in user information.
   *
   * @return a {@link ServiceCall} with a response type of {@link GetMeResponse}
   */
  public ServiceCall<GetMeResponse> getMe() {
    return getMe(null);
  }

  /**
   * Update my information.
   *
   * Update my user information.
   *
   * @param updateMeOptions the {@link UpdateMeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateMe(UpdateMeOptions updateMeOptions) {
    String[] pathSegments = { "v1/me" };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "updateMe");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMeOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (updateMeOptions.displayName() != null) {
      contentJson.addProperty("displayName", updateMeOptions.displayName());
    }
    if (updateMeOptions.email() != null) {
      contentJson.addProperty("email", updateMeOptions.email());
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update my information.
   *
   * Update my user information.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateMe() {
    return updateMe(null);
  }

  /**
   * Get the list of registered asset bundles.
   *
   * Provides a list of registered asset bundles.
   *
   * @param getAllAssetBundlesOptions the {@link GetAllAssetBundlesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link AssetBundlesGetSuccessResponse}
   */
  public ServiceCall<AssetBundlesGetSuccessResponse> getAllAssetBundles(GetAllAssetBundlesOptions getAllAssetBundlesOptions) {
    String[] pathSegments = { "v1/assetBundles" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAllAssetBundles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getAllAssetBundlesOptions != null) {
    }
    ResponseConverter<AssetBundlesGetSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetBundlesGetSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the list of registered asset bundles.
   *
   * Provides a list of registered asset bundles.
   *
   * @return a {@link ServiceCall} with a response type of {@link AssetBundlesGetSuccessResponse}
   */
  public ServiceCall<AssetBundlesGetSuccessResponse> getAllAssetBundles() {
    return getAllAssetBundles(null);
  }

  /**
   * Update a previously registered asset bundle.
   *
   * Updates previously registered asset bundle. Upload the zip file with updated bundle definition.
   *
   * @param updateAssetBundleOptions the {@link UpdateAssetBundleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateAssetBundle(UpdateAssetBundleOptions updateAssetBundleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAssetBundleOptions,
      "updateAssetBundleOptions cannot be null");
    String[] pathSegments = { "v1/assetBundles" };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "updateAssetBundle");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(updateAssetBundleOptions.file(), updateAssetBundleOptions.fileContentType());
    multipartBuilder.addFormDataPart("file", "filename", fileBody);
    builder.body(multipartBuilder.build());
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Register a new Asset bundle.
   *
   * Registers a new Asset bundle. Upload the zip file with the bundle definition and the properties. More information
   * on how to construct the zip file can be found
   * [here](https://github.com/IBM-ICP4D/icp4d-apis/tree/master/custom-bundle-utility).
   *
   * @param createAssetBundleOptions the {@link CreateAssetBundleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createAssetBundle(CreateAssetBundleOptions createAssetBundleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAssetBundleOptions,
      "createAssetBundleOptions cannot be null");
    String[] pathSegments = { "v1/assetBundles" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "createAssetBundle");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(createAssetBundleOptions.file(), createAssetBundleOptions.fileContentType());
    multipartBuilder.addFormDataPart("file", "filename", fileBody);
    builder.body(multipartBuilder.build());
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Download a registered bundle as a zip file.
   *
   * Outputs the bundle definition zip file, needing the Asset bundle ID to process the request.
   *
   * @param getAssetBundleOptions the {@link GetAssetBundleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of Void
   */
  public ServiceCall<Void> getAssetBundle(GetAssetBundleOptions getAssetBundleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAssetBundleOptions,
      "getAssetBundleOptions cannot be null");
    String[] pathSegments = { "v1/assetBundles" };
    String[] pathParameters = { getAssetBundleOptions.assetID() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAssetBundle");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an asset bundle.
   *
   * Delete the asset bundle, needing the asset bundle ID as input.
   *
   * @param deleteAssetBundleOptions the {@link DeleteAssetBundleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteAssetBundle(DeleteAssetBundleOptions deleteAssetBundleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAssetBundleOptions,
      "deleteAssetBundleOptions cannot be null");
    String[] pathSegments = { "v1/assetBundles" };
    String[] pathParameters = { deleteAssetBundleOptions.assetID() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "deleteAssetBundle");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an asset.
   *
   * Provides information about an asset type. For custom asset, please provide the asset type as
   * {asset_family_name}-{asset_type}.
   *
   * @param getAssetOptions the {@link GetAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link AssetDetailsSuccessResponse}
   */
  public ServiceCall<AssetDetailsSuccessResponse> getAsset(GetAssetOptions getAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAssetOptions,
      "getAssetOptions cannot be null");
    String[] pathSegments = { "v1/assets" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("asset_type", getAssetOptions.assetType());
    builder.query("asset_property", getAssetOptions.assetProperty());
    builder.query("asset_value", getAssetOptions.assetValue());
    ResponseConverter<AssetDetailsSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetDetailsSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an asset.
   *
   * Create custom and pre-defined assets using this endpoint. For term asset types, provide category_name under
   * custom_properties. For custom asset types, provide the asset_family_name and the parent asset information, if asset
   * not the top element.
   *
   * @param createAssetOptions the {@link CreateAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createAsset(CreateAssetOptions createAssetOptions) {
    String[] pathSegments = { "v1/assets" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "createAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createAssetOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (createAssetOptions.assetFamily() != null) {
      contentJson.addProperty("asset_family", createAssetOptions.assetFamily());
    }
    if (createAssetOptions.assetName() != null) {
      contentJson.addProperty("asset_name", createAssetOptions.assetName());
    }
    if (createAssetOptions.assetType() != null) {
      contentJson.addProperty("asset_type", createAssetOptions.assetType());
    }
    if (createAssetOptions.customProperties() != null) {
      contentJson.add("custom_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAssetOptions.customProperties()));
    }
    if (createAssetOptions.isCustom() != null) {
      contentJson.addProperty("is_custom", createAssetOptions.isCustom());
    }
    if (createAssetOptions.parentAssetName() != null) {
      contentJson.addProperty("parent_asset_name", createAssetOptions.parentAssetName());
    }
    if (createAssetOptions.parentAssetType() != null) {
      contentJson.addProperty("parent_asset_type", createAssetOptions.parentAssetType());
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an asset.
   *
   * Create custom and pre-defined assets using this endpoint. For term asset types, provide category_name under
   * custom_properties. For custom asset types, provide the asset_family_name and the parent asset information, if asset
   * not the top element.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createAsset() {
    return createAsset(null);
  }

  /**
   * Delete Asset.
   *
   * Delete asset. For custom asset type, provide asset_type as {asset_family_name}-{asset_type}.
   *
   * @param deleteAssetOptions the {@link DeleteAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteAsset(DeleteAssetOptions deleteAssetOptions) {
    String[] pathSegments = { "v1/assets" };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "deleteAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteAssetOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (deleteAssetOptions.assetProperty() != null) {
      contentJson.addProperty("asset_property", deleteAssetOptions.assetProperty());
    }
    if (deleteAssetOptions.assetType() != null) {
      contentJson.addProperty("asset_type", deleteAssetOptions.assetType());
    }
    if (deleteAssetOptions.assetValue() != null) {
      contentJson.addProperty("asset_value", deleteAssetOptions.assetValue());
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Asset.
   *
   * Delete asset. For custom asset type, provide asset_type as {asset_family_name}-{asset_type}.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteAsset() {
    return deleteAsset(null);
  }

  /**
   * Get an asset by id.
   *
   * Retrieve information on an asset based on asset ID.
   *
   * @param getAssetByIDOptions the {@link GetAssetByIDOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link AssetDetailsSuccessResponse}
   */
  public ServiceCall<AssetDetailsSuccessResponse> getAssetByID(GetAssetByIDOptions getAssetByIDOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAssetByIDOptions,
      "getAssetByIDOptions cannot be null");
    String[] pathSegments = { "v1/assets" };
    String[] pathParameters = { getAssetByIDOptions.assetId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getAssetByID");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AssetDetailsSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetDetailsSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all asset types.
   *
   * Retrieves all available asset types.
   *
   * @param getTypesOptions the {@link GetTypesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link TypesSuccessResponse}
   */
  public ServiceCall<TypesSuccessResponse> getTypes(GetTypesOptions getTypesOptions) {
    String[] pathSegments = { "v1/types" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getTypes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTypesOptions != null) {
    }
    ResponseConverter<TypesSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TypesSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all asset types.
   *
   * Retrieves all available asset types.
   *
   * @return a {@link ServiceCall} with a response type of {@link TypesSuccessResponse}
   */
  public ServiceCall<TypesSuccessResponse> getTypes() {
    return getTypes(null);
  }

  /**
   * Get type metadata.
   *
   * Get information about an asset type.
   *
   * @param getTypeInfoOptions the {@link GetTypeInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link AssetDetailsSuccessResponse}
   */
  public ServiceCall<AssetDetailsSuccessResponse> getTypeInfo(GetTypeInfoOptions getTypeInfoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTypeInfoOptions,
      "getTypeInfoOptions cannot be null");
    String[] pathSegments = { "v1/types" };
    String[] pathParameters = { getTypeInfoOptions.typeName() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getTypeInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTypeInfoOptions.showEditProperties() != null) {
    builder.query("show_edit_properties", String.valueOf(getTypeInfoOptions.showEditProperties()));
    }
    if (getTypeInfoOptions.showViewProperties() != null) {
    builder.query("show_view_properties", String.valueOf(getTypeInfoOptions.showViewProperties()));
    }
    if (getTypeInfoOptions.showCreateProperties() != null) {
    builder.query("show_create_properties", String.valueOf(getTypeInfoOptions.showCreateProperties()));
    }
    ResponseConverter<AssetDetailsSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetDetailsSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get assets of a particular type.
   *
   * Retrieves all available asset of a particular type.
   *
   * @param getTypeAssetsOptions the {@link GetTypeAssetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link AssetDetailsSuccessResponse}
   */
  public ServiceCall<AssetDetailsSuccessResponse> getTypeAssets(GetTypeAssetsOptions getTypeAssetsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTypeAssetsOptions,
      "getTypeAssetsOptions cannot be null");
    String[] pathSegments = { "v1/types", "assets" };
    String[] pathParameters = { getTypeAssetsOptions.typeName() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getTypeAssets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AssetDetailsSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetDetailsSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Find related assets.
   *
   * Outputs assets related to the provided asset.
   *
   * @param getRelatedAssetOptions the {@link GetRelatedAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link RelatedAssetsFindSuccessResponse}
   */
  public ServiceCall<RelatedAssetsFindSuccessResponse> getRelatedAsset(GetRelatedAssetOptions getRelatedAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRelatedAssetOptions,
      "getRelatedAssetOptions cannot be null");
    String[] pathSegments = { "v1/relatedAssets" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getRelatedAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("asset_type", getRelatedAssetOptions.assetType());
    builder.query("asset_name", getRelatedAssetOptions.assetName());
    ResponseConverter<RelatedAssetsFindSuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelatedAssetsFindSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Relate with other assets.
   *
   * Associate metadata about two related assets that are existing in the governance catalog. For example, add category
   * asset association to a term asset.
   *
   * @param createRelatedAssetOptions the {@link CreateRelatedAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createRelatedAsset(CreateRelatedAssetOptions createRelatedAssetOptions) {
    String[] pathSegments = { "v1/relatedAssets" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "createRelatedAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createRelatedAssetOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (createRelatedAssetOptions.assetName() != null) {
      contentJson.addProperty("asset_name", createRelatedAssetOptions.assetName());
    }
    if (createRelatedAssetOptions.assetType() != null) {
      contentJson.addProperty("asset_type", createRelatedAssetOptions.assetType());
    }
    if (createRelatedAssetOptions.relatedAssetName() != null) {
      contentJson.addProperty("related_asset_name", createRelatedAssetOptions.relatedAssetName());
    }
    if (createRelatedAssetOptions.relatedAssetType() != null) {
      contentJson.addProperty("related_asset_type", createRelatedAssetOptions.relatedAssetType());
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Relate with other assets.
   *
   * Associate metadata about two related assets that are existing in the governance catalog. For example, add category
   * asset association to a term asset.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createRelatedAsset() {
    return createRelatedAsset(null);
  }

  /**
   * Remove related asset.
   *
   * Remove existing asset's association.
   *
   * @param deleteRelatedAssetOptions the {@link DeleteRelatedAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteRelatedAsset(DeleteRelatedAssetOptions deleteRelatedAssetOptions) {
    String[] pathSegments = { "v1/relatedAssets" };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "deleteRelatedAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteRelatedAssetOptions != null) {
    final JsonObject contentJson = new JsonObject();
    if (deleteRelatedAssetOptions.assetName() != null) {
      contentJson.addProperty("asset_name", deleteRelatedAssetOptions.assetName());
    }
    if (deleteRelatedAssetOptions.assetType() != null) {
      contentJson.addProperty("asset_type", deleteRelatedAssetOptions.assetType());
    }
    if (deleteRelatedAssetOptions.relatedAssetName() != null) {
      contentJson.addProperty("related_asset_name", deleteRelatedAssetOptions.relatedAssetName());
    }
    if (deleteRelatedAssetOptions.relatedAssetType() != null) {
      contentJson.addProperty("related_asset_type", deleteRelatedAssetOptions.relatedAssetType());
    }
    builder.bodyJson(contentJson);
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove related asset.
   *
   * Remove existing asset's association.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> deleteRelatedAsset() {
    return deleteRelatedAsset(null);
  }

  /**
   * Check server status.
   *
   * Provides basic heartbeat endpoint to check if the icp4d open api server is running.
   *
   * @param getMonitorOptions the {@link GetMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> getMonitor(GetMonitorOptions getMonitorOptions) {
    String[] pathSegments = { "v1/monitor" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("icpd", "v1", "getMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getMonitorOptions != null) {
    if (getMonitorOptions.accept() != null) {
      builder.header("Accept", getMonitorOptions.accept());
    }
    }
    ResponseConverter<SuccessResponse> responseConverter =
        ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Check server status.
   *
   * Provides basic heartbeat endpoint to check if the icp4d open api server is running.
   *
   * @return a {@link ServiceCall} with a response type of {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> getMonitor() {
    return getMonitor(null);
  }

}
