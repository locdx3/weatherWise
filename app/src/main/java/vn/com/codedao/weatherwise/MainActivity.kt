package vn.com.codedao.weatherwise

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import vn.com.codedao.weatherwise.controller.CityListController


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var city = CityListController(applicationContext)
        var fileName = "citylist.json"
        TvThaydoi.text = city.loadJSONFromAsset(fileName)
    }


}
