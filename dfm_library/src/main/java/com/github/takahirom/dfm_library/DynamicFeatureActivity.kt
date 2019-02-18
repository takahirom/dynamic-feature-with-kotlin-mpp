package com.github.takahirom.dfm_library

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DynamicFeatureActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_dynamic_feature)
  }

  companion object {
    fun start(context: Context){
      context.startActivity(Intent(context, DynamicFeatureActivity::class.java))
    }
  }
}
