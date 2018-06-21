package py.com.softcoding.softcodingapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import kotlinx.android.synthetic.main.activity_home.*
import py.com.softcoding.softcodingapp.common.BaseActivity
import py.com.softcoding.softcodingapp.fragments.HomeFragment
import py.com.softcoding.softcodingapp.fragments.PaymentsFragment
import py.com.softcoding.softcodingapp.fragments.SettingsFragment

class HomeActivity : BaseActivity() {
    lateinit var toolbar : ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        toolbar = supportActionBar!!

        navigation.setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.nav_home
    }

    private val OnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                toolbar.title = "Home"
                setFragment(HomeFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_payments -> {
                toolbar.title = "Payments"
                setFragment(PaymentsFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_settings -> {
                toolbar.title = "Settings"
                setFragment(SettingsFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
