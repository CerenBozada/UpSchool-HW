package com.example.odevupschool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odevupschool.databinding.FragmentCustomQuestionsScreenBinding

class CustomQuestionsScreen : Fragment() {
    private var _binding: FragmentCustomQuestionsScreenBinding? = null

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
        _binding = FragmentCustomQuestionsScreenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        binding.saveButton.setOnClickListener {
            val userData = UserData(
                name = arguments?.getString("name"),
                email = arguments?.getString("email"),
                phone = arguments?.getString("phone"),
                experience = binding.experienceEditText.text.toString(),
                city = binding.cityEditText.text.toString(),
                workStatus = binding.workEditText.text.toString()
            )




            val bundle = Bundle()

            bundle.putParcelable("userData", userData)


            findNavController().navigate(R.id.action_CustomQuestionsScreen_to_ResultScreen, bundle)
        }




    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CustomQuestionsScreen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CustomQuestionsScreen().apply {
                arguments = Bundle().apply {

                }
            }
    }
}