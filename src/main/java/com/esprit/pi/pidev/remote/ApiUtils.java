package com.esprit.pi.pidev.remote;

/**
 * Created by MBM info on 23/11/2017.
 */

public class ApiUtils {
    public static final String BASE_URL ="http://10.0.2.2:18080/pidevjee-web/rest/users/";
    public static ServiceUser getServiceUser(){
        return RetrofitClient.getClient(BASE_URL).create(ServiceUser.class);
    }
}
