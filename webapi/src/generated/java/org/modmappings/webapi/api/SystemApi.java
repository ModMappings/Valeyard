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


import org.modmappings.webapi.model.MappableType;
import org.modmappings.webapi.model.PageDetailedMapping;
import org.modmappings.webapi.model.PageMapping;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemApi {
    private ApiClient localVarApiClient;

    public SystemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getDetailedMappingsBySearchCriteria1
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings, and their metadata, in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDetailedMappingsBySearchCriteria1Call(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/system/mappings/detailed";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (latestOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latestOnly", latestOnly));
        }

        if (versionedMappableId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("versionedMappableId", versionedMappableId));
        }

        if (releaseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("releaseId", releaseId));
        }

        if (mappableType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mappableType", mappableType));
        }

        if (inputRegex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inputRegex", inputRegex));
        }

        if (outputRegex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputRegex", outputRegex));
        }

        if (mappingTypeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mappingTypeId", mappingTypeId));
        }

        if (gameVersionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gameVersionId", gameVersionId));
        }

        if (createdBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("createdBy", createdBy));
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
    private okhttp3.Call getDetailedMappingsBySearchCriteria1ValidateBeforeCall(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getDetailedMappingsBySearchCriteria1Call(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort, _callback);
        return localVarCall;

    }

    /**
     * Gets all known mappings, and their metadata, and finds the ones that match the given parameters.
     * 
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return PageDetailedMapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings, and their metadata, in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public PageDetailedMapping getDetailedMappingsBySearchCriteria1(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort) throws ApiException {
        ApiResponse<PageDetailedMapping> localVarResp = getDetailedMappingsBySearchCriteria1WithHttpInfo(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort);
        return localVarResp.getData();
    }

    /**
     * Gets all known mappings, and their metadata, and finds the ones that match the given parameters.
     * 
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return ApiResponse&lt;PageDetailedMapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings, and their metadata, in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageDetailedMapping> getDetailedMappingsBySearchCriteria1WithHttpInfo(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort) throws ApiException {
        okhttp3.Call localVarCall = getDetailedMappingsBySearchCriteria1ValidateBeforeCall(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort, null);
        Type localVarReturnType = new TypeToken<PageDetailedMapping>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets all known mappings, and their metadata, and finds the ones that match the given parameters. (asynchronously)
     * 
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings, and their metadata, in the database, that match the search criteria. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDetailedMappingsBySearchCriteria1Async(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort, final ApiCallback<PageDetailedMapping> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailedMappingsBySearchCriteria1ValidateBeforeCall(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort, _callback);
        Type localVarReturnType = new TypeToken<PageDetailedMapping>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMappingsBySearchCriteria1
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings in the database, that match the search criteria. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMappingsBySearchCriteria1Call(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/system/mappings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (latestOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latestOnly", latestOnly));
        }

        if (versionedMappableId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("versionedMappableId", versionedMappableId));
        }

        if (releaseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("releaseId", releaseId));
        }

        if (mappableType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mappableType", mappableType));
        }

        if (inputRegex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inputRegex", inputRegex));
        }

        if (outputRegex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputRegex", outputRegex));
        }

        if (mappingTypeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mappingTypeId", mappingTypeId));
        }

        if (gameVersionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gameVersionId", gameVersionId));
        }

        if (createdBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("createdBy", createdBy));
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

        String[] localVarAuthNames = new String[] { "ModMappings auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMappingsBySearchCriteria1ValidateBeforeCall(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getMappingsBySearchCriteria1Call(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort, _callback);
        return localVarCall;

    }

    /**
     * Gets all known mappings and finds the ones that match the given parameters.
     * 
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return PageMapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings in the database, that match the search criteria. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
     </table>
     */
    public PageMapping getMappingsBySearchCriteria1(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort) throws ApiException {
        ApiResponse<PageMapping> localVarResp = getMappingsBySearchCriteria1WithHttpInfo(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort);
        return localVarResp.getData();
    }

    /**
     * Gets all known mappings and finds the ones that match the given parameters.
     * 
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return ApiResponse&lt;PageMapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings in the database, that match the search criteria. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageMapping> getMappingsBySearchCriteria1WithHttpInfo(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort) throws ApiException {
        okhttp3.Call localVarCall = getMappingsBySearchCriteria1ValidateBeforeCall(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort, null);
        Type localVarReturnType = new TypeToken<PageMapping>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets all known mappings and finds the ones that match the given parameters. (asynchronously)
     * 
     * @param latestOnly Indicates if only latest mappings for a given versioned mappable should be taken into account. Defaults to true if not supplied. (optional, default to true)
     * @param versionedMappableId The id of the versioned mappable to filter on. (optional)
     * @param releaseId The id of the release to filter on. (optional)
     * @param mappableType The mappable type to filter on. (optional)
     * @param inputRegex The regular expression to match the input of the mapping against. (optional)
     * @param outputRegex The regular expression to match the output of the mapping against. (optional)
     * @param mappingTypeId The id of the mapping type to filter on. (optional)
     * @param gameVersionId The id of the game version to filter on. (optional)
     * @param createdBy The id of the user who created a mapping to filter on. (optional)
     * @param page Zero-based page index (0..N) (optional)
     * @param size The size of the page to be returned (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> The user is not authorized to perform this action. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Returns all mappings in the database, that match the search criteria. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Indicates that no mapping exists in the database. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMappingsBySearchCriteria1Async(Boolean latestOnly, UUID versionedMappableId, UUID releaseId, MappableType mappableType, String inputRegex, String outputRegex, UUID mappingTypeId, UUID gameVersionId, UUID createdBy, Integer page, Integer size, List<String> sort, final ApiCallback<PageMapping> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMappingsBySearchCriteria1ValidateBeforeCall(latestOnly, versionedMappableId, releaseId, mappableType, inputRegex, outputRegex, mappingTypeId, gameVersionId, createdBy, page, size, sort, _callback);
        Type localVarReturnType = new TypeToken<PageMapping>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
