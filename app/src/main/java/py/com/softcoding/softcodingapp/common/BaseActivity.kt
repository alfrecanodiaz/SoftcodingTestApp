package py.com.softcoding.softcodingapp.common

import android.support.v7.app.AppCompatActivity
import android.support.v4.app.Fragment
import py.com.softcoding.softcodingapp.R

abstract class BaseActivity : AppCompatActivity() {

    fun setFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(fragment.javaClass.name)
                .commit()
    }
}