package com.example.newsewingworkshop.fragments.formuls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.newsewingworkshop.R
import kotlinx.android.synthetic.main.fragment_polu_solnce.*
import kotlinx.android.synthetic.main.fragment_vitochka.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [VitochkaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VitochkaFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_vitochka, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btResultVitochka.setOnClickListener {
            if (etPg1Vitochka.text.toString().isNotEmpty() && etPg2Vitochka.text.toString().isNotEmpty()){
                vitochkaPoluobhvat()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
        btResultA4A9contrVitochka.setOnClickListener {
            if (etSg1Vitochka.text.toString().isNotEmpty() && etSg2Vitochka.text.toString().isNotEmpty()){
                vitochkaShirina()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun vitochkaPoluobhvat(){
        val first = etPg1Vitochka.text.toString().toInt()
        val second = etPg2Vitochka.text.toString().toInt()
        val result = 2*(second - first) + 2
        tvVitochka.text = result.toString()
    }

    fun vitochkaShirina(){
        val first = etSg1Vitochka.text.toString().toInt()
        val second = etSg2Vitochka.text.toString().toInt()
        val result = 2*(second - first) + 2
        tvA4A9contrVitochka.text = result.toString()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment VitochkaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            VitochkaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}