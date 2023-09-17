package com.example.odevupschool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odevupschool.databinding.FragmentResultScreenBinding


class ResultScreen : Fragment() {

    private var _binding: FragmentResultScreenBinding? = null

    private val binding get() = _binding!!


    lateinit var userData: UserData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val data = arguments?.getParcelable<UserData>("userData")

        binding.phone.text = "Telefon: " + data?.phone
        binding.email.text = "Email: " + data?.email
        binding.name.text = "Ad: " + data?.name
        binding.experince.text = "Deneyim: " + data?.experience
        binding.city.text = "Şehir: " + data?.city
        binding.workStatus.text = "İş durumu: " + data?.workStatus

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ResultScreen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ResultScreen().apply {
                arguments = Bundle().apply {

                }
            }
    }
}