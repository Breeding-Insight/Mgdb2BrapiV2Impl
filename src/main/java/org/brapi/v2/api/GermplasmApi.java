/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.brapi.v2.api;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.brapi.v2.model.GermplasmListResponse;
import org.brapi.v2.model.GermplasmSearchRequest;
import org.brapi.v2.model.SuccessfulSearchResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-22T14:25:44.495Z[GMT]")
@Api(value = "germplasm", description = "the germplasm API", tags={ "Germplasm" })
public interface GermplasmApi {

    public static final String searchGermplasmPost_url = "search/germplasm";
    
    @ApiOperation(value = "Returns a filtered list of `Germplasm` objects", nickname = "searchGermplasmPost", notes = "Returns a filtered list of `Germplasm` objects. Either a single studyDbId or a list of germplasmDbIds must be specified", response = SuccessfulSearchResponse.class, authorizations = {
            @Authorization(value = "AuthorizationToken")    }, tags={ "Germplasm" })
        @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK", response = SuccessfulSearchResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
            @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
        @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/" + searchGermplasmPost_url,
            produces = { "application/json" }, 
            consumes = { "application/json" },
            method = RequestMethod.POST)
        ResponseEntity<GermplasmListResponse> searchGermplasmPost(HttpServletResponse response, @ApiParam @Valid @RequestBody GermplasmSearchRequest body, @ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws Exception;

}