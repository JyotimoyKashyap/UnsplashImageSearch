package com.jyotimoykashyap.unsplashimagesearch.ui.Gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.jyotimoykashyap.unsplashimagesearch.databinding.FragmentGalleryBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class GalleryFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

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
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)

        // customize the toolbar
        customizeToolbar(binding.toolbarGallery)

        binding.progressBar.hide()





        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GalleryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // function to customize the toolbar
    fun customizeToolbar(materialToolbar: MaterialToolbar){

        val radius = 18
        val actionBarBackground = materialToolbar.background as MaterialShapeDrawable

        materialToolbar.elevation = radius.toFloat()

        actionBarBackground.shapeAppearanceModel =
            actionBarBackground.shapeAppearanceModel.toBuilder()
                .setAllCorners(CornerFamily.ROUNDED, radius.toFloat())
                .build()



    }
}