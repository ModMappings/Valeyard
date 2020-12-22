/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.modmappings.valeyard;

import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.auth.ClientSecretBasic;
import com.nimbusds.oauth2.sdk.auth.Secret;
import com.nimbusds.oauth2.sdk.device.DeviceAuthorizationRequest;
import com.nimbusds.oauth2.sdk.device.DeviceAuthorizationResponse;
import com.nimbusds.oauth2.sdk.device.DeviceAuthorizationSuccessResponse;
import com.nimbusds.oauth2.sdk.device.DeviceCodeGrant;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.http.HTTPResponse;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.token.AccessToken;
import com.nimbusds.oauth2.sdk.token.RefreshToken;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;

public class Bot
{

    public static void main(String[] args) throws URISyntaxException, IOException, ParseException, NoSuchFieldException, IllegalAccessException, InterruptedException
    {
        // Create the device authZ requst and post it to the AS
        URI deviceAuthzURI = new URI("https://dev-auth.ldtteam.com/oauth2/device_authorize");
        ClientID clientID = new ClientID("Z7dY7WuYvx9LOX4dSoifQmEZQf0a");
        ClientSecretBasic secretBasic = new ClientSecretBasic(clientID, new Secret("wFuuAafA_Ze1JAoBYO4PBuEGodwa"));

        HTTPRequest httpRequest = new DeviceAuthorizationRequest.Builder(secretBasic)
                                    .scope(new Scope("email","profile", "name"))
                                    .endpointURI(deviceAuthzURI)
                                    .build()
                                    .toHTTPRequest();

        HTTPResponse httpResponse = httpRequest.send();

// Parse the response
        DeviceAuthorizationResponse deviceResponse = DeviceAuthorizationResponse.parse(httpResponse);

        if (! deviceResponse.indicatesSuccess()) {
            System.out.println("Error: " + deviceResponse.toErrorResponse().getErrorObject());
            return;
        }

        DeviceAuthorizationSuccessResponse successResponse = deviceResponse.toSuccessResponse();

        System.out.println("Device code: " + successResponse.getDeviceCode());
        System.out.println("User code: " + successResponse.getUserCode());
        System.out.println("Link: " + successResponse.getVerificationURIComplete().toString());

        // The token endpoint
        URI tokenEndpoint = new URI("https://dev-auth.ldtteam.com/oauth2/token");

        // Make the token request
        TokenRequest request = new TokenRequest(tokenEndpoint, secretBasic.getClientID(), new DeviceCodeGrant(successResponse.getDeviceCode()));
        TokenResponse tokenResponse = TokenResponse.parse(request.toHTTPRequest().send());

        while(!tokenResponse.indicatesSuccess()) {
            Thread.sleep(successResponse.getInterval() * 1000);
            System.out.println("Failed attempting again");
            request = new TokenRequest(tokenEndpoint, secretBasic.getClientID(), new DeviceCodeGrant(successResponse.getDeviceCode()));
            tokenResponse = TokenResponse.parse(request.toHTTPRequest().send());
        }

        AccessTokenResponse accessTokenResponse = tokenResponse.toSuccessResponse();

// Get the access token, the server may also return a refresh token
        AccessToken accessToken = accessTokenResponse.getTokens().getAccessToken();
        RefreshToken refreshToken = accessTokenResponse.getTokens().getRefreshToken();

        System.out.println(accessToken);
    }
}
