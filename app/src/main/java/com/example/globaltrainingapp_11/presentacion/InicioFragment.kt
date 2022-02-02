package com.example.globaltrainingapp_11.presentacion

import android.app.FragmentTransaction
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.R

import com.example.globaltrainingapp_11.databinding.FragmentInicioBinding

class InicioFragment: Fragment() {

    private lateinit var binding: FragmentInicioBinding
    private var lstFragments = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInicioBinding.inflate(inflater, container, false)


        /*
        val lstNews = NoticiasBL().getNewsList()
        binding.listRecyclerView.adapter =
            NewsAdapter(lstNews, { news -> ItemClickOnRecycledView(news) })
        binding.listRecyclerView.layoutManager =
            LinearLayoutManager(binding.listRecyclerView.context)


        return binding.root
    }

    fun ItemClickOnRecycledView(news: News) {
        Toast.makeText(binding.listRecyclerView.context, news.title, Toast.LENGTH_SHORT).show()
    }

*/

//pasar a otro fragment o activity?
      /*  binding.btnAdelante.setOnClickListener()
        {
          //  FragmentTransaction trans = getFragmentManager().beginTransaction();

           // loadFragment(EjerciciosFragment())
            lstFragments.add(R.id.itRutinas)


            //Intent intent = new Intent(this,NombreSegundaActividad.class);
           // startActivity(intent);

            //  var intent = Intent(this,MainActivity::class.java)
          //  startActivity(intent)

           // var   intent =  Intent(this,EntrenamientoActivity.class)
            // getActivity().startActivity(intent);
          //  startActivity(intent)
        }
*/
        binding.btnAdelante.setOnClickListener() {
            val fragment2 = EjerciciosFragment()
            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.FrameLayout, fragment2)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

           lstFragments.add(R.id.itEjercicios)

        }

        return binding.root


    }

   /* private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(binding.FrameLayout.id, fragment)
            addToBackStack(null)
        }.commit()
    }*/


   /* private fun loadFragment(fragment:Fragment) {
        val supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }*/


    /*override fun onBackPressed() {
        super.onBackPressed()
        if (lstFragments.isNotEmpty()) {
            lstFragments.removeLast()
            binding.bottomNavView.menu.findItem(lstFragments.last()).setChecked(true)
        }
    }*/
}