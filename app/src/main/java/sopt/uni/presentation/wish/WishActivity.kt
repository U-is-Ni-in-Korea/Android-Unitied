package sopt.uni.presentation.wish

import android.os.Bundle
import androidx.fragment.app.Fragment
import sopt.uni.R
import sopt.uni.databinding.ActivityWishBinding
import sopt.uni.util.binding.BindingActivity

class WishActivity : BindingActivity<ActivityWishBinding>(R.layout.activity_wish) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fcv_wish)
        if (currentFragment == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fcv_wish, WishMyWishFragment()).commit()
        }

        with(binding) {
            tvWishMyWish.setOnClickListener() {
                tvWishMyWish.setTextColor(resources.getColor(R.color.Lightblue_600))
                tvWishYourWish.setTextColor(resources.getColor(R.color.Gray_300))
                tvWishMyWish.setTextAppearance(R.style.Subtitle)
                tvWishYourWish.setTextAppearance(R.style.Body1_Regular)
                changeFragment(WishMyWishFragment())
            }
            tvWishYourWish.setOnClickListener() {
                tvWishMyWish.setTextColor(resources.getColor(R.color.Gray_300))
                tvWishYourWish.setTextColor(resources.getColor(R.color.Lightblue_600))
                tvWishMyWish.setTextAppearance(R.style.Body1_Regular)
                tvWishYourWish.setTextAppearance(R.style.Subtitle)
                changeFragment(WishYourWishFragment())
            }
        }
    }

    private fun initRecyclerView() {
        multiviewAdapter = WishMultiviewAdapter(this) {
            val intent = Intent(this, WishFcActivity::class.java)
            startActivity(intent)
        }

        binding.rvWish.adapter = multiviewAdapter

        binding.rvWish.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = multiviewAdapter
        }

        datas.apply {
            add(WishMultiData(MULTI_TYPE_WISH1, null, null, "green"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
            add(WishMultiData(MULTI_TYPE_WISH2, image = R.drawable.ic_apple, "맥북 사주기", "blue"))
        }
        multiviewAdapter.submitData(datas)
        updateRecyclerViewVisibility()
    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv_wish, fragment).commit()
    }
}
