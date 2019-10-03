package com.ibm.cloud.icpd.tests;

import com.ibm.cloud.sdk.core.http.HttpConfigOptions;
import com.ibm.cloud.sdk.core.security.BearerTokenAuthenticator;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import java.util.Arrays;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ibm.cloud.icpd.v1.*;
import com.ibm.cloud.icpd.v1.model.ChangePasswordOptions;
import com.ibm.cloud.icpd.v1.model.CreateRoleOptions;
import com.ibm.cloud.icpd.v1.model.CreateUserOptions;
import com.ibm.cloud.icpd.v1.model.CreateUserSuccessResponse;
import com.ibm.cloud.icpd.v1.model.DeleteRoleOptions;
import com.ibm.cloud.icpd.v1.model.DeleteUserOptions;
import com.ibm.cloud.icpd.v1.model.GetAllPermissionsOptions;
import com.ibm.cloud.icpd.v1.model.GetAllRolesOptions;
import com.ibm.cloud.icpd.v1.model.GetAllRolesResponse;
import com.ibm.cloud.icpd.v1.model.GetAllUsersOptions;
import com.ibm.cloud.icpd.v1.model.GetAllUsersResponse;
import com.ibm.cloud.icpd.v1.model.GetAuthorizationTokenOptions;
import com.ibm.cloud.icpd.v1.model.GetMeOptions;
import com.ibm.cloud.icpd.v1.model.GetMeResponse;
import com.ibm.cloud.icpd.v1.model.GetPermissionsResponse;
import com.ibm.cloud.icpd.v1.model.GetRoleOptions;
import com.ibm.cloud.icpd.v1.model.GetRoleResponse;
import com.ibm.cloud.icpd.v1.model.GetUserOptions;
import com.ibm.cloud.icpd.v1.model.GetUserResponse;
import com.ibm.cloud.icpd.v1.model.LoginResponse;
import com.ibm.cloud.icpd.v1.model.SuccessResponse;
import com.ibm.cloud.icpd.v1.model.UpdateMeOptions;
import com.ibm.cloud.icpd.v1.model.UpdateRoleOptions;
import com.ibm.cloud.icpd.v1.model.UpdateUserOptions;

public class IcpdServiceIT {
    private Icpd service;

    @BeforeClass
    public void setUp() {
        String bearerToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwic3ViIjoiYWRtaW4iLCJpc3MiOiJLTk9YU1NPIiwiYXVkIjoiRFNYIiwicm9sZSI6IkFkbWluIiwicGVybWlzc2lvbnMiOlsiYWRtaW5pc3RyYXRvciIsIm1hbmFnZV9jYXRhbG9nIiwiYWNjZXNzX2NhdGFsb2ciLCJtYW5hZ2VfcG9saWNpZXMiLCJhY2Nlc3NfcG9saWNpZXMiLCJ2aXJ0dWFsaXplX3RyYW5zZm9ybSIsImNhbl9wcm92aXNpb24iLCJkZXBsb3ltZW50X2FkbWluIl0sInVpZCI6Ijk5OSIsImF1dGhlbnRpY2F0b3IiOiJkZWZhdWx0IiwiZGlzcGxheV9uYW1lIjoiYWRtaW4iLCJpYXQiOjE1Njk0NDQzOTgsImV4cCI6MTU2OTQ4NzU5OH0.XGMbC5H5qOLnNLvJJr_hNHWwOymExwA0iLs3llG8RrwuqKjqZhCOMe02w0HG4Ynii1C5B4hrn1Cy8fUy7CTWKWU_HuwACNNqb3u8obWCRey7V9YWz2x7hh_YgFHkv1FfQ7IaQMBi040pbNt9lUhwGHEdXpOJQLXmnVZinAdKiXeags5BaMT2JYOqEN30W8EIvow9bB0GdXTnHofApMB_Bx8EN_0jvjZAJ8JQxz46dKk6R1v0kpTOOIAoleBf0PGlSQbf9YXiH2-rVvI4Qt9_qPF3EF2nFXnKaTOZ5kGmBdQF809ZM30BnkSGAxCsm5ESbtmVD1NBfsJDfkpkc2GNsg";
        BearerTokenAuthenticator authenticator = new BearerTokenAuthenticator(bearerToken);
        // GetAuthorizationTokenOptions tOptions = new GetAuthorizationTokenOptions.Builder()
        // .username("admin")
        // .password("password")
        // .build();
        // LoginResponse lResponse = service.getAuthorizationToken(tOptions).execute().getResult();
        // BearerTokenAuthenticator authenticator = new BearerTokenAuthenticator(lResponse.getToken());

        service = new Icpd(authenticator);
        HttpConfigOptions options = new HttpConfigOptions.Builder()
        .disableSslVerification(true)
        .build();
        service.configureClient(options);
    }

    @Test
    public void testgetAllUsers() {
        GetAllUsersOptions userOptions = new GetAllUsersOptions.Builder().build();
        GetAllUsersResponse usersResponse = service.getAllUsers(userOptions).execute().getResult();
        assertNotNull(usersResponse);
        assertFalse(usersResponse.getUsersInfo().isEmpty());
    }

