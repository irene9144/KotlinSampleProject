package com.example.firstexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.firstexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        enableEdgeToEdge()
        setContentView(view)
        binding.button1.setOnClickListener {
            binding.name.setText("Fragment changed")
            setFragment()
        }
        binding.navigationBar.setupWithNavController(binding.container.getFragment<NavHostFragment>().navController)
        //setupActionBarWithNavController(binding.container.getFragment<NavHostFragment>().navController)

    }
    private fun setFragment() {
//        var transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.frameLayout, MainFragment())
//        transaction.addToBackStack(null)
//        transaction.commit()
    }
//
//    override fun onSupportNavigateUp(): Boolean {
////        return super.onSupportNavigateUp()
//        return binding.container.getFragment<NavHostFragment>().navController.navigateUp()||super.onSupportNavigateUp()
//    }
}