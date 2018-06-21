package py.com.softcoding.softcodingapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import py.com.softcoding.softcodingapp.R
import py.com.softcoding.softcodingapp.common.BaseFragment

class PaymentsFragment : BaseFragment() {
    companion object {
        fun newInstance() : PaymentsFragment = PaymentsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_payments, container, false)
    }
}