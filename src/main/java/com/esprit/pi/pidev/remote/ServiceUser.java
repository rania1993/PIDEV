package com.esprit.pi.pidev.remote;

import com.esprit.pi.pidev.model.ResObj;
import com.esprit.pi.pidev.model.User;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by MBM info on 23/11/2017.
 */

public interface ServiceUser {
    @GET("{email}/{password}")
    Call<ResObj> login(@Path("email") String email, @Path("password") String password);

    @GET("getusers")
    Call<List<User>> getUsers();

    @POST("add")
    Call<User> addUser(@Body User user);

    @PUT("update")
    Call<User> updateuser(@Body User user);

    @DELETE("delete/{id}")
    Call<User> deleteUser(@Path("id") int id);
}
