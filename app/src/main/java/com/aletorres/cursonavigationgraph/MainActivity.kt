    package com.aletorres.cursonavigationgraph

    import android.os.Bundle
    import com.google.android.material.snackbar.Snackbar
    import androidx.appcompat.app.AppCompatActivity
    import androidx.core.view.WindowCompat
    import androidx.navigation.findNavController
    import androidx.navigation.ui.AppBarConfiguration
    import androidx.navigation.ui.navigateUp
    import androidx.navigation.ui.setupActionBarWithNavController
    import android.view.Menu
    import android.view.MenuItem
    import androidx.navigation.NavController
    import androidx.navigation.fragment.NavHostFragment
    import com.aletorres.cursonavigationgraph.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }
    }