package sopt.uni.presentation

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sopt.uni.R
import sopt.uni.databinding.ActivitySplashBinding
import sopt.uni.util.binding.BindingActivity
import sopt.uni.util.extension.startActivity

class SplashActivity : BindingActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        lifecycleScope.launch {
            delay(2000)
            startActivity<MainActivity>()
            overridePendingTransition(0, 0)
            finish()
        }
    }
}
