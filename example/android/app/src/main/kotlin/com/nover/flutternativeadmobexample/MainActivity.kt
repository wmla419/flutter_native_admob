package com.nover.flutternativeadmobexample

import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {

    companion object {
        const val TEST_DEVICE_ID = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val configuration = RequestConfiguration.Builder()
            .setTestDeviceIds(listOf(TEST_DEVICE_ID)).build()
        MobileAds.setRequestConfiguration(configuration)
    }
}