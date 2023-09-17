package com.example.odevupschool

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.odevupschool.databinding.FragmentWelcomeInfoScreenBinding

/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeScreen.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeScreen : Fragment() {
    private var _binding: FragmentWelcomeInfoScreenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeInfoScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            val bundle = bundleOf(
                "name" to binding.nameEditText.text.toString(),
            )
            findNavController().navigate(R.id.action_WecomeScreen_to_InfoScreen, bundle)
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment UserInfoScreen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WelcomeScreen().apply {
                arguments = Bundle().apply {

                }
            }
    }
}