/*
 * directus.io
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.directus.client.ApiException;
import io.directus.client.model.GetPreferences;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PreferencesApi
 */
@Ignore
public class PreferencesApiTest {

    private final PreferencesApi api = new PreferencesApi();

    
    /**
     * Returns table preferences
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPreferencesTest() throws ApiException {
        String tableId = null;
        GetPreferences response = api.getPreferences(tableId);

        // TODO: test validations
    }
    
    /**
     * Update table preferences
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePreferencesTest() throws ApiException {
        String tableId = null;
        String id = null;
        String tableName = null;
        String columnsVisible = null;
        Integer sort = null;
        String sortOrder = null;
        String status = null;
        api.updatePreferences(tableId, id, tableName, columnsVisible, sort, sortOrder, status);

        // TODO: test validations
    }
    
}
