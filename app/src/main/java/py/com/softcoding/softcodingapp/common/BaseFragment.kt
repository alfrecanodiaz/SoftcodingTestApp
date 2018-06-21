package py.com.softcoding.softcodingapp.common

import android.support.v4.app.Fragment

abstract class BaseFragment : Fragment() {

    fun getName() : String {
        return this.javaClass.name
    }
}