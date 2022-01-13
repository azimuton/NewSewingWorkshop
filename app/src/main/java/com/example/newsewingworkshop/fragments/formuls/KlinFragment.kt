package com.example.newsewingworkshop.fragments.formuls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.newsewingworkshop.R
import kotlinx.android.synthetic.main.fragment_klin.*
import kotlinx.android.synthetic.main.fragment_kolokol.*
import kotlinx.android.synthetic.main.fragment_kolokol.etPb


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class KlinFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_klin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btResultT1T2.setOnClickListener {
            if (etOTKlin.text.toString().isNotEmpty() && etN1Klin.text.toString().isNotEmpty() &&
                    etPt.text.toString().isNotEmpty()){
                T1T2()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
        btResultB1B2.setOnClickListener {
            if (etOTB1B2.text.toString().isNotEmpty() && etN2Klin.text.toString().isNotEmpty() &&
                etPb.text.toString().isNotEmpty()){
                B1B2()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun T1T2(){
        val obhvattalii : Int = etOTKlin.text.toString().toInt()
        val pribavka : Int = etPt.text.toString().toInt()
        val n : Int = etN1Klin.text.toString().toInt()
        val result = (obhvattalii + pribavka)/n
        tvT1T2.text = result.toString()
    }

    fun B1B2(){
        val obhvattalii : Int = etOTB1B2.text.toString().toInt()
        val pribavka : Int = etPb.text.toString().toInt()
        val n : Int = etN2Klin.text.toString().toInt()
        val result = (obhvattalii + pribavka)/n
        tvB1B2.text = result.toString()
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            KlinFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}