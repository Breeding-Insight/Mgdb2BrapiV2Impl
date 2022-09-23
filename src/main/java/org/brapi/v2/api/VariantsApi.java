/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.brapi.v2.api;


import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.validation.Valid;

import org.brapi.v2.model.CallsListResponse;
import org.brapi.v2.model.SuccessfulSearchResponse;
import org.brapi.v2.model.VariantListResponse;
import org.brapi.v2.model.VariantsSearchRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-22T14:25:44.495Z[GMT]")
@Api(value = "variants", description = "the variants API", tags={ "Variants" })
public interface VariantsApi {
	
	final int MAX_CALL_MATRIX_SIZE = 30000;
	final Integer MAX_SUPPORTED_VARIANT_COUNT_PER_PAGE = 10000;

	public static final String variantsGet_url = "variants";
	public static final String variantsVariantDbIdCallsGet_url = "variants/{variantDbId}/calls";
    public static final String searchVariantsPost_url = "search/variants";
    
    @ApiOperation(value = "Returns a filtered list of `Variant` objects", nickname = "searchVariantsPost", notes = "Returns a filtered list of `Variant` objects. At least a variantDbId, a variantSetDbId, or a referenceDbId must be specified. ** THIS ENDPOINT USES TOKEN BASED PAGING **", response = SuccessfulSearchResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")    }, tags={ "Variants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VariantListResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/" + searchVariantsPost_url,
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<VariantListResponse> searchVariantsPost(@ApiParam @Valid @RequestBody VariantsSearchRequest body, @ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);

    
    @ApiOperation(value = "Gets a filtered list of `Variants`.", notes = "Gets a filtered list of `Variants`.  ** THIS ENDPOINT USES TOKEN BASED PAGING **", authorizations = {
    		@Authorization(value = "AuthorizationToken")    }, tags={ "Variants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VariantListResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/" + variantsGet_url,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VariantListResponse> variantsGet(
    		@ApiParam(value= "The ID of the `Variant` to be retrieved.") @Valid @RequestParam(value = "variantDbId", required = false) String variantDbId,
    		@ApiParam(value= "The ID of the `VariantSet` to be retrieved.") @Valid @RequestParam(value = "variantSetDbId", required = false) String variantSetDbId,
    		@ApiParam(value= "The ID of the `Reference` to be retrieved (this parameter was added for convenience and is not standard in BrAPI v2.0).") @Valid @RequestParam(value = "referenceDbId", required = false) String referenceDbId,
    		@ApiParam(value= "The beginning of the window (0-based, inclusive) for which overlapping variants should be returned (this parameter was added for convenience and is not standard in BrAPI v2.0).") @Valid @RequestParam(value = "start", required = false) Integer start,
    		@ApiParam(value= "The end of the window (0-based, inclusive) for which overlapping variants should be returned (this parameter was added for convenience and is not standard in BrAPI v2.0).") @Valid @RequestParam(value = "end", required = false) Integer end,
    		@ApiParam(value= "Used to request a specific page of data to be returned.  Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively. ") @Valid @RequestParam(value = "pageToken", required = false) String pageToken,
    		@ApiParam(value= "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
    		@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value="Authorization", required=false) String authorization);
    

    @ApiOperation(value = "Gets a list of `Calls` associated with a `Variant`.", notes = "The variant calls for this particular variant. Each one represents the determination of genotype with respect to this variant. `Calls` in this array are implicitly associated with this `Variant`.  ** THIS ENDPOINT USES TOKEN BASED PAGING **", authorizations = {
    		@Authorization(value = "AuthorizationToken")    }, tags={ "Variants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CallsListResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/" + variantsVariantDbIdCallsGet_url,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CallsListResponse> variantsVariantDbIdCallsGet(
    		@ApiParam(value = "The ID of the `Variant` to be retrieved.", required=true) @PathVariable("variantDbId") String variantDbId,
    		@ApiParam(value= "Should homozygotes be expanded (true) or collapsed into a single occurrence (false)") @Valid @RequestParam(value = "expandHomozygotes", required = false) Boolean expandHomozygotes,
    		@ApiParam(value= "The string to use as a representation for missing data") @Valid @RequestParam(value = "unknownString", required = false) String unknownString,
    		@ApiParam(value= "The string to use as a separator for phased allele calls") @Valid @RequestParam(value = "sepPhased", required = false) String sepPhased,
    		@ApiParam(value= "The string to use as a separator for unphased allele calls") @Valid @RequestParam(value = "sepUnphased", required = false) String sepUnphased,
                @ApiParam(value= "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,
    		//@ApiParam(value= "Used to request a specific page of data to be returned.  Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively. ") @Valid @RequestParam(value = "pageToken", required = false) String pageToken, 
                @ApiParam(value= "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
    		@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value="Authorization", required=false) String authorization) throws SocketException, UnknownHostException, UnsupportedEncodingException;


//    @ApiOperation(value = "Gets a `Variant` by ID.", notes = "`GET /variants/{id}` will return a JSON version of `Variant`.", authorizations = {
//    		@Authorization(value = "AuthorizationToken")    }, tags={ "Variants" })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "OK", response = VariantSingleResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
//        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
//    @RequestMapping(value = "/variants/{variantDbId}",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<VariantSingleResponse> variantsVariantDbIdGet(
//    		@ApiParam(value = "The ID of the `Variant` to be retrieved.", required=true) @PathVariable("variantDbId") String variantDbId,
//    		@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value="Authorization", required=false) String authorization);

}

