package sopt.uni.presentation.shortgame.missiondetailrecord

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import sopt.uni.R
import sopt.uni.databinding.ActivityMissionDetailRecordBinding
import sopt.uni.presentation.shortgame.missionrecord.MissionRecordActivity
import sopt.uni.util.binding.BindingActivity

class MissionDetailRecordActivity :
    BindingActivity<ActivityMissionDetailRecordBinding>(R.layout.activity_mission_detail_record) {
    private val viewModel: MissionDetailRecordViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.missionDetailReCordViewModel = viewModel
        viewModel.setMissionDetail()
        setClickListener()
    }

    private fun setClickListener() {
        binding.missionDetailRecordBack.setOnClickListener {
            finish()
        }
    }

    companion object {
        const val MISSION_ID = "MISSION_ID"

        fun start(context: Context, missionId: Int?) {
            if (missionId != null)
                context.startActivity(getIntent(context, missionId))
        }

        private fun getIntent(context: Context, missionId: Int) =
            Intent(context, MissionDetailRecordActivity::class.java).apply {
                putExtra(MISSION_ID, missionId)
            }
    }
}
