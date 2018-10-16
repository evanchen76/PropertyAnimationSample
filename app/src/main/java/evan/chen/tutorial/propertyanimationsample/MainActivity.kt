package evan.chen.tutorial.propertyanimationsample

import android.animation.AnimatorInflater
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animAlpha.setOnClickListener {
            startAnimator(R.animator.anim_alpha)
        }

        animColor.setOnClickListener {
            startAnimator(R.animator.anim_color)
        }

        animRotate.setOnClickListener {
            startAnimator(R.animator.anim_rotate)
        }

        animScaleX.setOnClickListener {
            startAnimator(R.animator.anim_scale_x)
        }

        animSet.setOnClickListener {
            startAnimator(R.animator.anim_set)
        }

        animX.setOnClickListener {
            startAnimator(R.animator.anim_x)
        }
    }

    private fun startAnimator(id: Int) {
        AnimatorInflater.loadAnimator(this, id)
                .apply {
                    setTarget(textView)
                    start()
                }
    }
}
