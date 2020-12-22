/*
 * ModMappings API
 * This is the api for ModMappings. It is currently in development and in an alpha stage.
 *
 * The version of the OpenAPI document: 0.0.0-Dev
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.modmappings.webapi.api;

import org.modmappings.webapi.invoker.ApiCallback;
import org.modmappings.webapi.invoker.ApiClient;
import org.modmappings.webapi.invoker.ApiException;
import org.modmappings.webapi.invoker.ApiResponse;
import org.modmappings.webapi.invoker.Configuration;
import org.modmappings.webapi.invoker.Pair;
import org.modmappings.webapi.invoker.ProgressRequestBody;
import org.modmappings.webapi.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.modmappings.webapi.model.MappingType;
import org.modmappings.webapi.model.PageMappingType;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingTypesApi {
    private ApiClient localVarApiClient;

    public MappingTypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MappingTypesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getMappingTypeById
     * @param id The id of the mapping type to look up. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type with the given id could be found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns the mapping type with the given id. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMappingTypeByIdCall(UUID id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/types/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMappingTypeByIdValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMappingTypeById(Async)");
        }
        

        okhttp3.Call localVarCall = getMappingTypeByIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * Looks up a mapping type using a given id.
     * 
     * @param id The id of the mapping type to look up. (required)
     * @return MappingType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type with the given id could be found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns the mapping type with the given id. </td><td>  -  </td></tr>
     </table>
     */
    public MappingType getMappingTypeById(UUID id) throws ApiException {
        ApiResponse<MappingType> localVarResp = getMappingTypeByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Looks up a mapping type using a given id.
     * 
     * @param id The id of the mapping type to look up. (required)
     * @return ApiResponse&lt;MappingType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type with the given id could be found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns the mapping type with the given id. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MappingType> getMappingTypeByIdWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getMappingTypeByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<MappingType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Looks up a mapping type using a given id. (asynchronously)
     * 
     * @param id The id of the mapping type to look up. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type with the given id could be found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns the mapping type with the given id. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMappingTypeByIdAsync(UUID id, final ApiCallback<MappingType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMappingTypeByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<MappingType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMappingTypesBySearchCriteria
     * @param name The regular expression to match the name of the mapping type against. (optional)
     * @param editable Indicator if filtering on editable is needed or not. Leave the parameter out if you do not care for filtering on editable. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mapping types in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMappingTypesBySearchCriteriaCall(String name, Boolean editable, Integer page, Integer size, List<String> sort, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (editable != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("editable", editable));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (sort != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sort", sort));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMappingTypesBySearchCriteriaValidateBeforeCall(String name, Boolean editable, Integer page, Integer size, List<String> sort, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getMappingTypesBySearchCriteriaCall(name, editable, page, size, sort, _callback);
        return localVarCall;

    }

    /**
     * Gets all known mapping types and finds the ones that match the given parameters.
     * 
     * @param name The regular expression to match the name of the mapping type against. (optional)
     * @param editable Indicator if filtering on editable is needed or not. Leave the parameter out if you do not care for filtering on editable. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return PageMappingType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mapping types in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public PageMappingType getMappingTypesBySearchCriteria(String name, Boolean editable, Integer page, Integer size, List<String> sort) throws ApiException {
        ApiResponse<PageMappingType> localVarResp = getMappingTypesBySearchCriteriaWithHttpInfo(name, editable, page, size, sort);
        return localVarResp.getData();
    }

    /**
     * Gets all known mapping types and finds the ones that match the given parameters.
     * 
     * @param name The regular expression to match the name of the mapping type against. (optional)
     * @param editable Indicator if filtering on editable is needed or not. Leave the parameter out if you do not care for filtering on editable. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return ApiResponse&lt;PageMappingType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mapping types in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageMappingType> getMappingTypesBySearchCriteriaWithHttpInfo(String name, Boolean editable, Integer page, Integer size, List<String> sort) throws ApiException {
        okhttp3.Call localVarCall = getMappingTypesBySearchCriteriaValidateBeforeCall(name, editable, page, size, sort, null);
        Type localVarReturnType = new TypeToken<PageMappingType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets all known mapping types and finds the ones that match the given parameters. (asynchronously)
     * 
     * @param name The regular expression to match the name of the mapping type against. (optional)
     * @param editable Indicator if filtering on editable is needed or not. Leave the parameter out if you do not care for filtering on editable. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping type exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mapping types in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMappingTypesBySearchCriteriaAsync(String name, Boolean editable, Integer page, Integer size, List<String> sort, final ApiCallback<PageMappingType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMappingTypesBySearchCriteriaValidateBeforeCall(name, editable, page, size, sort, _callback);
        Type localVarReturnType = new TypeToken<PageMappingType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
