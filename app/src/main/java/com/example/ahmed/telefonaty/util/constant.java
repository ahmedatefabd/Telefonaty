package com.example.ahmed.telefonaty.util;

/**
 * Created by ahmed on 1/4/2018.
 */

public interface constant {

    interface Api {

        // for (FastNetwark) --> (JsonObject)_____(JsonArray)____(Links)

        String BASE_URL = "https://fonoapi.freshpixl.com/v1/getlatest";

        // addQueryParameter (key , value)
        String TOKEN_NAME = "token";  // Keys
        String TOKEN_VALUE = "48b206fc6281514aebc68251157ff493a58c8f62e170f02c";  // Values

        // addQueryParameter (key , value)
        String BRAND_KEY_NOKIA = "brand"; // Key (brand type) --> nokia
        String BRAND_VALUE_NOKIA = "Nokia";// Value  (brand type) --> nokia

        // // addQueryParameter (key , value)
        String BRAND_KEY_SONY = "brand"; // Key (brand type) --> sony
        String BRAND_VALUE_SONY = "sony"; // Value  (brand type) --> sony
    }


    interface EXTRA {

        // Keys ---> (PutExtra) --> (intent)

        String RESOLUTION = "resolution" ;
        String FEATURES = "features" ;
        String BATTERY = "battery" ;
        String SPEED = "speed" ;
        String STATUS = "status" ;
        String COLOR = "colors" ;
        String SIZE = "size" ;
        String SENSORE = "sensors" ;
        String BLUETOOTH = "bluetooth" ;
        String PRICE = "price" ;


        String MOVIE = "movie" ; // Key-->(PutExtra)-->(intent)---> Value of the key (Object -----> class_movie)
    }
}
