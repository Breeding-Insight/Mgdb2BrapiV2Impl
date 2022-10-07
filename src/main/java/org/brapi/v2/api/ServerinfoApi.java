/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.brapi.v2.api;

import javax.validation.Valid;

import org.brapi.v2.model.CallsResponse;
import org.brapi.v2.model.ContentTypes;
import org.springframework.http.ResponseEntity;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T14:22:13.640Z[GMT]")
@Api(value = "serverinfo", description = "the serverinfo API", tags={ "Server info", })
public interface ServerinfoApi {
	
	public static final String serverinfoGet_url = "serverinfo";
	String URL_BASE_PREFIX = "/brapi/v2";

    @ApiOperation(value = "Returns the list of implemented Calls", nickname = "serverinfoGet", notes = "Implementation Notes  Having a consistent structure for the path string of each call is very  important for teams to be able to connect and find errors. Read more on Github.  Here are the rules for the path of each call that should be returned  Every word in the call path should match the documentation exactly, both in  spelling and capitalization. Note that path strings are all lower case, but  path parameters are camel case.  Each path should start relative to \\\"/\\\" and therefore should not include \\\"/\\\"  No leading or trailing slashes (\\\"/\\\")   Path parameters are wrapped in curly braces (\\\"{}\\\"). The name of the path parameter  should be spelled exactly as it is specified in the documentation.  Examples   GOOD   \"call\": \"germplasm/{germplasmDbId}/pedigree\"   BAD    \"call\": \"germplasm/{id}/pedigree\"  BAD    \"call\": \"germplasm/{germplasmdbid}/pedigree\"   BAD    \"call\": \"brapi/v2/germplasm/{germplasmDbId}/pedigree\"   BAD    \"call\": \"/germplasm/{germplasmDbId}/pedigree/\"   BAD    \"call\": \"germplasm/<germplasmDbId>/pedigree\"", response = CallsResponse.class
    	, authorizations = { @Authorization(value = "AuthorizationToken") }, tags={ "Server info", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CallsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/" + serverinfoGet_url,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CallsResponse> serverinfoGet(@ApiParam(value = "The data format supported by the calls.") @Valid @RequestParam(value = "dataType", required = false) ContentTypes dataType, @ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);

}
