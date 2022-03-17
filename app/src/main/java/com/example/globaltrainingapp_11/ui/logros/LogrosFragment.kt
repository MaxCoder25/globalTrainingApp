package com.example.globaltrainingapp_11.ui.logros

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.globaltrainingapp_11.databinding.FragmentLogrosBinding
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.example.globaltrainingapp_11.logica.UsuarioBL
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LogrosFragment : Fragment() {

    private lateinit var logrosViewModel: LogrosViewModel
    private var _binding: FragmentLogrosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        logrosViewModel =
            ViewModelProvider(this).get(LogrosViewModel::class.java)

        _binding = FragmentLogrosBinding.inflate(inflater, container, false)
        val root: View = binding.root



        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                UsuarioBL().getOneUsuario(1)

            }

            binding.TXTPUNTOSVARIABLE.text = items.puntos.toString()
            binding.TXTRUTINASVARIABLE.text = items.rutinasCompletadas.toString()

            val items2 = withContext(Dispatchers.IO) {
                UsuarioBL().getNivelById (items.nivel)

            }



            binding.TXTNIVELLOGROSVARIABLE.text = items2.nivel

            val items3 = withContext(Dispatchers.IO) {
                UsuarioBL().getPremioById (items.premios)

            }


            binding.TXTPREMIOSVARIABLE.text = items3.premio + System.lineSeparator() + System.lineSeparator() + items3.ubicacion
            binding.TXTCODIGOPREMIOVARIABLE .text = items3.codigoRetiro
            Picasso.get().load(items3.img_premio).into(binding.IMGPREMIO)


        }


        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}