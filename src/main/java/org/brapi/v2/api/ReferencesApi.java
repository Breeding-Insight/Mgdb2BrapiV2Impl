/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.brapi.v2.api;

import io.swagger.annotations.*;

import org.brapi.v2.model.ReferenceBasesResponse;
import org.brapi.v2.model.ReferenceListResponse;
import org.brapi.v2.model.ReferenceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T12:30:12.318Z[GMT]")
@Api(value = "references", description = "the references API")
public interface ReferencesApi {

//    @ApiOperation(value = "Gets a filtered list of `Reference` objects.", nickname = "referencesGet", notes = "`GET /references` will return a filtered list of `Reference` JSON objects.", response = ReferenceListResponse.class, authorizations = {
//        @Authorization(value = "AuthorizationToken")    }, tags={ "References", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "A successful response.", response = ReferenceListResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
//    @RequestMapping(value = CallsApi.URL_BASE_PREFIX + "/references",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<ReferenceListResponse> referencesGet(@ApiParam(value = "The ID of the `Refernce` to be retrieved.") @Valid @RequestParam(value = "referenceDbId", required = false) String referenceDbId,@ApiParam(value = "The ID of the `RefernceSet` to be retrieved.") @Valid @RequestParam(value = "referenceSetDbId", required = false) String referenceSetDbId,@ApiParam(value = "If unset, return the reference sets for which the `accession` matches this string (case-sensitive, exact match).") @Valid @RequestParam(value = "accession", required = false) String accession,@ApiParam(value = "If specified, return the references for which the `md5checksum` matches this string (case-sensitive, exact match). See `Reference::md5checksum` for details.") @Valid @RequestParam(value = "md5checksum", required = false) String md5checksum,@ApiParam(value = "If the reference is derived from a source sequence") @Valid @RequestParam(value = "isDerived", required = false) Boolean isDerived,@ApiParam(value = "The minimum length of the reference sequences to be retrieved.") @Valid @RequestParam(value = "minLength", required = false) Integer minLength,@ApiParam(value = "The maximum length of the reference sequences to be retrieved.") @Valid @RequestParam(value = "maxLength", required = false) Integer maxLength,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);
//
//
//    @ApiOperation(value = "Lists `Reference` bases by ID and optional range.", nickname = "referencesReferenceDbIdBasesGet", notes = "`POST /listreferencebases` will return a JSON version of `ListReferenceBasesResponse`.", response = ReferenceBasesResponse.class, authorizations = {
//        @Authorization(value = "AuthorizationToken")    }, tags={ "References", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "A successful response.", response = ReferenceBasesResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
//        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
//    @RequestMapping(value = CallsApi.URL_BASE_PREFIX + "/references/{referenceDbId}/bases",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<ReferenceBasesResponse> referencesReferenceDbIdBasesGet(@ApiParam(value = "The ID of the `Reference` to be retrieved.",required=true) @PathVariable("referenceDbId") String referenceDbId,@ApiParam(value = "The start position (0-based) of this query. Defaults to 0. Genomic positions are non-negative integers less than reference length. Requests spanning the join of circular genomes are represented as two requests one on each side of the join (position 0).") @Valid @RequestParam(value = "start", required = false) Long start,@ApiParam(value = "The end position (0-based, exclusive) of this query. Defaults to the length of this `Reference`.") @Valid @RequestParam(value = "end", required = false) Long end,@ApiParam(value = "The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `next_page_token` from the previous response.") @Valid @RequestParam(value = "pageToken", required = false) String pageToken,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);
//
//
//    @ApiOperation(value = "Gets a `Reference` by ID.", nickname = "referencesReferenceDbIdGet", notes = "`GET /references/{reference_id}` will return a JSON version of `Reference`.", response = ReferenceResponse.class, authorizations = {
//        @Authorization(value = "AuthorizationToken")    }, tags={ "References", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "A successful response.", response = ReferenceResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
//        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
//    @RequestMapping(value = CallsApi.URL_BASE_PREFIX + "/references/{referenceDbId}",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<ReferenceResponse> referencesReferenceDbIdGet(@ApiParam(value = "The ID of the `Reference` to be retrieved.",required=true) @PathVariable("referenceDbId") String referenceDbId);

}