    @Test
    public void testCreateuser() {
        CreateUserOptions createOptions = new CreateUserOptions.Builder()
        .displayName("automation")
        .email("automation@gmail.com")
        .userName("automation")
        .userRoles(Arrays.asList("Data Engineer"))
        .build();
        CreateUserSuccessResponse createResponse = service.createUser(createOptions).execute().getResult();
        assertNotNull(createResponse);
        assertTrue(createResponse.getMessageCode().equals("200"));
    }

    @Test
    public void testGetUserInfo() {
        GetUserOptions gOptions = new GetUserOptions.Builder()
        .userName("automation")
        .build();
        GetUserResponse gResponse = service.getUser(gOptions).execute().getResult();
        assertNotNull(gResponse);
        assertTrue(gResponse.getMessageCode().equals("200"));
    }

    @Test
    public void testUpdateUser() {
        UpdateUserOptions.Builder updaBuilder = new UpdateUserOptions.Builder("automation");
        updaBuilder.addUserRoles("Data Engineer");
        SuccessResponse response = service.updateUser(updaBuilder.build()).execute().getResult();
        assertNotNull(response);
        assertTrue(response.getMessageCode().equals("201"));
    }

    @Test
    public void testDeleteUser() {
        DeleteUserOptions dOptions = new DeleteUserOptions.Builder()
        .userName("automation")
        .build();
        SuccessResponse response = service.deleteUser(dOptions).execute().getResult();
        assertNotNull(response);
        assertTrue(response.getMessageCode().equals("200"));
    }
    // Account Management
    @Test
    public void testChangePassword() {
        ChangePasswordOptions cOptions = new ChangePasswordOptions.Builder()
        .password("password1")
        .build();
        SuccessResponse sResponse = service.changePassword(cOptions).execute().getResult();
        assertNotNull(sResponse);
        assertTrue(sResponse.getMessageCode().equals("200"));
    }
    @Test
    public void testGetAccountInfo() {
        GetMeOptions getMeOptions = new GetMeOptions.Builder().build();
        GetMeResponse getMeResponse = service.getMe(getMeOptions).execute().getResult();
        assertNotNull(getMeResponse);
        assertTrue(getMeResponse.getMessageCode().equals("200"));
    }
    @Test
    public void testUpdateAccountInfo() {
        UpdateMeOptions.Builder uBuilder = new UpdateMeOptions.Builder()
        .displayName("automation");
        uBuilder.email("auto@gmail.com");
        SuccessResponse successResponse = service.updateMe(uBuilder.build()).execute().getResult();
        assertNotNull(successResponse);
        assertTrue(successResponse.getMessageCode().equals("201"));
    }
    // Role Management
    @Test
    public void testListAllRoles() {
        GetAllRolesOptions gOptions = new GetAllRolesOptions.Builder().build();
        GetAllRolesResponse gResponse = service.getAllRoles(gOptions).execute().getResult();
        assertNotNull(gResponse);
        assertTrue(gResponse.getMessageCode().equals("200"));
    }
    @Test
    public void testCreateRole() {
        // need to know description, permissions and roleName in CreateRoleOptions
        CreateRoleOptions cRoleOptions = new CreateRoleOptions.Builder()
        .description("Business analyst role")
        .permissions(Arrays.asList("access_catalog"))
        .roleName("Business Analyst")
        .build();
        SuccessResponse response = service.createRole(cRoleOptions).execute().getResult();
        assertNotNull(response);
        assertTrue(response.getMessageCode().equals("200"));
    }
    @Test
    public void testListAllPermissions() {
        GetAllPermissionsOptions gOptions = new GetAllPermissionsOptions.Builder().build();
        GetPermissionsResponse gResponse = service.getAllPermissions(gOptions).execute().getResult();
        assertNotNull(gResponse);
        assertTrue(gResponse.getMessageCode().equals("200"));
    }
    @Test
    public void testGetRoleInfo() {
        GetRoleOptions gOptions = new GetRoleOptions.Builder()
        .roleName("Administrator")
        .build();
        GetRoleResponse getRoleResponse = service.getRole(gOptions).execute().getResult();
        assertNotNull(getRoleResponse);
        assertTrue(getRoleResponse.getMessageCode().equals("200"));
    }
    @Test
    public void testUpdateRole() {
        UpdateRoleOptions.Builder uBuilder = new UpdateRoleOptions.Builder()
        .description("Administrator Role")
        .permissions(Arrays.asList("administrator", "deployment_admin"))
        .roleName("Administrator");
        uBuilder.addPermissions("virtualize_transform");
        SuccessResponse sResponse = service.updateRole(uBuilder.build()).execute().getResult();
        assertNotNull(sResponse);
        assertTrue(sResponse.getMessageCode().equals("201"));
    }
    @Test
    public void testDeleteRole() {
        DeleteRoleOptions deleteRoleOptions = new DeleteRoleOptions.Builder()
        .roleName("Administrator")
        .build();
        SuccessResponse sResponse = service.deleteRole(deleteRoleOptions).execute().getResult();
        assertNotNull(sResponse);
        assertTrue(sResponse.getMessageCode().equals("200"));
    }
}