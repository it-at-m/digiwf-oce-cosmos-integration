package io.muenchendigital.digiwf.ocecosmos.integration.gen.api;

import io.muenchendigital.digiwf.ocecosmos.integration.gen.ApiClient;

import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Userlog;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.WebException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Component("io.muenchendigital.digiwf.ocecosmos.integration.gen.api.UserLogOperationsApi")
public class UserLogOperationsApi {
    private ApiClient apiClient;

    public UserLogOperationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserLogOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Query User logs
     * Returns all user log resources. Filtering, sorting and paging supported. Requires permission &#x27;PERM_IADMINSERVICE_GETLIST, PERM_PLUGIN_USERLOG&#x27;.
     * <p><b>200</b> - All user log resources have been fetched and returned in the response body.
     * <p><b>400</b> - Orderby for attribute message is not supported for databases HSQL and Oracle.
     * @param limit Count of elements to retrieve from the given offset. MUST be used in conjunction with offset. (optional)
     * @param offset Index of the first element to retrieve. MUST be used in conjunction with limit. (optional)
     * @param orderby Sorting order of the queried result set having the following SQL-like syntax : attribute1[.asc|.desc][;attributeN[.asc|.desc]]. Attribute message is not supported for databases HSQL and Oracle. (optional)
     * @param search RSQL filtering search criteria. (optional)
     * @return List&lt;Userlog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Userlog> getUsingGET12(Integer limit, Integer offset, String orderby, String search) throws RestClientException {
        return getUsingGET12WithHttpInfo(limit, offset, orderby, search).getBody();
    }

    /**
     * Query User logs
     * Returns all user log resources. Filtering, sorting and paging supported. Requires permission &#x27;PERM_IADMINSERVICE_GETLIST, PERM_PLUGIN_USERLOG&#x27;.
     * <p><b>200</b> - All user log resources have been fetched and returned in the response body.
     * <p><b>400</b> - Orderby for attribute message is not supported for databases HSQL and Oracle.
     * @param limit Count of elements to retrieve from the given offset. MUST be used in conjunction with offset. (optional)
     * @param offset Index of the first element to retrieve. MUST be used in conjunction with limit. (optional)
     * @param orderby Sorting order of the queried result set having the following SQL-like syntax : attribute1[.asc|.desc][;attributeN[.asc|.desc]]. Attribute message is not supported for databases HSQL and Oracle. (optional)
     * @param search RSQL filtering search criteria. (optional)
     * @return ResponseEntity&lt;List&lt;Userlog&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Userlog>> getUsingGET12WithHttpInfo(Integer limit, Integer offset, String orderby, String search) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/webapi/v3/userlogs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderby", orderby));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2schema" };

        ParameterizedTypeReference<List<Userlog>> returnType = new ParameterizedTypeReference<List<Userlog>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve one given user log
     * Returns the user log resource matching provided id. Requires permission &#x27;PERM_IADMINSERVICE_GETOBJECT, PERM_PLUGIN_USERLOG&#x27;.
     * <p><b>200</b> - The requested user log resource has been found and returned in the response body.
     * @param id id of the user log resource to retrieve (required)
     * @return Userlog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Userlog getUsingGET13(Long id) throws RestClientException {
        return getUsingGET13WithHttpInfo(id).getBody();
    }

    /**
     * Retrieve one given user log
     * Returns the user log resource matching provided id. Requires permission &#x27;PERM_IADMINSERVICE_GETOBJECT, PERM_PLUGIN_USERLOG&#x27;.
     * <p><b>200</b> - The requested user log resource has been found and returned in the response body.
     * @param id id of the user log resource to retrieve (required)
     * @return ResponseEntity&lt;Userlog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Userlog> getUsingGET13WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getUsingGET13");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/webapi/v3/userlogs/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2schema" };

        ParameterizedTypeReference<Userlog> returnType = new ParameterizedTypeReference<Userlog>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create one user log
     * Create a new user log resource. Requires COSMOS permission &#x27;PERM_IADMINSERVICE_ADDOBJECTID, PERM_PLUGIN_USERLOG&#x27;.
     * <p><b>201</b> - A new user log resource has been created.
     * @param body the representation of the user log entry to create (required)
     * @return Userlog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Userlog postUsingPOST8(Userlog body) throws RestClientException {
        return postUsingPOST8WithHttpInfo(body).getBody();
    }

    /**
     * Create one user log
     * Create a new user log resource. Requires COSMOS permission &#x27;PERM_IADMINSERVICE_ADDOBJECTID, PERM_PLUGIN_USERLOG&#x27;.
     * <p><b>201</b> - A new user log resource has been created.
     * @param body the representation of the user log entry to create (required)
     * @return ResponseEntity&lt;Userlog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Userlog> postUsingPOST8WithHttpInfo(Userlog body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUsingPOST8");
        }
        String path = UriComponentsBuilder.fromPath("/webapi/v3/userlogs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2schema" };

        ParameterizedTypeReference<Userlog> returnType = new ParameterizedTypeReference<Userlog>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
