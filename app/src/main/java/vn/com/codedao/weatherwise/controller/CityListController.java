package vn.com.codedao.weatherwise.controller;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Bruce Wayne on 26/10/2017.
 */

public class CityListController {
    Context context;
    public CityListController() {
    }

    public CityListController(Context context) {
        this.context = context;
    }

    public String loadJSONFromAsset(String fileName) {
        String json = null;
        try {
            AssetManager manager = context.getAssets();
            InputStream is = manager.open(fileName);

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
